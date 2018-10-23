package com.example.taruc.labweek2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main","hello this is my main");
        Log.v("Warning","Hello this is my warning level");
        Log.e("Msg1","Hello this my msg");
        Log.i("Msg2","hello this is my msg 2");
    }
}
