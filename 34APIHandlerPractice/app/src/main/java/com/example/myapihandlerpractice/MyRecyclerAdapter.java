package com.example.myapihandlerpractice;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.CustomViewHolder> {

    ArrayList<UserModel> myArrayList = new ArrayList<UserModel>();

    public MyRecyclerAdapter(ArrayList<UserModel> myArrayList) {
        this.myArrayList = myArrayList;
    }
    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView textView1,textView2;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView1 = itemView.findViewById(R.id.textView);
            this.textView2 = itemView.findViewById(R.id.textView2);
        }
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent,false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        UserModel userModel = myArrayList.get(position);
        holder.textView1.setText(userModel.getTitle());
        holder.textView2.setText(userModel.getBody());
    }

    @Override
    public int getItemCount() {
        return myArrayList.size();
    }


}
