package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question3Activity extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        Intent recInt = getIntent();
        score = recInt.getIntExtra("Score2", score);

    }

    public void checkAnswer3(View view) {
        if (view.getId() == R.id.correct_answer3){
            score++;
        }

    }

    public void moveToQuestion4(View view) {
        Intent intent = new Intent(this, Question4Activity.class);
        intent.putExtra("Score3", score);


        this.startActivity(intent);
    }
}