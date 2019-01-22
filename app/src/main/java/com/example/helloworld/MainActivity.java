package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button textreview;
    private Button buttonpanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textreview=(Button) findViewById(R.id.view_2);
        textreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,textviewActivity.class);
                startActivity(intent);
            }
        });

        buttonpanel=(Button)findViewById(R.id.buttonPanel);
        buttonpanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,((Button) findViewById(R.id.buttonPanel)).getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }


}