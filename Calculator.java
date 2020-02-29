package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1 = (EditText)findViewById(R.id.Number1);
        final EditText e2 = (EditText)findViewById(R.id.Number2);
        final Button add = (Button)findViewById(R.id.button);
        final Button sub = (Button)findViewById(R.id.button2);
        final Button mul = (Button)findViewById(R.id.button3);
        final Button div = (Button)findViewById(R.id.button4);
        final TextView tv=(TextView)findViewById(R.id.Answer);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                int ans=num1+num2;
                tv.setText(ans);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                int ans=num1-num2;
                tv.setText(ans);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                int ans=num1*num2;
                tv.setText(ans);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                int ans=num1/num2;
                tv.setText(ans);
            }
        });



    }
