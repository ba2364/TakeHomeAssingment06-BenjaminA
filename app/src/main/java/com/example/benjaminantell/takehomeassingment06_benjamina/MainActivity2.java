package com.example.benjaminantell.takehomeassingment06_benjamina;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        display = (TextView) findViewById(R.id.display);
        Intent intent = getIntent();
        String receipt = intent.getStringExtra(Keys.RECEIPT);
        String title = intent.getStringExtra("TITLE_STRING");
        display.setText(receipt);
        setTitle(title);
    }
}