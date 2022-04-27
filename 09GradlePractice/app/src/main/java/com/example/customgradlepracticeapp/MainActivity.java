package com.example.customgradlepracticeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        switch (view.getId()) {
            case R.id.errorBtnId:
                Toasty.error(this,"Display error message", Toast.LENGTH_SHORT).show();
                break;
          case R.id.successBtn:
                Toasty.success(this,"Display Success message",Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningBtnId:
                Toasty.warning(this,"Display Warning message",Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoBtnId:
                Toasty.info(this,"Display Info message",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageBtnId:
                Toasty.normal(this,"Display Image Upload message",Toast.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_upload)).show();

        }

    }
}