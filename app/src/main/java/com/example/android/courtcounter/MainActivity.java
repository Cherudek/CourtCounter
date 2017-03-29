package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int goalsTeamA = 0;
    int goalsTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A stats Window
     */
    public void showGoalsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalsTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B Stats Window
     */
    public void showGoalsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalsTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase by 1 score + goals for Team A.
     */
    public void plusGoalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        showGoalsTeamA(scoreTeamA);
    }


    /**
     * Increase by 1 score + goals for Team B.
     */
    public void plusGoalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        showGoalsTeamB(scoreTeamB);
    }
    /**
     * Decrease score + goals by 1 for Team A.
     */
    public void minusGoalA(View view) {
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
        showGoalsTeamA(scoreTeamA);
    }
    /**
     * Decrease score + goals by 1 for Team B.
     */
    public void minusGoalB(View view) {
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
        showGoalsTeamB(scoreTeamB);
    }


    public void resetScoreAB (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        goalsTeamA = 0;
        goalsTeamB = 0;
        showGoalsTeamA(goalsTeamA);
        showGoalsTeamB(goalsTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
