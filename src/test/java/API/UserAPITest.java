package API;

import API.models.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by drandhaw on 11/20/16.
 */
public class UserAPITest {
    @Test
    public void getAllUsers() throws Exception {
        List<User> users = null;
        try {
            users = UserAPI.getAllUsers();
        } catch (Throwable throwable) {
            assert false;
        }
        assertTrue(users != null && users.size() > 0);
    }

    @Test
    public void getUser() throws Exception {
        User user = null;
        try {
            user = UserAPI.getUser(1);
        } catch (Throwable throwable) {
            assert false;
        }
        assertTrue(user != null && user.id != null);
    }

    @Test
    public void createNewUser() throws Exception {
        User user = null;
        try {
            user = UserAPI.createNewUser(new User("deep", "randhawa", "1", "drandhaw@purdue.edu"));
        } catch (Throwable throwable) {
            assert false;
        }
        assertTrue(user.id != null);
    }
}