package com.example.quickchangerradioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.radioGroupId);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdBtnBlue:
                        layout.setBackgroundColor(Color.parseColor("#383CC1"));
                        break;
                    case R.id.rdBtnGreen:
                        layout.setBackgroundColor(Color.parseColor("#38CC77"));
                        break;
                    case R.id.rdBtnRed:
                        layout.setBackgroundColor(Color.parseColor("#BF3325"));
                        break;

                }
            }
        });
    }
}