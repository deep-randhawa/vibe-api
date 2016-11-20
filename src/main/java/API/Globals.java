package API;

import API.models.User;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

/**
 * Created by deep on 11/17/16.
 */
public class Globals {
    private static final String BASE_URL = "http://localhost:9000/";
    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public static final UserAPI userAPI = retrofit.create(UserAPI.class);

    interface UserAPI {
        @GET("/user")
        Call<List<User>> getAllUsers();

        @GET("/user/{id}")
        Call<User> getUser(@Path("id") Integer id);

        @POST("/user")
        Call<User> createNewUser(@Body User user);
    }
}