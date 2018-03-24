package com.example.youssef.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        int incrementForTeamA = 0;
        int incrementForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score ) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        }
    public void displayForTeamB(int score ) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
/*
This method for adding 3 points For team A

 */
    public void addThreeForTeamA(View view ){
        incrementForTeamA += 3;
        displayForTeamA(incrementForTeamA);
        }
    /*
This method for adding 2 points For team A

*/
    public void addTwoForTeamA(View view ){
        incrementForTeamA += 2;
        displayForTeamA(incrementForTeamA);
         }
    /*
This method for adding 1 point For team A

 */
    public void addOneForTeamA(View view ){
        incrementForTeamA += 1;
        displayForTeamA(incrementForTeamA);
       }
    /*
This method for adding 3 points For team B

*/
    public void addThreeForTeamB(View view ){
        incrementForTeamB += 3;
        displayForTeamB(incrementForTeamB);
    }
    /*
This method for adding 2 points for team B

*/
    public void addTwoForTeamB(View view ){
        incrementForTeamB += 2;
        displayForTeamB(incrementForTeamB);
    }
    /*
This method for adding 1 point for team B

 */
    public void addOneForTeamB(View view ){
        incrementForTeamB += 1;
        displayForTeamB(incrementForTeamB);
         }
    public void resetScore (View v ){
            displayForTeamA(0);
            displayForTeamB(0);
        }
    }

