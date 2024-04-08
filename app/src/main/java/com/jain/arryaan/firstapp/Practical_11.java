package com.jain.arryaan.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.StringBuffer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class Practical_11 extends AppCompatActivity {
    Button b1,btn2;
    CheckBox c1,c2,c3,c4,c5;
    String s;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_11);
        s ="Your Subjects are:- ";
        b1=(Button) findViewById(R.id.b1);
        c1=(CheckBox) findViewById(R.id.c1);
        c2=(CheckBox) findViewById(R.id.c2);
        c3=(CheckBox) findViewById(R.id.c3);
        c4=(CheckBox) findViewById(R.id.c4);
        c5=(CheckBox) findViewById(R.id.c5);
        btn2 = (Button) findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(c1.isChecked())
                {
                    s = s + c1.getText()+" ";
                }
                if(c2.isChecked())
                {
                    s = s + c2.getText()+" ";
                }
                if(c3.isChecked())
                {
                    s = s + c3.getText()+" ";
                }
                if(c4.isChecked())
                {
                    s = s + c4.getText()+" ";
                }
                if(c5.isChecked())
                {
                    s = s + c5.getText()+" ";
                }
                Toast.makeText(Practical_11.this,s,Toast.LENGTH_SHORT).show();
                s = "Your Subjects are:- ";
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Practical_11.this,Practical_12.class);
                startActivity(intent);
            }
        });
    }
}
