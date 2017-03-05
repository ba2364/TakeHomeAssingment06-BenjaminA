package com.example.benjaminantell.takehomeassingment06_benjamina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText subtotal;
    private EditText tax;
    private EditText tip;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subtotal = (EditText) findViewById(R.id.subtotal);
        tax = (EditText) findViewById(R.id.tax);
        tip = (EditText) findViewById(R.id.tip);
    }

    public void submit(View view)
    {
        double userAmount = Double.parseDouble(subtotal.getText().toString());
        double taxPercent = Double.parseDouble(tax.getText().toString());
        double tipPercent = Double.parseDouble(tip.getText().toString());
        String receipt = "Subtotal: $" + userAmount + "\n" + "Tax: $" + (taxPercent*userAmount) + "\n" + "Tip: $" + (tipPercent*userAmount) + "\n" + "Total: $" + (userAmount + (taxPercent*userAmount) + (tipPercent*userAmount));
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(Keys.RECEIPT, receipt);
        intent.putExtra("TITLE_STRING", "Your Receipt");
        startActivity(intent);
    }
}