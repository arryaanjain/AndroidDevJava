package com.jain.arryaan.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Practical_12 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_12);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button btn = (Button) findViewById(R.id.button);
        RadioButton btn1 = (RadioButton) findViewById(R.id.radio1);
        RadioButton btn2 = (RadioButton) findViewById(R.id.radio2);
        Button toPr13 = (Button) findViewById(R.id.toPr13);
        btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(Practical_12.this,"Radio Button 1 clicked",Toast.LENGTH_SHORT).show();
           }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(Practical_12.this,"Radio Button 2 clicked",Toast.LENGTH_SHORT).show();
           }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // If no radio button is selected
                if (selectedId == -1) {
                    Toast.makeText(Practical_12.this, "Please select an option", Toast.LENGTH_SHORT).show();
                } else {
                    RadioButton selectedRadioButton = findViewById(selectedId);
                    String selectedText = selectedRadioButton.getText().toString();
                    Toast.makeText(Practical_12.this, "Selected option: " + selectedText, Toast.LENGTH_SHORT).show();
                }
            }
        });
        toPr13.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Practical_12.this,Practical_13.class);
               startActivity(intent);
           }
        });
    }
}