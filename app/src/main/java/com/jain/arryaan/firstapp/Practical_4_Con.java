package com.jain.arryaan.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Practical_4_Con  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_4_con);
        Button PR4 = findViewById(R.id.PR);
        PR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the action to go to the next screen
                Intent intent = new Intent(Practical_4_Con.this, Practical_9_Con.class);
                startActivity(intent);
            }
        });
    }
}
