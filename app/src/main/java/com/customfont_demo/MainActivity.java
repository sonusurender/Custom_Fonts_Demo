package com.customfont_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find both textview id
        TextView smartwatchFont = (TextView) findViewById(R.id.smartwatchFont);
        TextView rupeeFont = (TextView) findViewById(R.id.rupeeFont);

        //Set Tytpeface to both textview
        smartwatchFont.setTypeface(new MyApplication().smartwatchFont);
        rupeeFont.setTypeface(new MyApplication().rupeeFont);

        //Set Text to rupee text view, use this "`" symbol to print rupee symbol
        rupeeFont.setText("Mathew owes " + "`" + "20000 from Harry. After that he will have `40000.");
    }


}
