package com.example.lab04.lab04viewlayouts;

//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mBtn1 = (Button) findViewById(R.id.button);
        mBtn1.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }
}
