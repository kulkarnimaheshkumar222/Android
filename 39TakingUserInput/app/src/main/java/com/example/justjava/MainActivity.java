package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView,priceTextView;
    Button orderBtn;
    Button incrementBtn,decrementBtn;
    int numberOfCoffeesOrdered = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.quantityCount_textView);
        orderBtn = findViewById(R.id.orderBtn);
        priceTextView = findViewById(R.id.price_textView);
        incrementBtn = findViewById(R.id.increment);
        decrementBtn = findViewById(R.id.decrement);
        displayCount(numberOfCoffeesOrdered);
        displayPrice(numberOfCoffeesOrdered);
    }

    public void displayCount(int numberOfCoffeesOrdered) {
        textView.setText(String.valueOf(numberOfCoffeesOrdered));
    }

    public void displayPrice(int numberOfCoffeesOrdered) {
        priceTextView.setText("$" + String.valueOf(numberOfCoffeesOrdered*2));
    }

    public void  orderBtnClicked(View view) {
      displayCount(numberOfCoffeesOrdered);
      displayPrice(numberOfCoffeesOrdered);

    }
    public void  incrementValue(View view) {
        numberOfCoffeesOrdered = numberOfCoffeesOrdered+1;
        displayCount(numberOfCoffeesOrdered);
    }
    public void decrementValue(View view) {
        numberOfCoffeesOrdered = numberOfCoffeesOrdered-1;
        displayCount(numberOfCoffeesOrdered);
    }
}