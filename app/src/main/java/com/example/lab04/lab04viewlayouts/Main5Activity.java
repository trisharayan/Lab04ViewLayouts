package com.example.lab04.lab04viewlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button mBtn1 = (Button) findViewById(R.id.button5);
        mBtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(Main5Activity.this, Main6Activity.class);
        startActivity(i);
    }
}