package com.example.funbackgroundapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout layout;
    private ImageButton myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   layout = findViewById(R.id.layOutId);
   myButton = findViewById(R.id.imageButton);
    }

    public void imageButtonClicked(View view) {
        Random random = new Random();
        int color = Color.argb(255,
                random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256));
        layout.setBackgroundColor(color);
    }
}