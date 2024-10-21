package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Retrieve the player points and games played from the intent
        int player1Points = getIntent().getIntExtra("PLAYER_1_POINTS", 0);
        int player2Points = getIntent().getIntExtra("PLAYER_2_POINTS", 0);
        int gamesPlayed = getIntent().getIntExtra("GAMES_PLAYED", 0);

        // Find the TextView in the layout to display the results
        TextView resultTextView = findViewById(R.id.text_view_results);

        // Display the results of the 5 games
        String resultText = "Results of 5 Games:\n\n"
                + "Player 1 Points: " + player1Points + "\n"
                + "Player 2 Points: " + player2Points + "\n";

        // Determine who won more games or if it's a draw
        if (player1Points > player2Points) {
            resultText += "\nPlayer 1 Wins the Series!";
        } else if (player2Points > player1Points) {
            resultText += "\nPlayer 2 Wins the Series!";
        } else {
            resultText += "\nThe Series is a Draw!";
        }

        // Set the result text in the TextView
        resultTextView.setText(resultText);
    }
}



