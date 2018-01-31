package com.example.android.shopoholic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String PLAYER_1_SCORE = "player1score";
    private static final String PLAYER_1_SCORE_VIEW = "player1view";
    private static final String PLAYER_2_SCORE = "player2score";
    private static final String PLAYER_2_SCORE_VIEW = "player2view";
    private TextView scoreTextView1;
    private TextView scoreTextView2;
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Save activity state
        scoreTextView1 = findViewById(R.id.scorePlayer1);
        scoreTextView2 = findViewById(R.id.scorePlayer2);
        if (savedInstanceState != null) {
            scorePlayer1 = savedInstanceState.getInt(PLAYER_1_SCORE);
            scorePlayer2 = savedInstanceState.getInt(PLAYER_1_SCORE);
            CharSequence savedScore1 = savedInstanceState.getCharSequence(PLAYER_1_SCORE_VIEW);
            scoreTextView1.setText(savedScore1);
            CharSequence savedScore2 = savedInstanceState.getCharSequence(PLAYER_2_SCORE_VIEW);
            scoreTextView2.setText(savedScore2);

        }
    }

//  Save activity state
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(PLAYER_1_SCORE, scorePlayer1);
        outState.putInt(PLAYER_2_SCORE, scorePlayer2);
        outState.putCharSequence(PLAYER_1_SCORE_VIEW, scoreTextView1.getText());
        outState.putCharSequence(PLAYER_2_SCORE_VIEW, scoreTextView2.getText());
    }

    /**
     * Increase score for Player 1 by 1 point after choosing tshirt.
     */
    public void addTShirtForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase score for Player 1 by 2 points after choosing trousers.
     */
    public void addTrousersForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 2;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase score for Player 1 by 3 points after choosing shoes.
     */
    public void addShoesForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 3;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase score for Player 2 by 1 point after choosing tshirt.
     */
    public void addTShirtForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase score for Player 2 by 2 points after choosing trousers.
     */
    public void addTrousersForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 2;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase score for Player 2 by 3 points after choosing shoes.
     */
    public void addShoesForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 3;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Reset the score for both Players.
     */
    public void resetScore(View v) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }


    /**
     * Displays the given score for Shopper 1.
     */
    private void displayForPlayer1(int score) {
        scoreTextView1 = findViewById(R.id.scorePlayer1);
        scoreTextView1.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Shopper 2.
     */
    private void displayForPlayer2(int score) {
        scoreTextView2 = findViewById(R.id.scorePlayer2);
        scoreTextView2.setText(String.valueOf(score));
    }

    /**
     * Shows PopUp window on the screen.
     */
    public void showPopUpWindow(View v) {
        if (scorePlayer1 > scorePlayer2) {
            startActivity(new Intent(MainActivity.this, Pop1.class));
        }
        if (scorePlayer2 > scorePlayer1) {
            startActivity(new Intent(MainActivity.this, Pop2.class));
        }
        if (scorePlayer1 == scorePlayer2) {
            startActivity(new Intent(MainActivity.this, Pop3.class));
        }
    }
}