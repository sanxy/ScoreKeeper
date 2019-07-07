package com.sanxynet.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int increaseNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * ChangeText Code Started
     * ChangeText is the onClick assigned in the xml
     * */
    public void ChangeText(View view) {

        // reference the text view to change
        TextView textToChange = findViewById(R.id.default_text);
        textToChange.setText("Text is changed");
    }

    /*
     * IncreasePoints Code Started
     * IncreasePoints is the onClick assigned in the xml
     * */
    public void IncreasePoints(View view) {
        // point are increased by 1
        increaseNumber = increaseNumber + 1;
        // shows integer using text view
        displayForIncreasedPoints(increaseNumber);
    }

    /*
     * Method used to increase point
     * Custom made to display whole number in text view when button is pressed and increased
     * */
    private void displayForIncreasedPoints(int score) {
        // reference the text view to change to integer
        TextView scoreView = findViewById(R.id.default_number);
        scoreView.setText("" + score);
    }
}
