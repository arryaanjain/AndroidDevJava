package com.jain.arryaan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Practical_10_Con extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_10_con);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                String validUsername = "student";
                String validPassword = "1234";

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    Toast.makeText(Practical_10_Con.this, "Login successful!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Practical_10_Con.this, "Invalid username or password. Please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button pr11 = findViewById(R.id.toPr11);
        pr11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practical_10_Con.this, Practical_11.class);
                startActivity(intent);
            }
        });
    }
}

