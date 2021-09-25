package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question4Activity extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        Intent recInt = getIntent();
        score = recInt.getIntExtra("Score3", score);

    }

    public void checkAnswer4(View view) {
        if (view.getId() == R.id.correct_answer4){
            score++;
        }

    }

    public void moveToQuestion5(View view) {
        Intent intent = new Intent(this, Question5Activity.class);
        intent.putExtra("Score4", score);
        this.startActivity(intent);
    }
}