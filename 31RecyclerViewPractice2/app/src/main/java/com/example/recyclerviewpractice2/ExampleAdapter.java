package com.example.recyclerviewpractice2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleModel> mexamplelist;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }

    public ExampleAdapter(ArrayList<ExampleModel> examplelist) {
        mexamplelist = examplelist;
    }

    //3
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //5
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.exampler_item,parent,false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        //7
        ExampleModel currentItem = mexamplelist.get(position);
        holder.imageView.setImageResource(currentItem.getmImageResource());
        holder.textView.setText(currentItem.getmText());

    }

    @Override
    public int getItemCount() {
        return mexamplelist.size();
    }
}
