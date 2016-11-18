package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by deep on 11/17/16.
 */
public class User {

    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("first_name")
    @Expose
    public String firstName;

    @SerializedName("last_name")
    @Expose
    public String lastName;

    @SerializedName("spotify_id")
    @Expose
    public String spotifyID;

    @SerializedName("email")
    @Expose
    public String email;
}
