package com.example.helloandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClicked(View view) {
      showCustomToast();
    }

    public void showCustomToast() {
       LayoutInflater inflater = getLayoutInflater();
       View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.rootId));

       Toast toast = new Toast(getApplicationContext());
       toast.setGravity(Gravity.CENTER,0,0);
       toast.setDuration(Toast.LENGTH_SHORT);
       toast.setView(layout);
       toast.show();
    }
}