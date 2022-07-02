package com.example.myintentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textViewId);
        String passedValue = getIntent().getStringExtra("info");
        textView.setText(passedValue);
    }

    public void screen2Clicked(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
}