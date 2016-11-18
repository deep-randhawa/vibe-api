import models.User;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by deep on 11/17/16.
 */
public class UserAPITest {

    @Test
    public void getAllUsersTest() throws InterruptedException, ExecutionException {
        Call<List<User>> users = Globals.userAPI.getAllUser();
        CompletableFuture<List<User>> futureUser = new CompletableFuture<>();
        users.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                futureUser.complete(response.body());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                System.err.println(t.getMessage());
                assert false;
            }
        });
        assertThat(futureUser.isDone(), is(true));
        assertThat(futureUser.get().size() > 1, is(true));
    }

}
