package com.jain.arryaan.firstapp;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Practical_6_Con extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.practical_6_con);


            // Create TextViews for each data type
            TextView intTextView = new TextView(this);
            intTextView.setText("int: " + Integer.MAX_VALUE);

            TextView doubleTextView = new TextView(this);
            doubleTextView.setText("double: " + Double.MAX_VALUE);

            TextView booleanTextView = new TextView(this);
            booleanTextView.setText("boolean: " + Boolean.TRUE);

            TextView charTextView = new TextView(this);
            charTextView.setText("char: " + Character.MAX_VALUE);

            TextView stringTextView = new TextView(this);
            stringTextView.setText("String: Hello, world!");

            // Add TextViews to FrameLayout
            FrameLayout frameLayout = findViewById(R.id.frameLayout);
            frameLayout.addView(intTextView);
            frameLayout.addView(doubleTextView);
            frameLayout.addView(booleanTextView);
            frameLayout.addView(charTextView);
            frameLayout.addView(stringTextView);
        }
}
