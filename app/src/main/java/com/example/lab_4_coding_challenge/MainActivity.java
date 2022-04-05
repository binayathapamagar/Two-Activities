package com.example.lab_4_coding_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    private static final String TAG ="mainActivity" ;
    private Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.text1);
        Log.d(TAG,message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void text2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.text2);
        Log.d(TAG,message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void text3(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.text3);
        Log.d(TAG,message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}