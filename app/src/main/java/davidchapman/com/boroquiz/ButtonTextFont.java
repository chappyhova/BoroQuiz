package davidchapman.com.boroquiz;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by GOAT  on 08/09/2015.
 */
public class ButtonTextFont extends Button {

    public ButtonTextFont(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public ButtonTextFont(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public ButtonTextFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/KOMTXT__.ttf", context);
        setTypeface(customFont);
    }
}
