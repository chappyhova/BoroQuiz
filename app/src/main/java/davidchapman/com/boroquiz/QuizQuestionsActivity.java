package davidchapman.com.boroquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Collections;

import android.os.Handler;

public class QuizQuestionsActivity extends AppCompatActivity {

    public static final String TAG = QuizQuestionsActivity.class.getSimpleName();

    private Questions mQuestions = new Questions();
    private ScoreResult mScoreResult = new ScoreResult();
    private CustomTextView mQuestionNumber;
    private int questionCounter = 1;
    private int correctAnswers = 0;
    private CustomTextView2 mTextView;
    private Button mAnswer1;
    private Button mAnswer2;
    private Button mAnswer3;
    private Button mAnswer4;
    private Page mCurrentPage;
    private int pageSelectionCount = 0;
    private ArrayList<Integer> numbers;
    private Handler mHandler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);

        mTextView = (CustomTextView2) findViewById(R.id.questionTextView);
        mAnswer1 = (Button) findViewById(R.id.answerButton1);
        mAnswer2 = (Button) findViewById(R.id.answerButton2);
        mAnswer3 = (Button) findViewById(R.id.answerButton3);
        mAnswer4 = (Button) findViewById(R.id.answerButton4);
        mQuestionNumber = (CustomTextView) findViewById(R.id.questionNumberTextView);

        mQuestionNumber.setText("Question " + questionCounter);

        randomGenerator();

        // load the first question from the random generator selection and increase the selection by 1.
        loadPage(numbers.get(pageSelectionCount));
        pageSelectionCount++;

    }

    private ArrayList randomGenerator() {
        //Create random number generator, add the numbers to an array and then shuffle.
        Questions newQuestions = new Questions();

        numbers = new ArrayList<>();
        for (int i = 0; i <= newQuestions.getLength() - 1; ++i) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    private void loadPage(int question) {
        // Pull a question using the random number and set the text on the display to that question.
        mCurrentPage = mQuestions.getPage(question);
        mTextView.setText(mCurrentPage.getText());

        // Reset all buttons to white.
        mAnswer1.setBackgroundColor(Color.WHITE);
        mAnswer2.setBackgroundColor(Color.WHITE);
        mAnswer3.setBackgroundColor(Color.WHITE);
        mAnswer4.setBackgroundColor(Color.WHITE);

        //Reset all button text colours to red.
        mAnswer1.setTextColor(Color.RED);
        mAnswer2.setTextColor(Color.RED);
        mAnswer3.setTextColor(Color.RED);
        mAnswer4.setTextColor(Color.RED);

        // Check to see if it was the last question if not then display answers on the buttons with
        // OnClickListeners.
        if (questionCounter == 11) {
            mAnswer1.setVisibility(View.INVISIBLE);
            mAnswer2.setVisibility(View.INVISIBLE);
            mAnswer3.setVisibility(View.INVISIBLE);
            mAnswer4.setText("PLAY AGAIN");

            String resultString = mScoreResult.ScoreUpdate(correctAnswers);
            mTextView.setText(resultString + " " + correctAnswers + "/10!");
            mQuestionNumber.setText("Boro Quiz");

            mAnswer4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        } else {

            mAnswer1.setText(mCurrentPage.getAnswer1().getText());
            mAnswer2.setText(mCurrentPage.getAnswer2().getText());
            mAnswer3.setText(mCurrentPage.getAnswer3().getText());
            mAnswer4.setText(mCurrentPage.getAnswer4().getText());

            mQuestionNumber.setText("Question " + questionCounter);
            questionCounter = questionCounter + 1;

            mAnswer1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mCurrentPage.getAnswer1().isCorrect()) {
                        correctAnswers = correctAnswers + 1;
                        mAnswer1.setBackgroundColor(Color.GREEN);
                    }
                    else {
                        mAnswer1.setBackgroundColor(Color.RED);
                        mAnswer1.setTextColor(Color.WHITE);
                    }
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            loadPage(numbers.get(pageSelectionCount));
                            pageSelectionCount++;
                            mHandler.removeCallbacksAndMessages(null);
                        }
                    }, 1200);
                }
            });


            mAnswer2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mCurrentPage.getAnswer2().isCorrect()) {
                        correctAnswers = correctAnswers + 1;
                        mAnswer2.setBackgroundColor(Color.GREEN);
                    }
                    else {
                        mAnswer2.setBackgroundColor(Color.RED);
                        mAnswer2.setTextColor(Color.WHITE);
                    }
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            loadPage(numbers.get(pageSelectionCount));
                            pageSelectionCount++;
                            mHandler.removeCallbacksAndMessages(null);
                        }
                    }, 1200);

                }

            });

            mAnswer3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mCurrentPage.getAnswer3().isCorrect()) {
                        correctAnswers = correctAnswers + 1;
                        mAnswer3.setBackgroundColor(Color.GREEN);
                    }
                    else {
                        mAnswer3.setBackgroundColor(Color.RED);
                        mAnswer3.setTextColor(Color.WHITE);
                    }
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            loadPage(numbers.get(pageSelectionCount));
                            pageSelectionCount++;
                            mHandler.removeCallbacksAndMessages(null);
                        }
                    }, 1200);

                }

            });

            mAnswer4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mCurrentPage.getAnswer4().isCorrect()) {
                        correctAnswers = correctAnswers + 1;
                        mAnswer4.setBackgroundColor(Color.GREEN);
                    }
                    else {
                        mAnswer4.setBackgroundColor(Color.RED);
                        mAnswer4.setTextColor(Color.WHITE);
                    }
                    mHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            loadPage(numbers.get(pageSelectionCount));
                            pageSelectionCount++;
                            mHandler.removeCallbacksAndMessages(null);
                        }
                    }, 1200);

                }
            });

        }
    }
}








