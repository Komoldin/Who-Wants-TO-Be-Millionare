package com.example.milllionerew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.milllionerew.helper.Question;
import com.example.milllionerew.helper.Questions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mStart;

    String TAG = "hit";

    TextView mTextView;

    Questions mQue;

    ArrayList<Question> mQuestions;

    Question currentQuestion;

    int currentQuestionid = 0;

    int score = 0;

    int cont;

    TextView scoreHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton4 = findViewById(R.id.button4);

        mTextView = findViewById(R.id.textview);

        scoreHolder = findViewById(R.id.textViewScore);

        mStart = findViewById(R.id.startgame);
        hideButtons();

        mQue = new Questions();
        mQuestions = mQue.getQuestions();
        cont = mQuestions.size();

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartGame();
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next(0);
                Log.d(TAG, "onClick: 0");
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next(1);
                Log.d(TAG, "onClick: 1");
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next(2);
                Log.d(TAG, "onClick: 2");
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next(3);
                Log.d(TAG, "onClick: 3");
            }
        });
    }

    public void StartGame(){
        currentQuestionid = 0;
        showButtons();
        mStart.setVisibility(View.INVISIBLE);
        currentQuestion = mQuestions.get(currentQuestionid);
        setQuestion(currentQuestion);
        score = 0;
        ImageView n = findViewById(R.id.imageView);
        n.setVisibility(View.GONE);
    }

    public void hideButtons(){
        mButton1.setVisibility(View.INVISIBLE);
        mButton2.setVisibility(View.INVISIBLE);
        mButton3.setVisibility(View.INVISIBLE);
        mButton4.setVisibility(View.INVISIBLE);
    }

    public void showButtons(){
        mButton1.setVisibility(View.VISIBLE);
        mButton2.setVisibility(View.VISIBLE);
        mButton3.setVisibility(View.VISIBLE);
        mButton4.setVisibility(View.VISIBLE);
    }

    public void setQuestion(Question q){
        String[] a = q.getAnswers();
        mButton1.setText(a[0]);
        mButton2.setText(a[1]);
        mButton3.setText(a[2]);
        mButton4.setText(a[3]);

        mTextView.setText(q.getQuestion());
    }

    public void next(int id){

        currentQuestionid++;

        scoreHolder.setText("Score: "+ score);
        if(id == currentQuestion.getRightId()){
            score += currentQuestion.getScore();
        }else {
            gameOver();
            return;
        }

        if(cont - 1 < currentQuestionid){
            gameOver();
            return;
        }

        currentQuestion = mQuestions.get(currentQuestionid);
        setQuestion(currentQuestion);
    }

    public void gameOver(){
        hideButtons();
        mStart.setVisibility(View.VISIBLE);
        mTextView.setText("Игра закончена ваш результат: " + score);
        mStart.setText("Играть заново");
    }
}
