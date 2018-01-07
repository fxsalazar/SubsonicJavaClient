package subsonic_api.client;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;
import subsonic_api.model.Response;

/**
 * Created by fxsalazar
 * 07/05/2017.
 */
interface SubsonicApiService {
    @GET("ping.view")
    Single<Response> ping();

    @GET("getLicense")
    Single<Response> getLicense();

    @GET("getUser")
    Single<Response> getUser(@Query("username") String username);

    @GET("getUsers")
    Single<Response> getUsers();

    @GET("getArtists")
    Single<Response> getArtists();

    @GET("getGenres")
    Single<Response> getGenres();

    @GET("getSongsByGenre")
    Single<Response> getSongsByGenre(@Query("genre") String genre);

    @GET("getArtist")
    Single<Response> getArtist(@Query("id") int id);

    @GET("getAlbum")
    Single<Response> getAlbum(@Query("id") int id);

    @GET("getSong")
    Single<Response> getSong(@Query("id") int id);

    @GET("getMusicDirectory")
    Single<Response> getMusicDirectory(@Query("id") int id);

    @GET("hls.m3u8")
    Single<ResponseBody> getHlsStreamer(@Query("id") int id);
}
