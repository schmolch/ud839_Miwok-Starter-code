package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.rootView;

public class Zahlen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zahlen);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eigth");
        words.add("nine");
        words.add("ten");

        for(int i=0; i<10; i++){
            Log.v("Zahlen.java", "" + words.get(i));
        }

        LinearLayout dasRootView = (LinearLayout) findViewById(rootView);

        ArrayList<TextView> wordViewArray = new ArrayList<TextView>();
        for(int k=0 ; k<10; k++) {
            TextView wordView = new TextView(this);
            wordViewArray.add(wordView);
        }

        for(int j=0; j<10; j++) {
            //TextView wordView = new TextView(this);
            //wordView.setTextSize(28);
            //wordView.setText(words.get(j));
            //dasRootView.addView(wordView);
        }
    }
}
