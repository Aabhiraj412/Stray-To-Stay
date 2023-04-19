package com.example.puppyportal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cat_Detail_Activity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_detail);
        Button btn = findViewById(R.id.loc_btn);

        Button adopt_button = findViewById(R.id.adopt_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Cat_Detail_Activity.this, "Location", Toast.LENGTH_SHORT).show();
            }
        });


        adopt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Cat_Detail_Activity.this, "Congratulations", Toast.LENGTH_SHORT).show();
            }
        });
    }
}