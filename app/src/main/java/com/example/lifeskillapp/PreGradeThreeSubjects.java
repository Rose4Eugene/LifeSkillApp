package com.example.lifeskillapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreGradeThreeSubjects extends AppCompatActivity {

    Button back, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_grade_three_subjects);

        back = (Button) findViewById(R.id.button1);
        home = (Button) findViewById(R.id.button2);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPreGradeTwoSubjects = new Intent(PreGradeThreeSubjects.this, PreGradeTwoSubjects.class);
                startActivity(goToPreGradeTwoSubjects);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMainActivity = new Intent(PreGradeThreeSubjects.this, MainActivity.class);
                startActivity(goToMainActivity);
            }
        });
    }
}