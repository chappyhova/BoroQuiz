package davidchapman.com.boroquiz;

import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Collections;

import android.os.Handler;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import static davidchapman.com.boroquiz.R.drawable.correct_answer_button;
import static davidchapman.com.boroquiz.R.drawable.incorrect_answer_button;
import static davidchapman.com.boroquiz.R.drawable.standard_button;

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
    private Tracker mTracker;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);

        // Obtain the shared Tracker instance.
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();

        mTextView = (CustomTextView2) findViewById(R.id.questionTextView);
        mAnswer1 = (ButtonTextFont) findViewById(R.id.answerButton1);
        mAnswer2 = (ButtonTextFont) findViewById(R.id.answerButton2);
        mAnswer3 = (ButtonTextFont) findViewById(R.id.answerButton3);
        mAnswer4 = (ButtonTextFont) findViewById(R.id.answerButton4);
        mQuestionNumber = (CustomTextView) findViewById(R.id.questionNumberTextView);

        mQuestionNumber.setText("Question " + questionCounter);

        randomGenerator();

        // load the first question from the random generator selection and increase the selection by 1.
        loadPage(numbers.get(pageSelectionCount));
        pageSelectionCount++;

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Google Analytics
        Log.i(TAG, "Setting screen name: ");
        mTracker.setScreenName("QuizQuestions");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
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

    private void buttonResetter() {
        mAnswer1.setBackgroundResource(standard_button);
        mAnswer2.setBackgroundResource(standard_button);
        mAnswer3.setBackgroundResource(standard_button);
        mAnswer4.setBackgroundResource(standard_button);

        mAnswer1.setTextColor(Color.RED);
        mAnswer2.setTextColor(Color.RED);
        mAnswer3.setTextColor(Color.RED);
        mAnswer4.setTextColor(Color.RED);

        //Enable all buttons
        mAnswer1.setEnabled(true);
        mAnswer2.setEnabled(true);
        mAnswer3.setEnabled(true);
        mAnswer4.setEnabled(true);

    }

    private void disableButtons() {
        mAnswer1.setEnabled(false);
        mAnswer2.setEnabled(false);
        mAnswer3.setEnabled(false);
        mAnswer4.setEnabled(false);
    }

    private void loadPage(int question) {
        // Pull a question using the random number and set the text on the display to that question.
        mCurrentPage = mQuestions.getPage(question);
        mTextView.setText(mCurrentPage.getText());

        buttonResetter();

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
                        mAnswer1.setBackgroundResource(correct_answer_button);
                        mAnswer1.setTextColor(Color.RED);
                        disableButtons();
                    } else {
                        mAnswer1.setBackgroundResource(incorrect_answer_button);
                        mAnswer1.setTextColor(Color.WHITE);
                        disableButtons();
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
                        mAnswer2.setBackgroundResource(correct_answer_button);
                        mAnswer2.setTextColor(Color.RED);
                        disableButtons();
                    } else {
                        mAnswer2.setBackgroundResource(incorrect_answer_button);
                        mAnswer2.setTextColor(Color.WHITE);
                        disableButtons();
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
                        mAnswer3.setBackgroundResource(correct_answer_button);
                        mAnswer3.setTextColor(Color.RED);
                        disableButtons();
                    } else {
                        mAnswer3.setBackgroundResource(incorrect_answer_button);
                        mAnswer3.setTextColor(Color.WHITE);
                        disableButtons();
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
                        mAnswer4.setBackgroundResource(correct_answer_button);
                        mAnswer4.setTextColor(Color.RED);
                        disableButtons();
                    } else {
                        mAnswer4.setBackgroundResource(incorrect_answer_button);
                        mAnswer4.setTextColor(Color.WHITE);
                        disableButtons();
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "QuizQuestions Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://davidchapman.com.boroquiz/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "QuizQuestions Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://davidchapman.com.boroquiz/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

















