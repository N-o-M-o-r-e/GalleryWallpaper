package com.project.tathanhson.gallerywallpaper;

import android.app.Application;

public class MyApplication extends Application {
    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }

    public static MyApplication getInstance() {
        return instance;
    }
}
