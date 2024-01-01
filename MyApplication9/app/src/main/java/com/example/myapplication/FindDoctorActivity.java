package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);
        CardView back=findViewById(R.id.cardFDBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindDoctorActivity.this,HomeActivity.class));

            }
        });
        CardView famPhysicians=findViewById(R.id.cardFDFamilyPhysician);
        famPhysicians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(FindDoctorActivity.this,DoctorDetailsActiviy.class);
                it.putExtra("title","Family Physicians");
                startActivity(it);
            }
        });
        CardView famDietician=findViewById(R.id.cardFDDietician);
        famDietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(FindDoctorActivity.this,DoctorDetailsActiviy.class);
                it.putExtra("title","Dietician");
                startActivity(it);
            }
        });
        CardView dentist=findViewById(R.id.cardFDDentist);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(FindDoctorActivity.this,DoctorDetailsActiviy.class);
                it.putExtra("title","Dentist");
                startActivity(it);
            }
        });
        CardView surgeon=findViewById(R.id.cardFDSurgeon);
        surgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(FindDoctorActivity.this,DoctorDetailsActiviy.class);
                it.putExtra("title","Surgeon");
                startActivity(it);
            }
        });
        CardView cardiologist=findViewById(R.id.cardFDCardiologist);
        cardiologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(FindDoctorActivity.this,DoctorDetailsActiviy.class);
                it.putExtra("title","Cardiologist");
                startActivity(it);
            }
        });


    }
}