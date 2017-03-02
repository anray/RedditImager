package com.example.anray.redditimager;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

/**
 * Created by anray on 02.03.2017.
 */

public class AppImager extends Application {


    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;

        Stetho.initializeWithDefaults(this);

    }

    public static Context getContext() {
        return sContext;
    }
}
