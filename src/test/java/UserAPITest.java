import models.User;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by deep on 11/17/16.
 */
public class UserAPITest {

    @Test
    public void getAllUsersTest() throws InterruptedException, ExecutionException {
        Call<User> user = Globals.userAPI.getAllUser();
        CompletableFuture<User> futureUser = new CompletableFuture<>();
        user.enqueue(new Callback<User>() {
            public void onResponse(Call<User> call, Response<User> response) {
                User user = response.body();
                Integer statusCode = response.code();
                futureUser.complete(user);
            }

            public void onFailure(Call<User> call, Throwable t) {

            }
        });

    }

}
