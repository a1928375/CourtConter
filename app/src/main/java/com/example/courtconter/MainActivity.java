package com.example.courtconter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.courtconter.R;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int pointsA = 0;
    int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsA(View view) {
        pointsA = pointsA + 3;
        displayForTeamA(pointsA);
    }

    public void twoPointsA(View view) {
        pointsA = pointsA + 2;
        displayForTeamA(pointsA);
    }

    public void onePointA(View view) {
        pointsA = pointsA + 1;
        displayForTeamA(pointsA);
    }

    public void threePointsB(View view) {
        pointsB = pointsB + 3;
        displayForTeamB(pointsB);
    }

    public void twoPointsB(View view) {
        pointsB = pointsB + 2;
        displayForTeamB(pointsB);
    }

    public void onePointB(View view) {
        pointsB = pointsB + 1;
        displayForTeamB(pointsB);
    }

    public void reset(View view) {
        pointsA = 0;
        pointsB = 0;
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}