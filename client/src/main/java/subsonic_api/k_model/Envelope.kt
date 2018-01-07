package subsonic_api.k_model

import com.google.gson.annotations.SerializedName

/**
 * Created by fxsalazar
 * 7/1/18.
 */
class Envelope(@SerializedName("subsonic-response") val subsonic_response: Response) {
}