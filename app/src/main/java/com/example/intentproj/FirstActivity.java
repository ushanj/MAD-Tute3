package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE1 = "com.example.IntentProj.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.example.IntentProj.MESSAGE2";

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    //Calling this method when user click "ok" button
    public void sendMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);


        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        String message1 = editText1.getText().toString();
        String message2 = editText2.getText().toString();

        intent.putExtra(EXTRA_MESSAGE1, message1 );
        intent.putExtra(EXTRA_MESSAGE2, message2 );

        startActivity(intent);

        // Create a TOAST
        Context context = getApplicationContext();

        CharSequence message = "Clicked the OK button please wait....";

        int duration = Toast.LENGTH_SHORT; //How long the toast

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP| Gravity.LEFT, 300, 2000);



    }



}