package com.example.diceappassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2;
    Random randomNumber1, randomNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        randomNumber1 = new Random();
        randomNumber2 = new Random();
    }

    public void rollBtnClicked(View view) {
        Log.d("TAG","Dice Roller");

       int firstRandomNumber = randomNumber1.nextInt(6)+1;
       setDiceImages(imageView1,firstRandomNumber);

        int secondRandomNumber = randomNumber2.nextInt(6)+1;
        setDiceImages(imageView2,secondRandomNumber);


    }

    public void setDiceImages(ImageView imageView, int randomNumber) {
        switch (randomNumber) {
            case 1:
                imageView.setImageResource(R.drawable.dice1);
                break;
            case  2:
                imageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.dice6);
                break;
        }
    }
}