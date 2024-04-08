package com.jain.arryaan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Practical_8 extends AppCompatActivity {
    String[] fruits ={ "Apple" , "Grapes","Kiwi", "Banana","Orange","Lemon"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_8);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,fruits);
        AutoCompleteTextView ac = (AutoCompleteTextView)findViewById(R.id.t2New);
        ac.setThreshold(1);
        ac.setAdapter(adapter);
        Button pr8_con = findViewById(R.id.t3);
        pr8_con.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Practical_8.this, Practical_8_Con.class);
                startActivity(intent);
            }
        });
    }
}
