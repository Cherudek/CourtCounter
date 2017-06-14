package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * String variables for the onSaveInstanceState.
     */

    private static final String STATE_SCORE_TEAM_A = "stateScoreTeamA";
    private static final String STATE_SCORE_TEAM_B = "stateScoreTeamB";
    private static final String STATE_GOALS_TEAM_A = "stateGoalsTeamA";
    private static final String STATE_GOALS_TEAM_B = "stateGoalsTeamB";
    private static final String STATE_PENALTIES_TEAM_A = "statePenaltiesTeamA";
    private static final String STATE_PENALTIES_TEAM_B = "statePenaltiesTeamB";
    private static final String STATE_FAULTS_TEAM_A = "stateFaultsTeamA";
    private static final String STATE_FAULTS_TEAM_B = "stateFaultsTeamB";
    private static final String STATE_SHOTS_TEAM_A = "stateShotsTeamA";
    private static final String STATE_SHOTS_TEAM_B = "stateShotsTeamB";
    private static final String STATE_SAVES_TEAM_A = "stateSavesTeamA";
    private static final String STATE_SAVES_TEAM_B = "stateSavesTeamB";

    /**
     * Integer variables for Statistics and Score
     */

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int penaltiesTeamA = 0;
    int penaltiesTeamB = 0;
    int faultsTeamA = 0;
    int faultsTeamB = 0;
    int shotsTeamA = 0;
    int shotsTeamB = 0;
    int savesTeamA = 0;
    int savesTeamB = 0;

    // Override the onSaveInstanceState method, this will write the variables values to the Bundle

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(STATE_SCORE_TEAM_A, scoreTeamA);
        savedInstanceState.putInt(STATE_SCORE_TEAM_B, scoreTeamB);
        savedInstanceState.putInt(STATE_GOALS_TEAM_A, goalsTeamA);
        savedInstanceState.putInt(STATE_GOALS_TEAM_B, goalsTeamB);
        savedInstanceState.putInt(STATE_PENALTIES_TEAM_A, penaltiesTeamA);
        savedInstanceState.putInt(STATE_PENALTIES_TEAM_B, penaltiesTeamB);
        savedInstanceState.putInt(STATE_FAULTS_TEAM_A, faultsTeamA);
        savedInstanceState.putInt(STATE_FAULTS_TEAM_B, faultsTeamB);
        savedInstanceState.putInt(STATE_SHOTS_TEAM_A, shotsTeamA);
        savedInstanceState.putInt(STATE_SHOTS_TEAM_B, shotsTeamB);
        savedInstanceState.putInt(STATE_SAVES_TEAM_A, savesTeamA);
        savedInstanceState.putInt(STATE_SAVES_TEAM_B, savesTeamB);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        /* Restores the Score of Team A and B */

        scoreTeamA = savedInstanceState.getInt(STATE_SCORE_TEAM_A);
        scoreTeamB = savedInstanceState.getInt(STATE_SCORE_TEAM_B);

        /* Restores the Goals of Team A and B  */

        goalsTeamA = savedInstanceState.getInt(STATE_GOALS_TEAM_A);
        goalsTeamB = savedInstanceState.getInt(STATE_GOALS_TEAM_B);

        /* Restores the Penalties of Team A and B  */

        penaltiesTeamA = savedInstanceState.getInt(STATE_PENALTIES_TEAM_A);
        penaltiesTeamB = savedInstanceState.getInt(STATE_PENALTIES_TEAM_B);

        /* Restores the Fouls of Team A and B  */

        faultsTeamA = savedInstanceState.getInt(STATE_FAULTS_TEAM_A);
        faultsTeamB = savedInstanceState.getInt(STATE_FAULTS_TEAM_B);

        /* Restores the Shots of Team A and B  */

        shotsTeamA = savedInstanceState.getInt(STATE_SHOTS_TEAM_A);
        shotsTeamB = savedInstanceState.getInt(STATE_SHOTS_TEAM_B);

        /* Restores the Saves of Team A and B  */

        savesTeamA = savedInstanceState.getInt(STATE_SAVES_TEAM_A);
        savesTeamB = savedInstanceState.getInt(STATE_SAVES_TEAM_B);

        /* Display values after restoring */

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        showGoalsTeamA(scoreTeamA);
        showGoalsTeamB(scoreTeamB);
        showPenaltiesTeamA(penaltiesTeamA);
        showPenaltiesTeamB(penaltiesTeamB);
        showFaultsTeamA(faultsTeamA);
        showFaultsTeamB(faultsTeamB);
        showShotsTeamA(shotsTeamA);
        showShotsTeamB(shotsTeamB);
        showSavesTeamA(savesTeamA);
        showSavesTeamB(savesTeamB);


    }

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
     * Displays number of Shots for Team A stats Window
     */
    public void showShotsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotsA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of Shots for Team B stats Window
     */
    public void showShotsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotsB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of Shots for Team A stats Window
     */
    public void showSavesTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.savesA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of Shots for Team B stats Window
     */
    public void showSavesTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.savesB);
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

    /**
     * Increase shots by 1 for Team A.
     */
    public void plusShotA(View view) {
        shotsTeamA = shotsTeamA + 1;
        showShotsTeamA(shotsTeamA);
    }

    /**
     * Decrease shots by 1 for Team A.
     */
    public void minusShotA(View view) {
        shotsTeamA = shotsTeamA - 1;
        showShotsTeamA(shotsTeamA);
    }

    /**
     * Increase shots by 1 for Team B.
     */
    public void plusShotB(View view) {
        shotsTeamB = shotsTeamB + 1;
        showShotsTeamB(shotsTeamB);
    }

    /**
     * Decrease shots by 1 for Team B.
     */
    public void minusShotB(View view) {
        shotsTeamB = shotsTeamB - 1;
        showShotsTeamB(shotsTeamB);
    }

    /**
     * Increase saves by 1 for Team A.
     */
    public void plusSaveA(View view) {
        savesTeamA = savesTeamA + 1;
        showSavesTeamA(savesTeamA);
    }

    /**
     * Decrease saves by 1 for Team A.
     */
    public void minusSaveA(View view) {
        savesTeamA = savesTeamA - 1;
        showSavesTeamA(savesTeamA);
    }

    /**
     * Increase saves by 1 for Team B.
     */
    public void plusSaveB(View view) {
        savesTeamB = savesTeamB + 1;
        showSavesTeamB(savesTeamB);
    }

    /**
     * Decrease saves by 1 for Team B.
     */
    public void minusSaveB(View view) {
        savesTeamB = savesTeamB - 1;
        showSavesTeamB(savesTeamB);
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
        shotsTeamA = 0;
        shotsTeamB = 0;
        savesTeamA = 0;
        savesTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        showGoalsTeamA(goalsTeamA);
        showGoalsTeamB(goalsTeamB);
        showPenaltiesTeamA(penaltiesTeamA);
        showPenaltiesTeamB(penaltiesTeamB);
        showFaultsTeamB(faultsTeamB);
        showFaultsTeamA(faultsTeamA);
        showShotsTeamA(shotsTeamA);
        showShotsTeamB(shotsTeamB);
        showSavesTeamA(savesTeamA);
        showSavesTeamB(savesTeamB);

    }


}
