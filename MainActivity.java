package com.example.jeuballe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   // TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // tv = findViewById(R.id.inversé);
    }

    public void onClickModeNormal(View v){
        Intent intent = new Intent(this,modeNormal.class);
        startActivityForResult(intent,1);
    }

    public void onClickQuitter(View v){
        finish();
    }
}
