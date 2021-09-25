package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question5Activity extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        Intent recInt = getIntent();
        score = recInt.getIntExtra("Score4", score);

    }

    public void checkAnswer5(View view) {
        if (view.getId() == R.id.correct_answer5){
            score++;
        }

    }

    public void moveToQuestion6(View view) {
        Intent intent = new Intent(this, Question6Activity.class);
        intent.putExtra("Score5", score);

        this.startActivity(intent);
    }
}