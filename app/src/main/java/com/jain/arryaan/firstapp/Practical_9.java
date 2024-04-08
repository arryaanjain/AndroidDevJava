package com.jain.arryaan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Practical_9 extends AppCompatActivity {
    Button btn,btn2; ToggleButton tgbtn; ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_9);
        btn = (Button) findViewById(R.id.btn);
        tgbtn = (ToggleButton) findViewById(R.id.tg);
        imgbtn = (ImageButton) findViewById(R.id.img1);
        btn2 = (Button) findViewById(R.id.to10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = (String) tgbtn.getText();
                Toast.makeText(Practical_9.this, s, Toast.LENGTH_SHORT).show();
            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Practical_9.this, "Vidyalankar Polytechnic", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practical_9.this, Practical_9_Con.class);
                startActivity(intent);
            }
        });
    }
}
