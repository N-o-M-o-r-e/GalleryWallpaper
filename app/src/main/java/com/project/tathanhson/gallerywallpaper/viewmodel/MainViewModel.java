package com.project.tathanhson.gallerywallpaper.viewmodel;

import android.util.Log;

import com.project.tathanhson.gallerywallpaper.view.base.BaseViewModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainViewModel extends BaseViewModel {
    public static final String TAG = MainViewModel.class.getName();
    public static final String LINK = "https://unsplash.com/s/photos/pet";
    private Thread thread;

    public void parseHTML() {
        if (thread == null || thread.isAlive()) {
            thread = new Thread(() -> {
                try {
                    Document document = Jsoup.connect(LINK).get();
                    Elements items = document.getElementsByTag("figure");
                    Log.e("AAAAAAAA", "parseHTML: "+items.size() );
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            thread.setDaemon(true);
            thread.start();
        }
    }
}
