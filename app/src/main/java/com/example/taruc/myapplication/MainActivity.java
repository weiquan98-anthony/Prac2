package com.example.taruc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("abc","Hello world!");
        Log.v("blahblah", "Good Morning");
    }

    public void onStart(){
        super.onStart();
        Log.d("TESTING","lol");
    }

    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        if(myReplyHeadTextView.getVisibility() = View.VISIBLE){
            outState.putBoolean("reply_visible", true);
        }
    }


    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked");
    }
}
