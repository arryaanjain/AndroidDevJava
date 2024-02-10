package com.jain.arryaan.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Practical_5 extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_5);
        Button PR5 = findViewById(R.id.pr5_con);
        PR5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to go to the next screen
                Intent intent = new Intent(Practical_5.this, Practical_5_Con.class);
                startActivity(intent);
            }
        });
    }
}

