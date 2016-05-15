package com.example.apple.recycleviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.android.imageloadercompact.ImageLoaderCompact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!ImageLoaderCompact.getInstance().isInitialized()) {
            ImageLoaderCompact.getInstance().onStart();
        }
           RecyclerView recyclerView = (RecyclerView) findViewById(R.id.view);
//        recyclerView.getRecycledViewPool();
//        recyclerView.setItemViewCacheSize(Integer.MAX_VALUE);
//        recyclerView.getRecycledViewPool().setMaxRecycledViews(7,10);
//        recyclerView.getRecycledViewPool().setMaxRecycledViews(6,10);
//        recyclerView.getRecycledViewPool().setMaxRecycledViews(5,10);
//        recyclerView.getRecycledViewPool().setMaxRecycledViews(4,10);
//        recyclerView.getRecycledViewPool().setMaxRecycledViews(3,10);
//        recyclerView.getRecycledViewPool().setMaxRecycledViews(2,10);
        //设置固定大小
//        recyclerView.setHasFixedSize(true);
        //创建线性布局
        LinearLayoutManager layoutManager  = new LinearLayoutManager(this);
        //垂直方向
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        MessageAdapter adapter =new MessageAdapter(this);
        recyclerView.setAdapter(adapter);
    }


}
