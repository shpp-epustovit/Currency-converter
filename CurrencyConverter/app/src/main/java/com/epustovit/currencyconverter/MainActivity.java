package com.epustovit.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double dollar_grivna_rate = 25.85;
    double rate;

    public void convertCurrency(View view) {

        EditText currency = (EditText) findViewById(R.id.currency);
        rate = Double.parseDouble(currency.getText().toString()) * dollar_grivna_rate;

        Log.i("UAH", String.valueOf(rate));

        Toast.makeText(MainActivity.this, "UAH " + String.valueOf(rate),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
