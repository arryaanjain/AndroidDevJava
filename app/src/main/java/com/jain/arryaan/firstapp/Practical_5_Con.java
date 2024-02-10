package com.jain.arryaan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Practical_5_Con extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_5_con);
        Button pr5Con = findViewById(R.id.pr6);
        pr5Con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to go to the next screen
                Intent intent = new Intent(Practical_5_Con.this, Practical_6.class);
                startActivity(intent);
            }
        });
    }
}
