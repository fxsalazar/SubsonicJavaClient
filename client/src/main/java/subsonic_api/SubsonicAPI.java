package subsonic_api;


import com.iheartradio.m3u8.*;
import com.iheartradio.m3u8.data.Playlist;
import io.reactivex.functions.BiConsumer;
import subsonic_api.client.SubsonicApiServiceClient;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by fxsalazar
 * 07/05/2017.
 */
public class SubsonicAPI {
    public static void main(String[] args) throws Exception {
        SubsonicApiServiceClient client = new SubsonicApiServiceClient("cary", "cary");


        client.getHlsStreamer(466).subscribe(new BiConsumer<InputStream, Throwable>() {
            @Override
            public void accept(InputStream inputStream, Throwable throwable) {
                notNull(throwable);
                try {
                    PlaylistParser parser = new PlaylistParser(inputStream, Format.EXT_M3U, Encoding.UTF_8);
                    Playlist playlist = null;
                    playlist = parser.parse();
                    System.out.println(playlist.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                } catch (PlaylistException e) {
                    e.printStackTrace();
                }
            }
        });

        //id came from param parent='401' from song object
//        client.getMusicDirectory(401).subscribe(new BiConsumer<Directory, Throwable>() {
//            @Override
//            public void accept(Directory directory, Throwable throwable) throws Exception {
//                notNull(throwable);
//                System.out.println(directory);
//            }
//        });

//        client.getSong(466).subscribe(new BiConsumer<Child, Throwable>() {
//            public void accept(Child child, Throwable throwable) throws Exception {
//                notNull(throwable);
//                System.out.println(child);
////                System.exit(0);
//            }
//        });

//        client.getAlbum(27).subscribe(new BiConsumer<AlbumWithSongsID3, Throwable>() {
//            public void accept(AlbumWithSongsID3 albumWithSongsID3, Throwable throwable) throws Exception {
//                notNull(throwable);
//                System.out.println(albumWithSongsID3);
//                 System.exit(0);
//            }
//        });

//        client.getArtist(18).subscribe(new BiConsumer<ArtistWithAlbumsID3, Throwable>() {
//            public void accept(ArtistWithAlbumsID3 artistWithAlbumsID3, Throwable throwable) throws Exception {
//                notNull(throwable);
//                System.out.println(artistWithAlbumsID3);
//                System.exit(0);
//            }
//        });

//        client.getArtists().subscribe(new BiConsumer<ArtistsID3, Throwable>() {
//            public void accept(ArtistsID3 artistsID3, Throwable throwable) throws Exception {
//                notNull(throwable);
//                System.out.println(artistsID3);
//            }
//        });

//        client.getUsers().subscribe(new BiConsumer<Users, Throwable>() {
//            public void accept(Users user, Throwable throwable) throws Exception {
//                notNull(throwable);
//                System.out.println(user);
//            }
//        });

//        client.getUser("cary").subscribe(new BiConsumer<User, Throwable>() {
//            public void accept(User user, Throwable throwable) throws Exception {
//                notNull(throwable);
//                System.out.println(user);
//            }
//        });

//        client.pingServer().subscribe(new BiConsumer<Object, Throwable>() {
//            public void accept(Object aVoid, Throwable throwable) throws Exception {
//                if (throwable == null) {
//                    System.out.println("good");
//                } else {
//                    System.out.println(throwable);
//                }
//            }
//        });

//        client.getLicense().subscribe(new BiConsumer<License, Throwable>() {
//            public void accept(License license, Throwable throwable) throws Exception {
//                if (throwable == null) {
//                    System.out.println(license);
//                } else {
//                    System.out.println(throwable);
//                }
//                System.exit(0);
//            }
//        });


//        retrofit2.Response<Response> serviceResponse = service.ping().execute();
//        if (serviceResponse.isSuccessful()) {
//            System.out.println(serviceResponse.body());
//        } else {
//            System.out.println(serviceResponse.code() + " " + serviceResponse.message());
//        }


//        retrofit2.Response<Response> licenseResponse = service.getLicense().execute();
//        if (licenseResponse.isSuccessful()) {
//            System.out.println(licenseResponse.body());
//        } else {
//            System.out.println(licenseResponse.code() + " " + licenseResponse.message());
//        }

//        Response call = client.newCall(new Request.Builder().url("http://fxsalazar.ddns.net:4040/rest/getLicense?" +
//                "u=cary&t=27e673448bd419ada160919e8464f9dc&s=c19b2d&v=1.14.0&c=myapp").get().build()).execute();
//        Response l = new Persister().read(Response.class, call.body().byteStream());
//        System.out.println(l);
    }

    private static void notNull(Object obj) {
        if (obj != null) {
            System.out.println(obj);
            System.exit(0);
        }
    }
}
