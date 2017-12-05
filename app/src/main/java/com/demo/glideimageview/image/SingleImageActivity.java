package com.demo.glideimageview.image;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.demo.glideimage.GlideImageLoader;
import com.demo.glideimage.GlideImageView;
import com.demo.glideimage.progress.CircleProgressView;
import com.demo.glideimage.progress.OnGlideImageViewListener;
import com.demo.glideimageview.R;

import java.util.Random;

/**
 * Created by sunfusheng on 2017/6/15.
 */
public class SingleImageActivity extends AppCompatActivity {

    GlideImageView glideImageView;
    CircleProgressView progressView;

    CircleProgressView progressView1;
    CircleProgressView progressView2;
    CircleProgressView progressView3;
    View maskView;

    public static final String KEY_IMAGE_URL = "image_url";
    public static final String KEY_IMAGE_URL_THUMBNAIL = "image_url_thumbnail";

    String image_url;
    String image_url_thumbnail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        glideImageView = findViewById(R.id.glideImageView);
        progressView1 = findViewById(R.id.progressView1);
        progressView2 = findViewById(R.id.progressView2);
        progressView3 = findViewById(R.id.progressView3);
        maskView = findViewById(R.id.maskView);

        image_url = getIntent().getStringExtra(KEY_IMAGE_URL);
        image_url_thumbnail = getIntent().getStringExtra(KEY_IMAGE_URL_THUMBNAIL);

        initProgressView();
        loadImage();
    }

    private void initProgressView() {
        int randomNum = new Random().nextInt(3);
        switch (randomNum) {
            case 0:
                progressView = progressView1;
                break;
            case 1:
                progressView = progressView2;
                break;
            case 2:
                progressView = progressView3;
                break;
            default:
                progressView = progressView1;
                break;
        }
        progressView1.setVisibility(View.GONE);
        progressView2.setVisibility(View.GONE);
        progressView3.setVisibility(View.GONE);
        progressView.setVisibility(View.VISIBLE);
    }

    private void loadImage() {
        glideImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.finishAfterTransition(SingleImageActivity.this);
            }
        });

        RequestOptions requestOptions = glideImageView.requestOptions(R.color.black).centerCrop();

        RequestOptions requestOptionsWithoutCache = glideImageView.requestOptions(R.color.black)
                .centerCrop()
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE);

        GlideImageLoader imageLoader = glideImageView.getImageLoader();
        imageLoader.setOnGlideImageViewListener(image_url, new OnGlideImageViewListener() {
            @Override
            public void onProgress(int percent, boolean isDone, GlideException exception) {
                progressView.setProgress(percent);
                progressView.setVisibility(isDone ? View.GONE : View.VISIBLE);
                maskView.setVisibility(isDone ? View.GONE : View.VISIBLE);
            }
        });

        imageLoader.requestBuilder(image_url, requestOptionsWithoutCache)
                .thumbnail(Glide.with(SingleImageActivity.this)
                        .load(image_url_thumbnail)
                        .apply(requestOptions))
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(glideImageView);
    }
}
