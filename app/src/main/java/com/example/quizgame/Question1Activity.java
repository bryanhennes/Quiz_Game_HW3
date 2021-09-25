package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Question1Activity extends AppCompatActivity {
    Button confirmQuestion1;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        confirmQuestion1 = (Button) findViewById(R.id.Confirm1);
        Intent recInt = getIntent();
        score = recInt.getIntExtra("Score", score);


    }

    public void checkAnswer1(View view) {


        if (view.getId() == R.id.correct_answer1){
            score++;
        }

    }

    public void moveToQuestion2(View view) {

        Intent intent = new Intent(this, Question2Activity.class);
        intent.putExtra("Score1", score);
        this.startActivity(intent);

    }
}