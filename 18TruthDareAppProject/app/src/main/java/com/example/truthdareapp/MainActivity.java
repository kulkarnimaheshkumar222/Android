package com.example.truthdareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button spinBtn;
    private ImageView imageView;
    private Random random = new Random();
    private int lastDirection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinBtn = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

    }
    public void spinBtnClicked(View view) {
      int newDirection = random.nextInt(3600);
      float pivotX = imageView.getWidth()/2;
      float pivotY = imageView.getHeight()/2;
      Animation rotate = new RotateAnimation(lastDirection,newDirection,pivotX,pivotY);
      rotate.setDuration(2000);
      rotate.setFillAfter(true);
      rotate.setAnimationListener(new Animation.AnimationListener() {
          @Override
          public void onAnimationStart(Animation animation) {
              spinBtn.setEnabled(false);
          }

          @Override
          public void onAnimationEnd(Animation animation) {
           spinBtn.setEnabled(true);
          }

          @Override
          public void onAnimationRepeat(Animation animation) {

          }
      });
      lastDirection = newDirection;
      imageView.startAnimation(rotate);
    }
}