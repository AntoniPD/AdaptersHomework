package com.example.user.adaptershw;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.adaptershw.cmn.Post;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Post> posts = new ArrayList<>();
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Post post1 = new Post(123,12,"first",getDrawable(R.drawable.ic_card_membership_black_24dp));
            Post post2 = new Post(1223,556,"second",getDrawable(R.drawable.ic_g_translate_black_24dp));
            Post post3 = new Post(443,124,"thirs",getDrawable(R.drawable.ic_hourglass_empty_black_24dp));
            posts.add(post1);
            posts.add(post2);
            posts.add(post3);
        }
        PostAdapter adapter = new PostAdapter(posts);
        mRecyclerView.setAdapter(adapter);

    }
}
