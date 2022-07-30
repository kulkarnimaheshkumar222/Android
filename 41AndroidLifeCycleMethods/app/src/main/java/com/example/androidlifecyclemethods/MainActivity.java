package com.example.androidlifecyclemethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"On Create() Called",
                Toast.LENGTH_SHORT).show();
        Log.d("Message","On Create() Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"On Start() Called",
                Toast.LENGTH_SHORT).show();
        Log.d("Message","On Start() Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"On Resume() Called",
                Toast.LENGTH_SHORT).show();
        Log.d("Message","On Resume() Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"On Pause() Called",
                Toast.LENGTH_SHORT).show();
        Log.d("Message","On Pause() Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"On Stop() Called",
                Toast.LENGTH_SHORT).show();
        Log.d("Message","On Stop() Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"On Destroy() Called",
                Toast.LENGTH_SHORT).show();
        Log.d("Message","On Destroy() Called");
    }
}