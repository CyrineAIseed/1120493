package com.example.ahmadfursan.firstassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int Rand = setRandomNumber();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText EnteredNumber = (EditText)findViewById(R.id.EditText);
        Button Check = (Button)findViewById(R.id.Button1);
        Button Generates = (Button)findViewById(R.id.Button2);

        Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int CheckedNumber = Integer.parseInt(EnteredNumber.getText().toString());
                if (CheckedNumber > Rand + 5) {
                    Toast.makeText(getBaseContext(), "Your Entered Number Is Greater Than The Random Number", Toast.LENGTH_LONG).show();
                } else if (CheckedNumber < Rand - 5) {

                    Toast.makeText(getBaseContext(), "Your Entered Number Is Smaller Than The Random Number", Toast.LENGTH_LONG).show();

                } else if (CheckedNumber == Rand) {
                    Toast.makeText(getBaseContext(), "Your Rock, STRIKE ", Toast.LENGTH_LONG).show();


                } else
                    Toast.makeText(getBaseContext(), "Your Entered Number Is Very Close", Toast.LENGTH_LONG).show();
            }
            });

        Generates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rand= setRandomNumber();
            }
        });
    }

    int setRandomNumber(){

        Random R = new Random();
        int Number = R.nextInt(1000)+0 ;

        return Number ;


    }

}
