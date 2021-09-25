package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StatsActivity extends AppCompatActivity {
TextView calculateStats;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        Intent recInt = getIntent();
        score = recInt.getIntExtra("Score7", score);

        calculateStats = (TextView) findViewById(R.id.calculateScore);
        setScore(calculateStats);

    }

    public void setScore(TextView stats){
       stats.setText("Final score: " + score + "/ 7");

    }
}