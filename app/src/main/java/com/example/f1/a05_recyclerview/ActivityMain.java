package com.example.f1.a05_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.f1.a05_recyclerview.model.Student;
import com.example.f1.a05_recyclerview.utils.Utils;

import java.util.ArrayList;

public class ActivityMain extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Student> listOfStudents;
    private MyRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the list of students
        listOfStudents = Utils.fillListOfStudents();

        // Setup the RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true); // this setting should improve performance
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ActivityMain.this);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Specify the Adapter fot the RecyclerView
        adapter = new MyRecyclerAdapter(listOfStudents);
        recyclerView.setAdapter(adapter);
    }
}