package com.example.bottomsheetandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        order = findViewById(R.id.order);
    }

    public  void orderBtnClicked(View view) {
    BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
    bottomSheetFragment.show(getSupportFragmentManager(),bottomSheetFragment.getTag());
    }
}