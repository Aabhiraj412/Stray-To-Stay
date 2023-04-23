package com.example.puppyportal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ValueEventListener;

public class Test_Activity extends AppCompatActivity {

    Button btn;

    TextView loc, disc;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Button adopt_button = findViewById(R.id.adopt_btn);

        btn = findViewById(R.id.loc_btn);

        loc = findViewById(R.id.location);

        disc = findViewById(R.id.description);

        Intent intent = getIntent();


        String loc_1 = getIntent().getStringExtra("location");
        String disc_1 = getIntent().getStringExtra("description");


        loc.setText(loc_1);

        disc.setText(disc_1);



        adopt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adopt_button.setBackgroundColor(Color.BLUE);
//                Toast.makeText(Test_Activity.this, loc_1, Toast.LENGTH_SHORT).show();

                Toast.makeText(Test_Activity.this, "Congratulations", Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Test_Activity.this, "Location", Toast.LENGTH_SHORT).show();
            }
        });

    }
}