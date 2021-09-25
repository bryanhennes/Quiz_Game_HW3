package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question2Activity extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Intent recInt = getIntent();
        score = recInt.getIntExtra("Score1", score);


    }

    public void checkAnswer2(View view) {
        if (view.getId() == R.id.correct_answer2){
            score++;
        }

    }

    public void moveToQuestion3(View view) {
        Intent intent = new Intent(this, Question3Activity.class);
        intent.putExtra("Score2", score);
        this.startActivity(intent);

    }
}