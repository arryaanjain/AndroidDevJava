package com.jain.arryaan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Practical_7_Con extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    Button b1; String s;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_7_con);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t5=(TextView)findViewById(R.id.t5);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s="Name:- "+t1.getText().toString() + "\nAge: "+t2.getText().toString() +
                        "\nD.O.B: "+t3.getText().toString() + "\nMobile no: " +
                        t4.getText().toString() + "\nEmail: "+t5.getText().toString();
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Practical_7_Con.this,Practical_8.class);
                startActivity(intent);
            }
        });
    }
}
