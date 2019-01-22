package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Glide.*;


public class textviewActivity extends AppCompatActivity {

    private Button buttonPanel;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
        buttonPanel = (Button) findViewById(R.id.buttonPanel);
        buttonPanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(textviewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imageView = (ImageView) findViewById(R.id.image_view1);
        Glide.with(this).load("https://ryy-image.sh1a.qingstor.com/Jietu20180313-131438.jpg").into(imageView);
    }

}

