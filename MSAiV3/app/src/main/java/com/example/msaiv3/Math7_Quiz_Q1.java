package com.example.msaiv3;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Math7_Quiz_Q1 extends AppCompatActivity {
    private TextView tvQuestion, tvScore;
    private Button btnOption1, btnOption2, btnOption3, btnOption4, btnFinishQuiz;
    private int currentQuestionIndex = 0;
    private int score = 0;

    private List<Question> questionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math7_quiz_q1);
        tvQuestion = findViewById(R.id.tvQuestion);
        tvScore = findViewById(R.id.tvScore);
        btnOption1 = findViewById(R.id.btnOption1);
        btnOption2 = findViewById(R.id.btnOption2);
        btnOption3 = findViewById(R.id.btnOption3);
        btnOption4 = findViewById(R.id.btnOption4);
        btnFinishQuiz = findViewById(R.id.btnFinishQuiz);

        // Load the questions
        loadQuestions();
        Collections.shuffle(questionList); // Shuffle questions randomly

        // Show first question
        showNextQuestion();

        // Set up answer button listeners
        btnOption1.setOnClickListener(v -> checkAnswer(btnOption1.getText().toString()));
        btnOption2.setOnClickListener(v -> checkAnswer(btnOption2.getText().toString()));
        btnOption3.setOnClickListener(v -> checkAnswer(btnOption3.getText().toString()));
        btnOption4.setOnClickListener(v -> checkAnswer(btnOption4.getText().toString()));



  btnFinishQuiz.setOnClickListener(v -> {
      Log.d("Math7_Quiz_Q1", "Finish button clicked");
        Intent intent = new Intent(Math7_Quiz_Q1.this, MainActivity.class);
        startActivity(intent);
        finish();  // Finish current activity so it's removed from the back stack
    });
}
    private void loadQuestions() {
        questionList.add(new Question("What is the symbol used to indicate a null set? ", "∅", "@", "( ) ", "∅", " ="));
        questionList.add(new Question("What do you call a set which contains all elements being considered in a given situation? ", "universal set", "subset", "null set ", "elements", "universal set"));
        questionList.add(new Question("What is the other term for Roster method? " , "Listing method ", "Rule method ", "Universal method  ", "Listing method ", "universal set"));

    }

    private void showNextQuestion() {
        if (currentQuestionIndex < questionList.size()) {
            Question currentQuestion = questionList.get(currentQuestionIndex);
            tvQuestion.setText(currentQuestion.getQuestion());
            btnOption1.setText(currentQuestion.getOption1());
            btnOption2.setText(currentQuestion.getOption2());
            btnOption3.setText(currentQuestion.getOption3());
            btnOption4.setText(currentQuestion.getOption4());
        } else {
            // Quiz finished
            tvQuestion.setText("Quiz finished! Your score: " + score);
            btnOption1.setEnabled(false);
            btnOption2.setEnabled(false);
            btnOption3.setEnabled(false);
            btnOption4.setEnabled(false);
            // Show the finish button when the quiz is done
            btnFinishQuiz.setVisibility(Button.VISIBLE);
            Log.d("QuizActivity", "Finish button made visible");
        }
    }

    private void checkAnswer(String selectedAnswer) {
        Question currentQuestion = questionList.get(currentQuestionIndex);

        if (currentQuestion.getCorrectAnswer().equals(selectedAnswer)) {
            score++;
        }

        tvScore.setText("Score: " + score);
        currentQuestionIndex++;
        showNextQuestion();
    }

    private static class Question {
        private String question, correctAnswer, option1, option2, option3, option4;

        public Question(String question, String correctAnswer, String option1, String option2, String option3, String option4) {
            this.question = question;
            this.correctAnswer = correctAnswer;
            this.option1 = option1;
            this.option2 = option2;
            this.option3 = option3;
            this.option4 = option4;
        }

        public String getQuestion() {
            return question;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }

        public String getOption1() {
            return option1;
        }

        public String getOption2() {
            return option2;
        }

        public String getOption3() {
            return option3;
        }

        public String getOption4() {
            return option4;
        }
    }}