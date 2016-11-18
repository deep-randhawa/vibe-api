package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by deep on 11/17/16.
 */
public class User {

    @SerializedName("FIRST_NAME")
    @Expose
    public String firstName;

    @SerializedName("LAST_NAME")
    @Expose
    public String lastName;

    @SerializedName("SPOTIFY_ID")
    @Expose
    public String spotifyID;

    @SerializedName("EMAIL")
    @Expose
    public String email;
}
