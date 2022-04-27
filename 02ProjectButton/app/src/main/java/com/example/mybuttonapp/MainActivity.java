package com.example.mybuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button myredBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myredBtn = findViewById(R.id.myBtn);
        myredBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Log.d("TEST","Clicked");
              System.out.println("BtnClicked");
            }
        });
    }
}