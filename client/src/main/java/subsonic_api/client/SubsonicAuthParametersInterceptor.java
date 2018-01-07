package subsonic_api.client;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by fxsalazar
 * 07/05/2017.
 */
public class SubsonicAuthParametersInterceptor implements Interceptor {
    private static final String SALT = "cu1o";
    private final String username;
    private final String password;

    public SubsonicAuthParametersInterceptor(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        HttpUrl.Builder urlBuilder = originalRequest.url().newBuilder();
        urlBuilder.setQueryParameter("u", username);
        urlBuilder.setQueryParameter("t", md5Hash(password + SALT));
        urlBuilder.setQueryParameter("s", SALT);
        urlBuilder.setQueryParameter("v", "1.16.0");
        urlBuilder.setQueryParameter("c", "android_client");
        urlBuilder.setQueryParameter("f", "json");
        Request build = originalRequest.newBuilder().url(urlBuilder.build().url()).build();
        return chain.proceed(build);
    }

    private String md5Hash(String s) {
        String hash = "";
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(s.getBytes(), 0, s.length());
            hash = new BigInteger(1, m.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            // do nothing
        }
        return hash;
    }
}
