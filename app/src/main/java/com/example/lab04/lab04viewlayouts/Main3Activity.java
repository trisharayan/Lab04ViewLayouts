package com.example.lab04.lab04viewlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button mBtn1 = (Button) findViewById(R.id.button3);
        mBtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(Main3Activity.this, Main4Activity.class);
        startActivity(i);
    }
}
