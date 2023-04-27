package com.example.aplikaatio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        context = this;

        UserStorage.getInstance().loadUsers(context);

        Toast.makeText(context, context.getFilesDir().toString(), Toast.LENGTH_LONG).show();
    }


    public void switchToAddStudentActivity(View view){
        Intent intent = new Intent(this, AddStudentActivity.class);
        startActivity(intent);
    }


    public void switchToStudentListActivity(View view){
        Intent intent = new Intent(this, StudentListActivity.class);
        startActivity(intent);
    }


    public void saveUsers(View view){
        UserStorage.getInstance().saveUsers(context);
    }

    public void loadUsers(View view){
        UserStorage.getInstance().loadUsers(context);
    }

}