package com.example.currencyconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro, pound, dollar, yen, dinar, bitcoin, rubel, ausdollar, candollar;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        rubel = findViewById(R.id.rubel);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.012;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.010;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.013;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.68;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.0039;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.0000001;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.82;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.018;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty user input");
                } else {
                    double n,k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.016;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(k));
                }
            }
        });
    }
}