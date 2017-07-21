package com.eyad.alkronz.facebookpost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.eyad.alkronz.facebookpost.Adapters.DifferentRowAdapter;
import com.eyad.alkronz.facebookpost.Entity.AdvertisingPost;
import com.eyad.alkronz.facebookpost.Entity.ImagePost;
import com.eyad.alkronz.facebookpost.Entity.NormalPost;
import com.eyad.alkronz.facebookpost.Entity.Row;
import com.eyad.alkronz.facebookpost.Entity.SuggestedFriendsPost;
import com.eyad.alkronz.facebookpost.Entity.WriteNewPost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Row> postList  = new ArrayList<>();

        postList.add(new WriteNewPost( ));
        postList.add(new SuggestedFriendsPost( ));

        postList.add(new  NormalPost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content "));
       postList.add(new ImagePost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content " , R.drawable.photo5));
        postList.add(new  NormalPost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content "));
        postList.add(new AdvertisingPost(  R.drawable.advertising));
        postList.add(new SuggestedFriendsPost( ));
        postList.add(new  NormalPost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content "));
        postList.add(new ImagePost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content " , R.drawable.photo4));
        postList.add(new  NormalPost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content "));
        postList.add(new AdvertisingPost(  R.drawable.advertising2));
        postList.add(new  NormalPost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content "));
        postList.add(new ImagePost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content " , R.drawable.photo3));
        postList.add(new SuggestedFriendsPost( ));
        postList.add(new  NormalPost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content "));
        postList.add(new AdvertisingPost(  R.drawable.advertising3));
        postList.add(new  NormalPost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content "));
        postList.add(new ImagePost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content " , R.drawable.photo2));
        postList.add(new  NormalPost("Eyad - Alkronz" , R.drawable.person , "Content Content Content Content Content Content Content Content Content Content Content Content Content Content "));
        postList.add(new SuggestedFriendsPost( ));



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
         mRecyclerView.setAdapter(new DifferentRowAdapter(this ,postList));


    }



}
