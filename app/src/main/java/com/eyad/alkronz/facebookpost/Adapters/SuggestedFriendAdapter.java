package com.eyad.alkronz.facebookpost.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eyad.alkronz.facebookpost.Entity.SuggestedFriendsPost;
import com.eyad.alkronz.facebookpost.R;

/**
 * Created by Eyad on 7/21/2017.
 */

public class SuggestedFriendAdapter extends RecyclerView.Adapter<SuggestedFriendAdapter.FriendHolder> {
String[] list = new SuggestedFriendsPost().getSuggestedFriends();

    @Override
    public FriendHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.suggest_friend_row, parent, false);
                return new FriendHolder(view);
    }

    @Override
    public void onBindViewHolder(FriendHolder holder, int position) {
        holder.friend_name.setText(list[position]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public   class FriendHolder extends RecyclerView.ViewHolder {
        TextView friend_name ;
         public FriendHolder(View itemView) {
            super(itemView);
             this.friend_name=(TextView) itemView.findViewById(R.id.friend_name);
         }
    }
}
