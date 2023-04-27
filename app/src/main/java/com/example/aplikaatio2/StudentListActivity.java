package com.example.aplikaatio2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Collections;

public class StudentListActivity extends AppCompatActivity {

    private UserStorage storage;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);


        storage = UserStorage.getInstance();

        recyclerView = findViewById(R.id.rvUserList);

        Collections.sort(UserStorage.getInstance().getUsers(), (user1, user2) -> user1.getLastName().compareTo(user2.getLastName()));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StudentListAdapter(storage.getUsers(), getApplicationContext()));
    }
}