import API.UserAPI;
import API.models.User;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by deep on 11/17/16.
 */
public class UserAPITest {

    @Test
    public void UserAPI_getAllUsersTest() throws CompletionException, InterruptedException, ExecutionException {
        List<User> all_users = UserAPI.getAllUsers();
        assertThat(all_users.size() > 0, is(true));
    }

    /**
     * Checks for null, because the spotify_id will not be unique
     */
    @Test
    public void UserAPI_createNewUserTest() {
        User newUser = UserAPI.createNewUser(new User("deep", "randhawa", "2", "drandhaw@purdue.edu"));
        assertThat(newUser == null, is(true));
    }



}
