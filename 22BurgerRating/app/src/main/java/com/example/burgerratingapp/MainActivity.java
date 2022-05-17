package com.example.burgerratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   RatingBar ratingBar;
   TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
    }

    public void submitBtnClicked(View view) {
     float ratingValue = ratingBar.getRating();
     if(ratingValue<2) {
         textView.setText("Rating: "+ratingValue + "\n We Will try better next time !! ");
     } else if (ratingValue <= 3 && ratingValue >= 2) {
         textView.setText("Rating: "+ratingValue + "\n We are constantly Improving !!");
     } else if (ratingValue > 3 && ratingValue <5) {
         textView.setText("Rating: "+ratingValue+ "\nGlad you are satisfied !!");
     }else if (ratingValue == 5) {
         textView.setText("Rating: "+ratingValue+ "\n Do Visit again !!");
     }


    }
}