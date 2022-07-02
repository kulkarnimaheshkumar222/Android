package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextId);
    }
    public void screen1Clicked(View view) {
        String value = editText.getText().toString();
        if (value.length() == 0) {
            editText.setError("Empty Value");
        } else {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("info",value);
            startActivity(intent);
        }
    }
}