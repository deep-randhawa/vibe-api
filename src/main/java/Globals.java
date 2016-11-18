import API.UserAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
}
