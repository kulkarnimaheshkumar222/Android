package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleItems = new ArrayList<ExampleItem>();

        exampleItems.add(new ExampleItem(R.drawable.node,"Clicked at Studio"));
        exampleItems.add(new ExampleItem(R.drawable.oner,"Clicked at Studio1"));
        exampleItems.add(new ExampleItem(R.drawable.twor,"Clicked at Studio2"));
        exampleItems.add(new ExampleItem(R.drawable.threer,"Clicked at Studi3"));
        exampleItems.add(new ExampleItem(R.drawable.fourr,"Clicked at Studio4"));
        exampleItems.add(new ExampleItem(R.drawable.fiver,"Clicked at Studio5"));
        exampleItems.add(new ExampleItem(R.drawable.sixr,"Clicked at Studio6"));

        recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleItems);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}