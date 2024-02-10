package com.jain.arryaan.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button PR4 = findViewById(R.id.PR4);
        PR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to go to the next screen
                Intent intent = new Intent(MainActivity.this, Practical_4.class);
                startActivity(intent);
            }
        });
    }
}