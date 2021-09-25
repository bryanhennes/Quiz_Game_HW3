package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score;
    TextView titlePage;
    Button startGameButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titlePage = (TextView) findViewById(R.id.tv1);
        startGameButton = (Button) findViewById(R.id.startGameButton);

        score = 0;




    }

    //start question 1 when clicking start game
    public void startQuestion1(View view) {
        Intent intent = new Intent(this, Question1Activity.class);
        intent.putExtra("Score", score);
        this.startActivity(intent);

    }
}