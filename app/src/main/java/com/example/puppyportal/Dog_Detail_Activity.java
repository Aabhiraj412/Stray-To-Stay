package com.example.puppyportal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dog_Detail_Activity extends AppCompatActivity {

    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);

        Button adopt_button = findViewById(R.id.adopt_btn);

        btn = findViewById(R.id.loc_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dog_Detail_Activity.this, "Location", Toast.LENGTH_SHORT).show();
            }
        });


        adopt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dog_Detail_Activity.this, "Congratulations", Toast.LENGTH_SHORT).show();
            }
        });
    }
}