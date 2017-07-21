package com.eyad.alkronz.facebookpost.Entity;

/**
 * Created by Eyad on 7/16/2017.
 */

public class NormalPost extends Post {
    private String post_content ;

    public NormalPost(String user_name, int user_photo, String post_content) {
        super(user_name, user_photo);
        this.post_content = post_content;
    }

    public String getPost_content() {
        return post_content;
    }
    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

}


