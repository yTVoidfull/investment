package com.example.alplesca.graweinvestmentcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class InvestmentCalculator extends AppCompatActivity {

    EditText age;
    EditText amount;
    EditText period;
    Button buttonCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investment_calculator);

        age = findViewById(R.id.ageInput);
        amount = findViewById(R.id.amountInput);
        period = findViewById(R.id.periodInput);
        buttonCreate = findViewById(R.id.buttonCommonCalculate);
    }
}
