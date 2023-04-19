package com.example.puppyportal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class SignUp_Activity extends AppCompatActivity {

    Button btn;

    EditText username, email, password, number;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();

        btn = findViewById(R.id.btn);
        username = findViewById(R.id.user_name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.passward);
        number = findViewById(R.id.number);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String e_mail = email.getText().toString();
                String passWord = password.getText().toString();
                String phone = number.getText().toString();




                if (user.isEmpty()) {
                    username.setError("This field is required");
                } else if (e_mail.isEmpty()) {
                    email.setError("This Field is required");

                }

                else if (passWord.isEmpty()) {
                    password.setError("This Field is required");

                } else if (phone.isEmpty()) {
                    number.setError("This Field is required");

                } else {

                    emailValidator(email);

                    // Do something with the input
                }

            }
        });

    }

    public  void emailValidator (EditText email){

        String emailTotext = email.getText().toString();

        if (!emailTotext.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailTotext).matches()){
            Toast.makeText(this, "Email Verified", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignUp_Activity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(this, "Enter Valid Email !", Toast.LENGTH_SHORT).show();
        }
    }


}