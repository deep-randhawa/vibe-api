import models.User;
import retrofit2.Call;

import java.util.List;

/**
 * Created by deep on 11/17/16.
 */
public class test {

    public static void main(String[] args) {
        Call<List<User>> users = Globals.userAPI.getAllUser();

    }

}
