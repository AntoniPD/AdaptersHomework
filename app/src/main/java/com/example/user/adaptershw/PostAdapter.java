package com.example.user.adaptershw;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.adaptershw.cmn.Post;

import java.util.ArrayList;

/**
 * Created by User on 7/22/2016.
 */
public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder>{

    ArrayList<Post> data;
    Context context;


    public PostAdapter(ArrayList<Post> data) {
        this.data = data;
    }

    @Override
    public PostHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_post, parent, false);
        PostHolder holder = new PostHolder(v);
        return holder;
    }

    public void setData(ArrayList<Post> data){
        this.data = data;
    }

    @Override
    public void onBindViewHolder(final PostHolder holder, int position) {

        final Post post = data.get(position);
        holder.txtTitle.setText(post.getTitle());
        holder.txtPoints.setText(post.getPoints());
        holder.txtComments.setText(post.getCommentNum());
        holder.btnComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,CommentsActivity.class));
            }
        });
        holder.btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(post.getBtnDown().isPressed()){
                    holder.btnDown.setBackgroundResource(R.drawable.arrow_down_blue);
                    holder.btnUp.setBackgroundResource(R.drawable.arrow_up_red);
                }else{
                    holder.btnUp.setBackgroundResource(R.drawable.arrow_up_blue);
                    holder.btnDown.setBackgroundResource(R.drawable.arrow_down_red);
                }

            }
        });
        holder.btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(post.getBtnUp().isPressed()){
                    holder.btnDown.setBackgroundResource(R.drawable.arrow_down_red);
                    holder.btnUp.setBackgroundResource(R.drawable.arrow_up_blue);
                }else{
                    holder.btnDown.setBackgroundResource(R.drawable.arrow_down_blue);
                    holder.btnUp.setBackgroundResource(R.drawable.arrow_up_red);
                }
            }
        });
        holder.imgPost.setBackground(post.getPicture());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class PostHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
        ImageView imgPost;
        Button btnUp;
        Button btnDown;
        Button btnShare;
        Button btnMore;
        Button btnComments;
        TextView txtComments;
        TextView txtPoints;

        public PostHolder(View itemView) {
            super(itemView);

            txtTitle = (TextView) itemView.findViewById(R.id.txt_title);
            imgPost = (ImageView) itemView.findViewById(R.id.img_post);
            btnUp = (Button) itemView.findViewById(R.id.btn_arrow_up);
            btnDown = (Button) itemView.findViewById(R.id.btn_arrow_down);
            btnComments = (Button) itemView.findViewById(R.id.btn_comments);
            btnShare = (Button) itemView.findViewById(R.id.btn_share);
            btnMore = (Button) itemView.findViewById(R.id.btn_more);
            txtComments = (TextView) itemView.findViewById(R.id.txt_comments);
            txtPoints = (TextView) itemView.findViewById(R.id.txt_points);
        }
    }
}
