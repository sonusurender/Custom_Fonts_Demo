package com.customfont_demo;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by SONU on 31/08/15.
 */
public class MyApplication extends Application {

    public static Typeface openSansLight, openSansBold, smartwatchFont, rupeeFont;


    @Override
    public void onCreate() {
        super.onCreate();

        //Get font from assets folder, Make sure use correct directory and correct spellings
        openSansLight = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
        openSansBold = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Bold.ttf");
        smartwatchFont = Typeface.createFromAsset(getAssets(), "fonts/smartwatch.ttf");
        rupeeFont = Typeface.createFromAsset(getAssets(), "fonts/Rupee.ttf");
    }


}