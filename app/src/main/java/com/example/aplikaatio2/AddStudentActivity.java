package com.example.aplikaatio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AddStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }


    public void addUser(View view){
        EditText FirstName = findViewById(R.id.editTextFirstName);
        String Etunimi = FirstName.getText().toString();
        EditText Surname = findViewById(R.id.editTextSurName);
        String Sukunimi = Surname.getText().toString();
        EditText Email = findViewById(R.id.editTextEmail);
        String sahkari = Email.getText().toString();
        String Tutkinto = null;
        int addImage = 0;


        RadioGroup rgUserType = findViewById(R.id.rgUserType);
        RadioGroup rgImage = findViewById(R.id.rgImageGroup);

        switch(rgUserType.getCheckedRadioButtonId()){
            case R.id.radioButtonSahko:
                RadioButton radioButton1 = findViewById(R.id.radioButtonSahko);
                Tutkinto = radioButton1.getText().toString();
                break;

            case R.id.radioButtonTite:
                RadioButton radioButton2 = findViewById(R.id.radioButtonTite);
                Tutkinto = radioButton2.getText().toString();
                break;

            case R.id.radioButtonLate:
                RadioButton radioButton3 = findViewById(R.id.radioButtonLate);
                Tutkinto = radioButton3.getText().toString();
                break;

            case R.id.radioButtonTuta:
                RadioButton radioButton4 = findViewById(R.id.radioButtonTuta);
                Tutkinto = radioButton4.getText().toString();
                break;
        }

        switch(rgImage.getCheckedRadioButtonId()){
            case R.id.radioButtonKuva1:
                addImage=R.drawable.stockman;
                break;

            case R.id.radioButtonKuva2:
                addImage=R.drawable.stockwomann;
                break;


        }



UserStorage.getInstance().addStudentToList(new User(Etunimi, Sukunimi, sahkari, Tutkinto, addImage));

    }
}