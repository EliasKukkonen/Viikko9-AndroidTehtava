package com.example.aplikaatio2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StudentListActivity extends AppCompatActivity {

    private UserStorage storage;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);


        storage = UserStorage.getInstance();

        recyclerView = findViewById(R.id.rvUserList);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StudentListAdapter(storage.getUsers(), getApplicationContext()));
    }
}