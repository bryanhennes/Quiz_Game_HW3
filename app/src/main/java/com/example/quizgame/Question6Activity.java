package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question6Activity extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);

        Intent recInt = getIntent();
        score = recInt.getIntExtra("Score5", score);

    }

    public void checkAnswer6(View view) {
        if (view.getId() == R.id.correct_answer6){
            score++;
        }

    }


    public void moveToQuestion7(View view) {
        Intent intent = new Intent(this, Question7Activity.class);
        intent.putExtra("Score6", score);
        this.startActivity(intent);
    }
}