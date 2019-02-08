package com.customfont_demo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by SONU on 24/09/15.
 */
public class CustomFontTextView extends TextView {


    public CustomFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        init();
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomFontTextView(Context context) {
        super(context);

        init();
    }

    private void init() {
        setTypeface(new MyApplication().openSansLight);//Set Typeface from MyApplication
    }
}