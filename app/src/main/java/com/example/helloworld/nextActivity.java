package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class nextActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        imageView=(ImageView)findViewById(R.id.image_view1);
        Glide.with(this).load("https://ryy-image.sh1a.qingstor.com/Jietu20180313-131438.jpg").into(imageView);


    }
}
