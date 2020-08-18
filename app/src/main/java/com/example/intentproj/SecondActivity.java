package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        final String message1 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE1);
        final String message2 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE2);

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        editText1.setText(message1);
        editText2.setText(message2);


        final int m1 = Integer.parseInt(message1);
        final int m2 = Integer.parseInt(message2);

        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        textView= findViewById(R.id.textView5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               int ans = m1 + m2;
                textView.setText(m1+"+"+m2+"="+ans);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(m1+"-"+m2+"="+(m1-m2));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(m1+"x"+m2+"="+(m1*m2));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(m1+"/"+m2+"="+(m1/m2));
            }
        });
    }
}