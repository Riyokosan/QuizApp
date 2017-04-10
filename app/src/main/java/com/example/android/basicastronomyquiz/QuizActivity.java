package com.example.android.basicastronomyquiz;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class QuizActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        // more code in the oncreate
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else {
            View decorView = getWindow().getDecorView();
            // Hide the status bar.
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }

    /**
     * Check answer for question 1
     */

    /**
     * Check answer for question 2
     */

    private void checkAnswer2() {
        CheckBox answerQuestion4

    /**
     * Check answer for question 3
     */
    private void checkAnswer3() {
        RadioButton answerQuestion3 = (RadioButton) findViewById(R.id.answer3);
        if(answerQuestion3.isChecked()){
            score += 1;
        }
    }

    /**
     * Check answer for question 4
     */
    private void checkAnswer4() {
        RadioButton answerQuestion4 = (RadioButton) findViewById(R.id.answer4);
        if(answerQuestion4.isChecked()){
            score += 1;
        }
    }

    /**
     * Check answer for question 5
     */
    private void checkAnswer5() {
        RadioButton answerQuestion5 = (RadioButton) findViewById(R.id.answer5);
        if(answerQuestion5.isChecked()){
            score += 1;
        }
    }


}
}
