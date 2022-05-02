package com.example.autocompletepracticeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String indianStates[] = new String[] {"Andaman and Nicobar", "Arunachal Pradesh", "Assam", "Bihar", "Chattisgarh", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Goa", "Gujrat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Lakshadweep", "Madya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Panjab", "Pundicherry", "Rajasthan", "Sikkim", "Tamil Nadu", "Telanga", "Tripura", "Uttar Pradesh", "Uttrakhand", "West Bengal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, indianStates);
        autoCompleteTextView = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
    }
}