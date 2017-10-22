package com.richa.currencyconvertor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String poundSymbol = "\u00a3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountInput);
        String amount = dollarAmountEditText.getText().toString();

        Double amountDouble = Double.parseDouble(amount);
        Double pound = amountDouble * 0.75;

        Toast.makeText(MainActivity.this, poundSymbol + String.format("%.2f", pound), Toast.LENGTH_SHORT).show();

        Log.i("amount", pound.toString());
    }
}

