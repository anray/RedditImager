package com.example.anray.redditimager.managers;

import android.content.Context;

import com.example.anray.redditimager.AppImager;
import com.example.anray.redditimager.helpers.PicassoCache;
import com.example.anray.redditimager.models.PictureRes;
import com.example.anray.redditimager.network.RestService;
import com.example.anray.redditimager.network.ServiceGenerator;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.http.Url;

/**
 * Created by anray on 02.03.2017.
 */

public class DataManager {

    private static DataManager INSTANCE = null;

    private final Picasso mPicasso;

    private RestService mRestService;
    private Context mContext;


    private DataManager() {
        this.mRestService = ServiceGenerator.createService(RestService.class);
        this.mContext = AppImager.getContext();
        this.mPicasso = new PicassoCache(mContext).getPicassoInstance();

    }


    public static DataManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();

        }
        return INSTANCE;
    }

    public Picasso getPicasso() {
        return mPicasso;
    }


    public Call<PictureRes> getPictures(@Url String url) {
        return mRestService.getPictures(url);

    }

}
