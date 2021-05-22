package com.example.lifeskillapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreEducation extends AppCompatActivity {
    Button back, home;
    CardView card1, card2, card3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_education);

        //pre and primary education buttons
        back = (Button) findViewById(R.id.button1);
        home = (Button) findViewById(R.id.button2);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMainActivity = new Intent(PreEducation.this, MainActivity.class);
                startActivity(goToMainActivity);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMainActivity = new Intent(PreEducation.this, MainActivity.class);
                startActivity(goToMainActivity);
            }
        });


        //Cards
        card1 = (CardView) findViewById(R.id.card_view);
        card2 = (CardView) findViewById(R.id.card_view2);
        card3 = (CardView) findViewById(R.id.card_view3);

        card1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent goToPreGradeOneSubjects = new Intent(PreEducation.this, PreGradeOneSubjects.class);
                startActivity(goToPreGradeOneSubjects);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent goToPreGradeTwoSubjects = new Intent(PreEducation.this, PreGradeTwoSubjects.class);
                startActivity(goToPreGradeTwoSubjects);
            }
        });


        card3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent goToPreGradeThreeSubjects = new Intent(PreEducation.this, PreGradeThreeSubjects.class);
                startActivity(goToPreGradeThreeSubjects);
            }
        });


    }
}



