package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
     TextView displayTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        displayTextView = findViewById(R.id.displayTextViewId);
        String passedValue = getIntent().getStringExtra("info");
        displayTextView.setText(passedValue);
    }
    public void screen2Clicked(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
}