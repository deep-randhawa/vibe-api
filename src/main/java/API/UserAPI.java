package API;

import API.models.User;
import retrofit2.Call;
import retrofit2.Response;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by deep on 11/17/16.
 */

public class UserAPI {

    public static List<User> getAllUsers() throws Throwable {
        Call<List<User>> call_users = Globals.userAPI.getAllUsers();
        CompletableFuture<List<User>> futureUsers = new CompletableFuture<>();

        VibeCallback<List<User>> callback = new VibeCallback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                futureUsers.complete(response.body());
            }
        };

        call_users.enqueue(callback);
        futureUsers.join();
        if (callback.throwable == null)
            return futureUsers.get();
        throw callback.throwable;
    }

    public static User getUser(Integer id) throws Throwable {
        Call<User> call_user = Globals.userAPI.getUser(id);
        CompletableFuture<User> futureUser = new CompletableFuture<>();

        VibeCallback<User> callback = new VibeCallback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                futureUser.complete(response.body());
            }
        };

        call_user.enqueue(callback);
        futureUser.join();
        if (callback.throwable == null)
            return futureUser.get();
        throw callback.throwable;
    }

    public static User createNewUser(User user) throws Throwable {
        Call<User> call_user = Globals.userAPI.createNewUser(user);
        CompletableFuture<User> futureUser = new CompletableFuture<>();

        VibeCallback<User> callback = new VibeCallback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                futureUser.complete(response.body());
            }
        };

        call_user.enqueue(callback);
        futureUser.join();
        if (callback.throwable == null)
            return futureUser.get();
        throw callback.throwable;
    }
}