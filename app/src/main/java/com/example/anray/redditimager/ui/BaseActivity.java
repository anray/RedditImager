package com.example.anray.redditimager.ui;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by anray on 02.03.2017.
 */

public class BaseActivity extends AppCompatActivity {

    @SuppressWarnings("unchecked")
    <T extends View> T $(@IdRes int resource) {
        return (T) findViewById(resource);
    }

}
