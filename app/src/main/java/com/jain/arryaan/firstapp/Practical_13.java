package com.jain.arryaan.firstapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Practical_13 extends AppCompatActivity {
  Button p1,p2;
  CardView cardView;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_13);
        p1 = (Button) findViewById(R.id.pgbar1);
        p2 = (Button) findViewById(R.id.pgbar2);
        cardView = (CardView) findViewById(R.id.cardview);
        final Practical_13_Con loadingBar = new Practical_13_Con(Practical_13.this);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cardView.setVisibility(View.GONE);
                    }
                },5000);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingBar.showDialog();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadingBar.dismissBar();
                    }
                },5000);
                cardView.setVisibility(View.GONE);
            }
        });
    }
}
