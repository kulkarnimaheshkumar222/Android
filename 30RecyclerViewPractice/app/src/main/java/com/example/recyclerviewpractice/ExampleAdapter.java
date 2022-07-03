package com.example.recyclerviewpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    ArrayList<Integer> arrayList1;


    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        private TextView textView1;
        private TextView textView2;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView1Id);
            textView2 = itemView.findViewById(R.id.textView2Id);

        }
    }

    public ExampleAdapter(ArrayList<Integer> arrayList) {
        arrayList1 = arrayList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent,false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(arrayList1.get(exampleViewHolder.getAbsoluteAdapterPosition()));
            }
        });
        return exampleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        holder.textView1.setText(arrayList1.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return arrayList1.size();
    }

}
