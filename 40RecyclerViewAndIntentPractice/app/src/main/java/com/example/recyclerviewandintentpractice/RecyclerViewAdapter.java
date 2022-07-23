package com.example.recyclerviewandintentpractice;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

  ArrayList<EmployeeModel> arrayList1;


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView dateTextView,monthYearTextView,timeTextView,titleTextView,
                subTitleTextView,descriptionTextView;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            dateTextView = itemView.findViewById(R.id.date_textView_id);
            monthYearTextView = itemView.findViewById(R.id.monthYear_textView_id);
            timeTextView = itemView.findViewById(R.id.time_textView_id);
            titleTextView = itemView.findViewById(R.id.title_textView_id);
            subTitleTextView = itemView.findViewById(R.id.subtitle_textView_id);
            descriptionTextView = itemView.findViewById(R.id.description_textView_id);
        }
    }

    public RecyclerViewAdapter(ArrayList<EmployeeModel> arrayList) {
        arrayList1 = arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println(arrayList1.get(recyclerViewHolder.getAbsoluteAdapterPosition()));
//            }
//        });
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.dateTextView.setText(arrayList1.get(position).getDate());
        holder.monthYearTextView.setText(arrayList1.get(position).getDate());
        holder.timeTextView.setText(arrayList1.get(position).getTime());
        holder.titleTextView.setText(arrayList1.get(position).getAssociationName());
        holder.subTitleTextView.setText(arrayList1.get(position).getTitle());
        holder.descriptionTextView.setText(arrayList1.get(position).getMessage());
    }

    @Override
    public int getItemCount() {
        return arrayList1.size();
    }

}

