package com.example.f1.a05_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.f1.a05_recyclerview.model.Student;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    private  ArrayList<Student> listOfStudents;

    public static class ViewHolder extends  RecyclerView.ViewHolder {

        public TextView tvName;
        public TextView tvAge;

        public ViewHolder(View itemView) {
            super(itemView);
            this.tvName = (TextView) itemView.findViewById(R.id.student_name);
            this.tvAge = (TextView) itemView.findViewById(R.id.student_age);
        }
    }

    // Class constructor 
    public MyRecyclerAdapter(ArrayList<Student> list) {
        this.listOfStudents = list;
    }

    // Creates a new view (invoke by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View listItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_of_list, parent, false);
        final ViewHolder viewHolder = new ViewHolder(listItemView);

        // Handle clicks
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show number of the item in the list
                Toast.makeText(parent.getContext(),
                        String.valueOf(viewHolder.getAdapterPosition()),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvName.setText(listOfStudents.get(position).getName());
        holder.tvAge.setText(String.valueOf(listOfStudents.get(position).getAge()));
    }

    // Returns the size of the list
    @Override
    public int getItemCount() {
        return listOfStudents.size();
    }
}