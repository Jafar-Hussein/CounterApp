package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView counterText, welcomeText;
    Button IncreaseBtn, decreaseBtn;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterText = findViewById(R.id.counterText);
        welcomeText = findViewById(R.id.welcometext);
        IncreaseBtn = findViewById(R.id.btn);
        decreaseBtn = findViewById(R.id.decrementBtn);
        IncreaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // call increment method
               increment(v);
            }
        });
        decreaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement(v);
            }
        });
    }

    public void increment(View view) {
        // increments the counter
       ++counter;
       // set the counter text to the value of counter
         counterText.setText(String.valueOf(counter));
    }

    public void decrement(View view) { // decrement
        --counter;
        // if counter is less than 0, set counter to 0 because we can't have negative numbers
        if (counter < 0){
            counter = 0;
        } else { // else set counter to the value of counter
            counterText.setText(String.valueOf(counter));
        }

    }
}