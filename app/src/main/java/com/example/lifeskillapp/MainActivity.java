package com.example.lifeskillapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button preEducation,primaryEducation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //pre and primary education buttons
        preEducation=(Button)findViewById(R.id.pre_education_button1);
        primaryEducation=(Button)findViewById(R.id.primary_education_button2);

        preEducation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent goToPreEducation = new Intent(MainActivity.this, PreEducation.class);
                startActivity(goToPreEducation);
            }
        });


        primaryEducation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent goToPrimaryEducation = new Intent(MainActivity.this, PrimaryEducation.class);
                startActivity(goToPrimaryEducation);
            }
        });


    }
}