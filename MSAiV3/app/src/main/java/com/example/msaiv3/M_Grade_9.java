package com.example.msaiv3;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class M_Grade_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mgrade9);

        Button buttonOption1 = findViewById(R.id.buttonOption1);
        Button buttonOption2 = findViewById(R.id.buttonOption2);
        Button buttonOption3 = findViewById(R.id.buttonOption3);
        Button buttonOption4 = findViewById(R.id.buttonOption4);
        ImageButton buttonHome = findViewById(R.id.buttonHome);

        buttonOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(M_Grade_9.this, Math9_Q1.class);
                // intent.putExtra("PDF_FILE_NAME", "MATH_q1_Clas1.pdf");
                startActivity(intent);
            }
        });

        buttonOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(M_Grade_9.this, Math9_Q2.class);
                startActivity(intent);
            }
        });

        buttonOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(M_Grade_9.this, Math9_Q3.class);
                startActivity(intent);
            }
        });

        buttonOption4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(M_Grade_9.this, Math9_Q4.class);
                startActivity(intent);
            }
        });

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(M_Grade_9.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }}