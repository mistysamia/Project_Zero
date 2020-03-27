package com.example.project_zero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen_1 extends AppCompatActivity {

    private ProgressBar progressbar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen_1);

        progressbar=(ProgressBar) findViewById(R.id.progressBarId1);
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();

                startApp();
            }
        });
        thread.start();
    }
    public void doWork()
    {
        for(progress=60;progress<=100;progress=progress+20) {
            try {
                Thread.sleep(1090);
                progressbar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void startApp() {
        Intent intent =new Intent(SplashScreen_1.this,Instruction.class);
        startActivity(intent);
        finish();
    }
}
