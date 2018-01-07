package subsonic_api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fxsalazar
 * 7/1/18.
 */
public class Response {
    @SerializedName("subsonic-response")
    protected InnerResponse subsonic_response;

    public InnerResponse getResponse() {
        return subsonic_response;
    }
}
