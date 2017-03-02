package com.example.anray.redditimager.ui.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.anray.redditimager.AppImager;
import com.example.anray.redditimager.R;
import com.example.anray.redditimager.helpers.AppConfig;
import com.example.anray.redditimager.managers.DataManager;

import java.util.List;

/**
 * Created by anray on 02.03.2017.
 */

public class PicturesAdapter extends RecyclerView.Adapter<PicturesAdapter.PictureViewHolder> {


    private static final String TAG = AppConfig.TAG_PREFIX + "PicturesAdapter";
    private DataManager mDataManager;
    private List<String> mPictures;
    private Context mContext;


    public PicturesAdapter(List<String> pictures) {
        mPictures = pictures;
    }

    @Override
    public PicturesAdapter.PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_picture_list, parent, false);


        return new PictureViewHolder(convertView);
    }


    @Override
    public void onBindViewHolder(final PictureViewHolder holder, int position) {

        mDataManager = DataManager.getInstance();

        String picture = mPictures.get(position);


        mDataManager.getPicasso()
                .load(picture)
                .error(holder.mDummy)
                .placeholder(holder.mDummy)
                .fit()
                .centerCrop()
                .into(holder.mPicture);

    }

    @Override
    public int getItemCount() {
        return mPictures.size();
    }

    class PictureViewHolder extends RecyclerView.ViewHolder {

        protected ImageView mPicture;
        protected Drawable mDummy;

        public PictureViewHolder(View itemView) {
            super(itemView);

            mDummy = AppImager.getContext().getResources().getDrawable(R.drawable.dummy);

            mPicture = (ImageView) itemView.findViewById(R.id.photo_list_item);
        }


    }
}
