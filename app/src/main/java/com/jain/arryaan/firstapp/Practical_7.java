package com.jain.arryaan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Practical_7 extends AppCompatActivity {
    EditText uname, upass;
    Button submit;
    String defname="admin"; String defpass="admin123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_7);
        uname=(EditText)findViewById(R.id.t2);
        upass=(EditText)findViewById(R.id.t3);
        submit=(Button)findViewById(R.id.t4);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(uname.getText().toString().equals(defname) && upass.getText().toString().equals(defpass)){ Toast.makeText(Practical_7.this,"Login Successful",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Practical_7.this,"Login Unsuccessful, invalid credentials",Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(Practical_7.this,Practical_7_Con.class);
                startActivity(intent);
            }
        });
    }
}
