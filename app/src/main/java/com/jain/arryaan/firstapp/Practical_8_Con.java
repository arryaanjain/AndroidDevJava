package com.jain.arryaan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Practical_8_Con extends AppCompatActivity {
    String subs[] = {"PHP", "PWP", "ETI", "MAD", "EDE", "MGT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_8_con);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,subs);
        AutoCompleteTextView ac = (AutoCompleteTextView) findViewById(R.id.a1);
        ac.setThreshold(1);
        ac.setAdapter(adapter);
        Button pr9_con = findViewById(R.id.a2);
        pr9_con.setOnClickListener(v -> {
            Intent intent = new Intent(Practical_8_Con.this, Practical_9.class);
            startActivity(intent);
        });
    }
}
