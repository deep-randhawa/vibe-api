package API;

import models.User;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

/**
 * Created by deep on 11/17/16.
 */
public interface UserAPI {

    @GET("/user")
    Call<List<User>> getAllUser();

}
