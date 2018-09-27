package com.zoubeir.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA, getScoreTeamB = 0; //global variables to hold the score for each team

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //displayForTeamA(7);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * add 3 points to the score when +3 Points button is clicked
     * @param view +3 Points button
     */
    public void addThreePointsTeamA(View view) {
        final int THREE_POINTS = 3; //constant to hold the score

        scoreTeamA += THREE_POINTS; //add 3 points to the score

        displayForTeamA(scoreTeamA); //display the new score
    }

    /**
     * add 2 points to the score when +2 Points button is clicked
     * @param view +2 Points button
     */
    public void addTwoPointsTeamA(View view) {
        final int TWO_POINTS = 2; //constant to hold the score

        scoreTeamA += TWO_POINTS; //add 2 points to the score

        displayForTeamA(scoreTeamA); //display the new score
    }

    /**
     * add 1 point to the score when Free Throw button is clicked
     * @param view Free Throw button
     */
    public void addOnePointTeamA(View view) {
        final int FREE_THROW = 1; //constant to hold the score

        scoreTeamA += FREE_THROW; //add 1 point to the score

        displayForTeamA(scoreTeamA); //display the new score
    }
}
