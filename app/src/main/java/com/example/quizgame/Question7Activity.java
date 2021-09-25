package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question7Activity extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
        Intent recInt = getIntent();
        score = recInt.getIntExtra("Score6", score);


    }

    public void checkAnswer7(View view) {
        if (view.getId() == R.id.correct_answer7){
            score++;
        }
    }

    public void moveToStatsPage(View view) {
        Intent intent = new Intent(this, StatsActivity.class);
        intent.putExtra("Score7", score);
        this.startActivity(intent);
    }
}