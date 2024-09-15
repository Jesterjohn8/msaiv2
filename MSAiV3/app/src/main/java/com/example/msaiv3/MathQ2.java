package com.example.msaiv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.msaiv3.ui.math_quarter2.W1;
import com.example.msaiv3.ui.math_quarter2.W2;
import com.example.msaiv3.ui.math_quarter2.W3;
import com.example.msaiv3.ui.math_quarter2.W4;
import com.example.msaiv3.ui.math_quarter2.W5;
import com.example.msaiv3.ui.math_quarter2.W6;
import com.example.msaiv3.ui.math_quarter2.W7;
import com.example.msaiv3.ui.math_quarter2.W8;


public class MathQ2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_q2);

        ImageButton Week01 = findViewById(com.example.msaiv3.R.id.Week1);
        Week01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathQ2.this, W1.class);
                startActivity(intent);
            }
        });

        ImageButton Week02 = findViewById(com.example.msaiv3.R.id.Week2);
        Week02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathQ2.this, W2.class);
                startActivity(intent);
            }
        });

        ImageButton Week03 = findViewById(com.example.msaiv3.R.id.Week3);
        Week03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathQ2.this, W3.class);
                startActivity(intent);


            }});
        ImageButton Week04 = findViewById(com.example.msaiv3.R.id.Week4);
        Week04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathQ2.this, W4.class);
                startActivity(intent);

            }
        });

        ImageButton Week05 = findViewById(com.example.msaiv3.R.id.Week5);
        Week05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathQ2.this, W5.class);
                startActivity(intent);

            }
        });

        ImageButton Week06 = findViewById(com.example.msaiv3.R.id.Week6);
        Week06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathQ2.this, W6.class);
                startActivity(intent);

            }
        });
        ImageButton Week07 = findViewById(com.example.msaiv3.R.id.Week7);
        Week07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathQ2.this, W7.class);
                startActivity(intent);

            }
        });
        ImageButton Week08 = findViewById(com.example.msaiv3.R.id.Week8);
        Week08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MathQ2.this, W8.class);
                startActivity(intent);

            }
        });

    }
}