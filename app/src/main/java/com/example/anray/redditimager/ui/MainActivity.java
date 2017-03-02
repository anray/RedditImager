package com.example.anray.redditimager.ui;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.example.anray.redditimager.R;
import com.example.anray.redditimager.ui.adapters.PicturesAdapter;

public class MainActivity extends BaseActivity {

    private Button mNew, mTop;
    private RecyclerView mRecyclerView;
    private PicturesAdapter mPicturesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNew = $(R.id.new_btn);
        mTop = $(R.id.top_btn);
        mRecyclerView = $(R.id.rv);



    }


}
