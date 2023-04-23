package com.example.puppyportal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cow_Detail_Activity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cow_detail);
        Button btn = findViewById(R.id.loc_btn);
        Button adopt_button = findViewById(R.id.adopt_btn);

        adopt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adopt_button.setBackgroundColor(Color.BLUE);
                Toast.makeText(Cow_Detail_Activity.this, "Congratulations" , Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Cow_Detail_Activity.this, "Location", Toast.LENGTH_SHORT).show();
            }
        });
    }
}