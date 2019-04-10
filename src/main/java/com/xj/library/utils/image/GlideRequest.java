package com.xj.library.utils.image;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.Glide;


/**
 * @author xujun  on 2016/12/23.
 * @email gdutxiaoxu@163.com
 */

public class GlideRequest implements IimageListener {


    private static class Holder {
        private static final GlideRequest mInstance = new GlideRequest();
    }

    public static GlideRequest getInstance() {
        return Holder.mInstance;
    }


    @Override
    public void display(Context context, ImageView imageView, String url, int progressId, int
            errorId, Object tag) {
        DrawableTypeRequest<String> load = Glide.with(context).load(url);
        if (progressId != -1) {
            load.placeholder(progressId).centerCrop();
        } else {
            load.placeholder(new ColorDrawable(Color.GRAY));
        }
        if (errorId != -1) {
            load.error(errorId);
        }

        load.into(imageView);
    }

    @Override
    public void display(Context context, ImageView imageView, String url, int progressId, int
            errorId) {
        display(context, imageView, url, progressId, errorId, null);
    }

    @Override
    public void display(Context context, ImageView imageView, String url, int progressId) {
        display(context, imageView, url, progressId, -1, null);
    }

    @Override
    public void display(Context context, ImageView imageView, String url) {
        display(context, imageView, url, -1, -1, null);
    }

    @Override
    public void display(Context context, ImageView imageView, Uri uri) {
        DrawableTypeRequest<Uri> load = Glide.with(context).load(uri);
        load.into(imageView);
    }
}
