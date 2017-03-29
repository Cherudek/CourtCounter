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
    int penaltiesTeamA = 0;
    int penaltiesTeamB = 0;
    int faultsTeamA = 0;
    int faultsTeamB = 0;


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
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays number of Goals for Team A stats Window
     */
    public void showGoalsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalsTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of Goals for Team B Stats Window
     */
    public void showGoalsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalsTeamB);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays number of Penalties for Team A stats Window
     */
    public void showPenaltiesTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltiesA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of Penalties for Team B stats Window
     */
    public void showPenaltiesTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltiesB);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays number of Faults for Team A stats Window
     */
    public void showFaultsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faultsA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of Faults for Team B stats Window
     */
    public void showFaultsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faultsB);
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
     * Decrease by 1 score + goals for Team A.
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

    /**
     * Increase penalties by 1 for Team A.
     */
    public void plusPenaltyA(View view) {
        penaltiesTeamA = penaltiesTeamA + 1;
        showPenaltiesTeamA(penaltiesTeamA);
    }

    /**
     * Decrease penalties by 1 for Team A.
     */
    public void minusPenaltyA(View view) {
        penaltiesTeamA = penaltiesTeamA - 1;
        showPenaltiesTeamA(penaltiesTeamA);
    }

    /**
     * Increase penalties by 1 for Team B.
     */
    public void plusPenaltyB(View view) {
        penaltiesTeamB = penaltiesTeamB + 1;
        showPenaltiesTeamB(penaltiesTeamB);
    }

    /**
     * Decrease penalties by 1 for Team B.
     */
    public void minusPenaltyB(View view) {
        penaltiesTeamB = penaltiesTeamB - 1;
        showPenaltiesTeamB(penaltiesTeamB);
    }

    /**
     * Increase faults by 1 for Team A.
     */
    public void plusFaultA(View view) {
        faultsTeamA = faultsTeamA + 1;
        showFaultsTeamA(faultsTeamA);
    }

    /**
     * Decrease faults by 1 for Team A.
     */
    public void minusFaultA(View view) {
        faultsTeamA = faultsTeamA - 1;
        showFaultsTeamA(faultsTeamA);
    }

    /**
     * Increase faults by 1 for Team B.
     */
    public void plusFaultB(View view) {
        faultsTeamB = faultsTeamB + 1;
        showFaultsTeamB(faultsTeamB);
    }

    /**
     * Decrease faults by 1 for Team B.
     */
    public void minusFaultB(View view) {
        faultsTeamB = faultsTeamB - 1;
        showFaultsTeamB(faultsTeamB);
    }


    public void resetScoreAB (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        goalsTeamA = 0;
        goalsTeamB = 0;
        penaltiesTeamA = 0;
        penaltiesTeamB = 0;
        faultsTeamA = 0;
        faultsTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        showGoalsTeamA(goalsTeamA);
        showGoalsTeamB(goalsTeamB);
        showPenaltiesTeamA(penaltiesTeamA);
        showPenaltiesTeamB(penaltiesTeamB);
        showFaultsTeamB(faultsTeamB);
        showFaultsTeamA(faultsTeamA);

    }


}
