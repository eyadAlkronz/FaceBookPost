package com.eyad.alkronz.facebookpost.Entity;

/**
 * Created by Eyad on 7/16/2017.
 */

public class ImagePost extends Post {
    private int post_photo ;
    private String post_content ;

    public ImagePost(String user_name, int user_photo, String post_content, int post_photo) {
        super(user_name, user_photo);
        this.post_photo = post_photo;
        this.post_content = post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public String getPost_content() {

        return post_content;
    }

    public int getPost_photo() {
        return post_photo;
    }

    public void setPost_photo(int post_photo) {
        this.post_photo = post_photo;
    }
}


