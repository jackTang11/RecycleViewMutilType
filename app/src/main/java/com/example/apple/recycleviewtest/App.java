package com.example.apple.recycleviewtest;

import android.app.Application;

import com.android.imageloadercompact.ImageLoaderCompact;

/**
 * Created by linyuan T on 16/5/15.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderCompact.getInstance().init(this);
    }
}
