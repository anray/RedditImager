package com.example.anray.redditimager.network;

import com.example.anray.redditimager.models.PictureRes;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by anray on 11.07.2016.
 */
public interface RestService {

    @GET
    Call<PictureRes> getPictures(@Url String url);


}
