package davidchapman.com.boroquiz;

/**
 * Created by GOAT on 06/09/2015.
 */
public class Answer {
    private String mText;
    private boolean isCorrect;

    public Answer(String text, boolean rightOrWrong){
        mText = text;
        isCorrect = rightOrWrong;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}
