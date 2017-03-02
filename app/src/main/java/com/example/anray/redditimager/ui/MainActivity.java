package com.example.anray.redditimager.ui;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.anray.redditimager.R;
import com.example.anray.redditimager.managers.DataManager;
import com.example.anray.redditimager.models.PictureRes;
import com.example.anray.redditimager.ui.adapters.PicturesAdapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private final String FILTER = "image";
    private Button mNew, mTop;
    private RecyclerView mRecyclerView;
    private PicturesAdapter mPicturesAdapter;
    private DataManager mDataManager;
    private PictureRes mPictureRes;
    private String mUrlNew = "https://www.reddit.com/r/EarthPorn/new/.json?limit=100";
    private String mUrlTop = "https://www.reddit.com/r/EarthPorn/top/.json?limit=100";
    private List<String> mPictureUrlsList = new ArrayList<>();
    public GridLayoutManager mMGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNew = $(R.id.new_btn);
        mTop = $(R.id.top_btn);
        mRecyclerView = $(R.id.rv);

        mNew.setOnClickListener(this);
        mTop.setOnClickListener(this);

        mMGridLayoutManager = new GridLayoutManager(this, 2);
        mMGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {

                int res = position % 3;

                switch (res) {
                    case 0:
                        return 2;
                    default:
                        return 1;
                }

            }
        });
        mRecyclerView.setLayoutManager(mMGridLayoutManager);

        mDataManager = DataManager.getInstance();

        changePicturesSource(mUrlTop);


    }

    private void changePicturesSource(String sourceUrl) {
        Call<PictureRes> call = mDataManager.getPictures(sourceUrl);
        call.enqueue(new Callback<PictureRes>() {
            @Override
            public void onResponse(Call<PictureRes> call, Response<PictureRes> response) {
                if (response.code() == 200) {

                    getPictureUrls(response);

                    if (mPicturesAdapter == null) {
                        mPicturesAdapter = new PicturesAdapter(mPictureUrlsList);
                        mRecyclerView.setAdapter(mPicturesAdapter);
                    } else {
                        mPicturesAdapter.changePictureSet(mPictureUrlsList);
//                        mRecyclerView.swapAdapter(mPicturesAdapter, false);
                    }


                }
            }

            @Override
            public void onFailure(Call<PictureRes> call, Throwable t) {

            }
        });
    }

    private void getPictureUrls(Response<PictureRes> response) {
        mPictureUrlsList.clear();

        List<PictureRes.Data.Child> children = response.body().getData().getChildren();

        Iterator itr = children.iterator();
        while (itr.hasNext()) {

            PictureRes.Data.Child child = ((PictureRes.Data.Child) itr.next());

            String filterValue = child.getData().getPostHint();
            if (filterValue != null && filterValue.equals(FILTER)) {
                mPictureUrlsList.add(child.getData().getThumbnail());
            }

        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.new_btn:
                changePicturesSource(mUrlNew);
                break;
            case R.id.top_btn:
                changePicturesSource(mUrlTop);
                break;
        }
    }
}
