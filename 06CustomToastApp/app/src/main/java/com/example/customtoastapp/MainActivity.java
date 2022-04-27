package com.example.customtoastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void helloBtnClicked(View view) {
        //Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
        showCustomToast("TO EVERYONE");
    }

    public void showCustomToast(String text) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.toast_root));
        TextView toastTextView = layout.findViewById(R.id.textView_id);
        toastTextView.setText(text);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}