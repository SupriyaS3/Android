package com.masterandroid.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class TimeActivity extends AppCompatActivity {

    public Button btn_time_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_time);

        btn_time_activity = (Button) findViewById(R.id.btn_time);

        btn_time_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TimeActivity.this,PaymentActivity.class);
                startActivity(intent);
            }
        });


    }
}