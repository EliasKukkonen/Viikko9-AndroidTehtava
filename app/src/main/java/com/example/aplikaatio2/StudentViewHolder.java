package com.example.aplikaatio2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    ImageView imageViewKuva;
    TextView OpiskelijaNimi, OpiskelijaHaara, OpiskelijatPosti;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewKuva = itemView.findViewById(R.id.imageViewKuva);
        OpiskelijaNimi = itemView.findViewById(R.id.txtFirstSurName);
        OpiskelijaHaara = itemView.findViewById(R.id.txtOpintoHaara);
        OpiskelijatPosti = itemView.findViewById(R.id.txtPosti);
    }
}
