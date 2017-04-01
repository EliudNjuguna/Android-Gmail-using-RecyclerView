package rhynix.eliud.gmailrecyclerview.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import rhynix.eliud.gmailrecyclerview.model.Message;

/**
 * Created by eliud on 3/30/17.
 */

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
