package com.example.lifeskillapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreGradeOneSubjects extends AppCompatActivity {

    Button back, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_grade_one_subjects);

        //pre and primary education buttons
        back = (Button) findViewById(R.id.button1);
        home = (Button) findViewById(R.id.button2);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPreEducation = new Intent(PreGradeOneSubjects.this, PreEducation.class);
                startActivity(goToPreEducation);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMainActivity = new Intent(PreGradeOneSubjects.this, MainActivity.class);
                startActivity(goToMainActivity);
            }
        });
    }
}