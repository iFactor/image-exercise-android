package com.ifactorinc.imageexercise;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by albertwold on 5/31/16.
 */
public class HomeActivity extends Activity {
    private ImageView birdImageView;
    private ListView newsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        birdImageView = (ImageView) findViewById(R.id.birdImageView);
        newsListView = (ListView) findViewById(R.id.newsListView);
        newsListView.setAdapter(new NewsListAdapter(this));
    }
}
