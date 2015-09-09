package davidchapman.com.boroquiz;

/**
 * Created by GOAT on 06/09/2015.
 */
public class Page {

    private String mText;
    private Answer mAnswer1;
    private Answer mAnswer2;
    private Answer mAnswer3;
    private Answer mAnswer4;


    public Page(String text, Answer answer1, Answer answer2, Answer answer3, Answer answer4){
        mText = text;
        mAnswer1 = answer1;
        mAnswer2 = answer2;
        mAnswer3 = answer3;
        mAnswer4 = answer4;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Answer getAnswer1() {
        return mAnswer1;
    }

    public void setAnswer1(Answer answer1) {
        mAnswer1 = answer1;
    }

    public Answer getAnswer2() {
        return mAnswer2;
    }

    public void setAnswer2(Answer answer2) {
        mAnswer2 = answer2;
    }

    public Answer getAnswer3() {
        return mAnswer3;
    }

    public void setAnswer3(Answer answer3) {
        mAnswer3 = answer3;
    }

    public Answer getAnswer4() {
        return mAnswer4;
    }

    public void setAnswer4(Answer answer4) {
        mAnswer4 = answer4;
    }
}
