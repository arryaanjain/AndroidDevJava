package com.jain.arryaan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Practical_6_Con extends AppCompatActivity {
        private ListView mListView;
    private ArrayAdapter aAdapter;
    private String[] users = { "Integer", "Float", "Double", "Charecter"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_6_con);
        mListView = (ListView) findViewById(R.id.userlist);
        aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        mListView.setAdapter(aAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
// ListView Clicked item index
                int itemPosition = position;
// ListView Clicked item value
                String itemValue = (String) mListView.getItemAtPosition(position);
// Show Alert
                Toast.makeText(getApplicationContext(),
                                itemValue , Toast.LENGTH_LONG)
                        .show();
            }
        });
        Button pr7 = findViewById(R.id.pr7New);
        pr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practical_6_Con.this,Practical_7.class);
                startActivity(intent);
            }
        });
    }
}