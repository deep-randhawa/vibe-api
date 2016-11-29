package API;

import API.models.User;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by drandhaw on 11/20/16.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserAPITest {
    @Test
    public void t1_createNewUser() {
        try {
            User user = UserAPI.createNewUser(new User("deep", "randhawa", "1", "drandhaw@purdue.edu"));
            assertTrue(user.id != null);
        } catch (Throwable throwable) {
            assert false;
        }
    }

    @Test
    public void t2_getAllUsers() {
        try {
            List<User> users = UserAPI.getAllUsers();
            assertTrue(users != null && users.size() > 0);
        } catch (Throwable throwable) {
            assert false;
        }
    }

    @Test
    public void t3_getUser() {
        try {
            User user = UserAPI.getUser(1);
            assertTrue(user != null && user.id != null);
        } catch (Throwable throwable) {
            assert false;
        }
    }

    @Test
    public void t4_modifyUser() {
        try {
            String response = UserAPI.modifyUser(1, new User("new_deep", "new_randhawa", "1", "drandhaw@purdue.edu"));
            assertTrue(response.contains("Success"));
        } catch (Throwable throwable) {
            assert false;
        }
    }

    @Test
    public void t5_deleteUser() {
        try {
            String response = UserAPI.deleteUser(1);
            assertTrue(response.contains("Success"));
        } catch (Throwable throwable) {
            assert false;
        }
    }
}