package com.eyad.alkronz.facebookpost.Entity;

/**
 * Created by Eyad on 7/16/2017.
 */

public class Post  implements Row{
    private String user_name ;
    private  int user_photo ;


    public Post(String user_name, int user_photo) {
        this.user_name = user_name;
        this.user_photo = user_photo;
    }

    public String getUser_name() {
        return user_name;
    }

    public int getUser_photo() {
        return user_photo;
    }


    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_photo(int user_photo) {
        this.user_photo = user_photo;
    }

}


