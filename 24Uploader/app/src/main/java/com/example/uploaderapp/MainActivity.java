package com.example.uploaderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar circularprogressBar, horizontalprogressBar;
    Button start,end,upload;
    int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circularprogressBar = findViewById(R.id.progressBar);
        horizontalprogressBar = findViewById(R.id.horizontalProgressBar);
        start = findViewById(R.id.startBtn);
        end = findViewById(R.id.endBtn);
        upload = findViewById(R.id.uploadBtn);

        circularprogressBar.setVisibility(View.GONE);

    }

    public void startBtnClicked(View view) {
       circularprogressBar.setVisibility(View.VISIBLE);
    }
    public void endBtnClicked(View view) {
       circularprogressBar.setVisibility(View.GONE);
    }

    public void uploadBtnClicked(View view) {
      fakeProgress(progress);
    }

    void fakeProgress(int progress) {
        horizontalprogressBar.setProgress(progress);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fakeProgress(progress+10);
            }
        });
        thread.start();
    }
}