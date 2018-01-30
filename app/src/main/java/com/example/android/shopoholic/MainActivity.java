package com.example.android.shopoholic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase score for Player 1 by 1 point after choosing tshirt.
     */
    public void addTshirtForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase score for Player 1 by 1 point after choosing trousers.
     */
    public void addTrousersForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase score for Player 1 by 1 point after choosing shoes.
     */
    public void addShoesForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase score for Player 2 by 1 point after choosing tshirt.
     */
    public void addTshirtForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase score for Player 2 by 1 point after choosing trousers.
     */
    public void addTrousersForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase score for Player 2 by 1 point after choosing shoes.
     */
    public void addShoesForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }


    /**
     * Displays the given score for Shopper 1.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayer1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Shopper 2.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayer2);
        scoreView.setText(String.valueOf(score));
    }
}