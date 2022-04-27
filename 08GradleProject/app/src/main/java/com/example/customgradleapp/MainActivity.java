package com.example.customgradleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
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
                Toasty.error(this,"Login failed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.successBtnId:
                Toasty.success(this,"Login Success", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoBtnId:
                Toasty.info(this,"Retrieved Info", Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningBtnId:
                Toasty.warning(this,"Oops", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageBtnId:
                Toasty.normal(this,"Upload Completed", Toast.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_baseline_backup_24)).show();
                break;
        }
    }
}
