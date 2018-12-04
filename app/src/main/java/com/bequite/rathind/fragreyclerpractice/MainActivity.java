package com.bequite.rathind.fragreyclerpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: Started");
        Intent intent = new Intent(this, DessertTime.class);
        startActivity(intent);
        finish();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }


}
