package subsonic_api.client;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import subsonic_api.model.*;
import subsonic_api.model.Error;

import java.io.InputStream;

/**
 * Created by fxsalazar
 * 07/05/2017.
 */
public class SubsonicApiServiceClient {
    private static final String SERVER_URL = "http://fxsalazar.ddns.net:4040/rest/";
    private final SubsonicApiService service;

    public SubsonicApiServiceClient(String username, String password) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new SubsonicAuthParametersInterceptor(username, password))
                .addInterceptor(logging)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .baseUrl(SERVER_URL)
                .build();

        service = retrofit.create(SubsonicApiService.class);
    }

    public Single<Boolean> pingServer() {
        return callService(service.ping(), new Function<Response, Boolean>() {
            public Boolean apply(Response response) throws Exception {
                return true;
            }
        });
    }

    public Single<License> getLicense() {
        return callService(service.getLicense(), new Function<Response, License>() {
            public License apply(Response response) throws Exception {
                return response.getLicense();
            }
        });
    }

    public Single<User> getUser(String username) {
        return callService(service.getUser(username), new Function<Response, User>() {
            public User apply(Response response) throws Exception {
                return response.getUser();
            }
        });
    }

    public Single<Users> getUsers() {
        return callService(service.getUsers(), new Function<Response, Users>() {
            public Users apply(Response response) throws Exception {
                return response.getUsers();
            }
        });
    }

    public Single<ArtistsID3> getArtists() {
        return callService(service.getArtists(), new Function<Response, ArtistsID3>() {
            public ArtistsID3 apply(Response response) throws Exception {
                return response.getArtists();
            }
        });
    }

    public Single<ArtistWithAlbumsID3> getArtist(int id) {
        return callService(service.getArtist(id), new Function<Response, ArtistWithAlbumsID3>() {
            public ArtistWithAlbumsID3 apply(Response response) throws Exception {
                return response.getArtist();
            }
        });
    }

    public Single<AlbumWithSongsID3> getAlbum(int id) {
        return callService(service.getAlbum(id), new Function<Response, AlbumWithSongsID3>() {
            public AlbumWithSongsID3 apply(Response response) throws Exception {
                return response.getAlbum();
            }
        });
    }

    public Single<Child> getSong(int id) {
        return callService(service.getSong(id), new Function<Response, Child>() {
            public Child apply(Response response) throws Exception {
                return response.getSong();
            }
        });
    }

    public Single<Directory> getMusicDirectory(int id) {
        return callService(service.getMusicDirectory(id), new Function<Response, Directory>() {
            @Override
            public Directory apply(Response response) throws Exception {
                return response.getDirectory();
            }
        });
    }

    public Single<InputStream> getHlsStreamer(int id) {
        return service.getHlsStreamer(id).flatMap(new Function<ResponseBody, SingleSource<? extends InputStream>>() {
            @Override
            public SingleSource<? extends InputStream> apply(ResponseBody responseBody) throws Exception {
                return Single.just(responseBody.source().inputStream());
            }
        });
    }

    private <T> Single<T> callService(Single<Response> license, final Function<Response, T> function) {
        return license.flatMap(new Function<Response, SingleSource<T>>() {
            public SingleSource<T> apply(Response response) throws Exception {
                return createInnerSingle(response, function.apply(response));
            }
        });
    }

    private <T> SingleSource<T> createInnerSingle(Response response, T o) throws Exception {
        if (response.getStatus() == ResponseStatus.failed) {
            Error error = response.getError();
            throw new Exception(error.toString());
        } else {
            return Single.just(o);
        }
    }
}
