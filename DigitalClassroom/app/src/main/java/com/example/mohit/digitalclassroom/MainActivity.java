package com.example.mohit.digitalclassroom;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createProgressBar();
    }

    private void createProgressBar() {
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MainActivity.this.progressBar.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(MainActivity.this,LoginPage.class);
                startActivity(intent);
            }
        },3000);


    }
}
