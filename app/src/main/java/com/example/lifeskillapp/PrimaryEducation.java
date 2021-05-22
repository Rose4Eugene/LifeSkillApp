package com.example.lifeskillapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimaryEducation extends AppCompatActivity {

    Button back,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_education);

        //pre and primary education buttons
        back=(Button)findViewById(R.id.button1);
        home=(Button)findViewById(R.id.button2);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent goToPreMainActivity = new Intent(PrimaryEducation.this, MainActivity.class);
                startActivity(goToPreMainActivity);
            }
        });

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent goToPreMainActivity = new Intent(PrimaryEducation.this, MainActivity.class);
                startActivity(goToPreMainActivity);
            }
        });
    }
}