package com.example.lab2part2correctstormee7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        double inputDouble = Double.parseDouble(str);
        inputDouble=inputDouble*0.78;
        textView2.setText("$"+str+" equals £"+ inputDouble);

    }
}
