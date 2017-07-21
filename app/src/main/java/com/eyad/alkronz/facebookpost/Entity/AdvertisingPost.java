package com.eyad.alkronz.facebookpost.Entity;

/**
 * Created by Eyad on 7/16/2017.
 */

public class AdvertisingPost implements Row {
    int Advertising_photo_id;
     public AdvertisingPost(  int Advertising_photo_id) {
          this.Advertising_photo_id=Advertising_photo_id;
     }

    public int getAdvertising_photo_id() {
        return Advertising_photo_id;
    }

    public void setAdvertising_photo_id(int photo_id) {
        this.Advertising_photo_id = photo_id;
    }
}


