package davidchapman.com.boroquiz;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by GOAT on 08/09/2015.
 */
public class CustomTextView2 extends TextView {

    public CustomTextView2(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public CustomTextView2(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public CustomTextView2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/AlegreyaSans-Regular.otf", context);
        setTypeface(customFont);
    }
}

