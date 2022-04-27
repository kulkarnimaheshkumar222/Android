package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void blueBtnClicked(View view) {
        showToast(true);
    }

    public void redBtnClicked(View view) {
         showToast(false);
        // Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
    }

    public void showToast(Boolean isBlue) {
        CharSequence text = "";
        if (isBlue) {
            text = "Blue Btn Clicked";
        } else {
            text = "Red Btn Clicked";
        }
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }
}