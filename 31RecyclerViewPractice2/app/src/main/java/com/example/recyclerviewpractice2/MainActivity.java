package com.example.recyclerviewpractice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ExampleModel> exampleModels = new ArrayList<ExampleModel>();
        exampleModels.add(new ExampleModel(R.drawable.node,"Clicked at Studio0"));
        exampleModels.add(new ExampleModel(R.drawable.oner,"Clicked at Studio1"));
        exampleModels.add(new ExampleModel(R.drawable.twor,"Clicked at Studio2"));
        exampleModels.add(new ExampleModel(R.drawable.threer,"Clicked at Studio3"));
        exampleModels.add(new ExampleModel(R.drawable.fourr,"Clicked at Studio4"));
        exampleModels.add(new ExampleModel(R.drawable.fiver,"Clicked at Studio5"));
        exampleModels.add(new ExampleModel(R.drawable.sixr,"Clicked at Studio6"));

        recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleModels);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}