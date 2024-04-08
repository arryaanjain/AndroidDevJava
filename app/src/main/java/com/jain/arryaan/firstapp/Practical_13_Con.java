package com.jain.arryaan.firstapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;

public class Practical_13_Con extends AppCompatActivity {
    AlertDialog dialog;
    Activity activity;
    Practical_13_Con(Activity thisactivity) {
        activity = thisactivity;
    }

    void showDialog() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);

        LayoutInflater inflator = activity.getLayoutInflater();
        builder.setView(inflator.inflate(R.layout.practical_13_con,null));
        dialog = builder.create();
        dialog.show();
    }

    void dismissBar() {
        dialog.dismiss();
    }

}
