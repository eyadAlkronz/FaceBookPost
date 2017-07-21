package com.eyad.alkronz.facebookpost.Adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eyad.alkronz.facebookpost.Entity.AdvertisingPost;
import com.eyad.alkronz.facebookpost.Entity.ImagePost;
import com.eyad.alkronz.facebookpost.Entity.NormalPost;
import com.eyad.alkronz.facebookpost.Entity.Row;
import com.eyad.alkronz.facebookpost.Entity.SuggestedFriendsPost;
import com.eyad.alkronz.facebookpost.Entity.WriteNewPost;
import com.eyad.alkronz.facebookpost.R;

import java.util.List;

/**
 * Created by Eyad on 7/21/2017.
 */



public  class DifferentRowAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Row> postList ;
    Context context ;

    public DifferentRowAdapter(Context context , List<Row>postList ) {
         this.context = context;
        this.postList = postList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.normal_post, parent, false);
                return new NormalPostHolder(view);
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_post, parent, false);
                return new ImagePostHolder(view);
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.write_new_post, parent, false);
                return new WriteNewPostHolder(view);
            case 3:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advertising_post, parent, false);
                return new AdvertisingPostHolder(view);
            case 4:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizintal_itemlist, parent, false);
                return new ListSuggestedFriends(view);

        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Row object = postList.get(position);
        if (object != null) {
            if (object instanceof com.eyad.alkronz.facebookpost.Entity.NormalPost){
                ((NormalPostHolder) holder).posttext.setText(((com.eyad.alkronz.facebookpost.Entity.NormalPost)object).getPost_content()+"");
                ((NormalPostHolder) holder).user_name.setText(((com.eyad.alkronz.facebookpost.Entity.NormalPost)object).getUser_name()+"");
                ((NormalPostHolder) holder).user_photo.setImageResource(((com.eyad.alkronz.facebookpost.Entity.NormalPost)object).getUser_photo());

            } else if(object instanceof ImagePost){
                ((ImagePostHolder) holder).user_photo_image_post.setImageResource(((ImagePost)object).getUser_photo());
                ((ImagePostHolder) holder).post_image__image_post.setImageResource(((ImagePost)object).getPost_photo());
                ((ImagePostHolder) holder).user_name_image_post.setText(((ImagePost)object).getUser_name()+"");
                ((ImagePostHolder) holder).posttext__image_post.setText((""+ ((ImagePost)object).getPost_content()));                 }

            else if(object instanceof AdvertisingPost){
                ((AdvertisingPostHolder) holder).advertising_image.setImageResource(((AdvertisingPost)object).getAdvertising_photo_id());
            }
            else if(object instanceof WriteNewPost){     }
            else if(object instanceof SuggestedFriendsPost){     }
        }
    }

    @Override
    public int getItemCount(){
        if (postList == null)
            return 0;
        return postList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (postList != null) {
            Row object = postList.get(position);
            if (object instanceof NormalPost)
                return 0;
              else if (object instanceof ImagePost )
                return 1;

            else if (object instanceof WriteNewPost )
                return 2;

            else if (object instanceof AdvertisingPost)
                return 3;
            else if (object instanceof SuggestedFriendsPost)
                return 4;



        }
        return 0;
    }


    public   class NormalPostHolder extends RecyclerView.ViewHolder {
        private ImageView user_photo;
        private TextView user_name;
        private TextView posttext;

        public NormalPostHolder(View itemView) {
            super(itemView);
            user_photo = (ImageView) itemView.findViewById(R.id.user_photo1);
            user_name = (TextView) itemView.findViewById(R.id.user_name1);
            posttext = (TextView) itemView.findViewById(R.id.posttext1);
        }
    }

    public   class ImagePostHolder extends RecyclerView.ViewHolder {
        private ImageView user_photo_image_post;
        private TextView user_name_image_post;
        private TextView posttext__image_post;
        private ImageView post_image__image_post;

        public ImagePostHolder(View itemView) {
            super(itemView);
            user_photo_image_post = (ImageView) itemView.findViewById(R.id.user_photo_image_post);
            post_image__image_post = (ImageView) itemView.findViewById(R.id.post_image__image_post);
            user_name_image_post = (TextView) itemView.findViewById(R.id.user_name_image_post);
            posttext__image_post = (TextView) itemView.findViewById(R.id.posttext__image_post);
        }
    }

    public   class WriteNewPostHolder extends RecyclerView.ViewHolder {
        public WriteNewPostHolder(View itemView) {
            super(itemView);
        }
    }

    public   class AdvertisingPostHolder extends RecyclerView.ViewHolder {
        ImageView advertising_image = (ImageView) itemView.findViewById(R.id.advertising_image);
        public AdvertisingPostHolder(View itemView) {
            super(itemView);
            this.advertising_image=(ImageView)itemView.findViewById(R.id.advertising_image);
        }
    }


    public   class ListSuggestedFriends extends RecyclerView.ViewHolder {
        RecyclerView  listofitem = (RecyclerView) itemView.findViewById(R.id.listofitem);
        public ListSuggestedFriends(View itemView) {
            super(itemView);
            this.listofitem=(RecyclerView)itemView.findViewById(R.id.listofitem);


            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, OrientationHelper.HORIZONTAL, false);
             SuggestedFriendAdapter friendAdapter = new SuggestedFriendAdapter();
            listofitem.setAdapter(friendAdapter);
            listofitem.setLayoutManager(linearLayoutManager);



    }
    }



}