package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView gold,silver,cash,total;
    Button cal;
    int totalVal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gold = (TextView)findViewById(R.id.editTextNumber);
        silver = (TextView) findViewById(R.id.editTextNumber2);
        cash = (TextView) findViewById(R.id.editTextNumber3);
        total = (TextView) findViewById(R.id.editTextNumber4);
        cal = (Button) findViewById(R.id.button);


        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int gold_price = Integer.parseInt(gold.getText().toString());
                totalVal += gold_price;
            }
        });
        silver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int silver_price = Integer.parseInt(silver.getText().toString());
                totalVal += silver_price;
            }
        });
        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cash_price = Integer.parseInt(cash.getText().toString());
                totalVal += cash_price;
            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double zakkat = totalVal * 0.025f;
                String ans = String.valueOf(zakkat);
                total.setText(ans);
            }
        });

    }
}