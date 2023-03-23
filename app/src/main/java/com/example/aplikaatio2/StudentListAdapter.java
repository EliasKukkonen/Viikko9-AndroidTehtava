package com.example.aplikaatio2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentListAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();


    public StudentListAdapter(ArrayList<User> users, Context context) {
        this.users = users;
        this.context=context;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StudentViewHolder(LayoutInflater.from(context).inflate(R.layout.student_view, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.OpiskelijaNimi.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        holder.OpiskelijaHaara.setText(users.get(position).getDegreeProgram());
        holder.OpiskelijatPosti.setText(users.get(position).getEmail());
        holder.imageViewKuva.setImageResource(users.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
