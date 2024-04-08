package com.jain.arryaan.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Practical_9_Con extends AppCompatActivity {

    private TextView display;
    private String currentInput = "";
    private double firstNumber = 0;
    private double secondNumber = 0;
    private String operator = "";
    private boolean isNewCalculation = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_9_con);

        display = findViewById(R.id.display);
    }

    public void onNumberClick(View view) {
        if (isNewCalculation) {
            display.setText("");
            isNewCalculation = false;
        }
        String value = ((Button) view).getText().toString();
        currentInput += value;
        display.setText(currentInput);
    }

    public void onOperatorClick(View view) {
        if (!currentInput.isEmpty()) {
            firstNumber = Double.parseDouble(currentInput);
            operator = ((Button) view).getText().toString();
            isNewCalculation = true;
        }
    }

    public void onPR10Click(View view) {
        Intent intent = new Intent(Practical_9_Con.this,Practical_10.class);
        startActivity(intent);
    }

    public void onEqualsClick(View view) {
        if (!currentInput.isEmpty()) {
            secondNumber = Double.parseDouble(currentInput);
            double result = performOperation(firstNumber, secondNumber, operator);
            display.setText(String.valueOf(result));
            isNewCalculation = true;
            currentInput = String.valueOf(result);
        }
    }

    public void onClearClick(View view) {
        currentInput = "";
        firstNumber = 0;
        secondNumber = 0;
        operator = "";
        isNewCalculation = true;
        display.setText("");
    }

    private double performOperation(double firstNumber, double secondNumber, String operator) {
        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber != 0) {
                    return firstNumber / secondNumber;
                } else {
                    return Double.NaN; // Indicate division by zero
                }
            default:
                return Double.NaN; // Indicate invalid operator
        }
    }
}
