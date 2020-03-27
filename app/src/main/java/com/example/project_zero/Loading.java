package com.example.project_zero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Loading extends AppCompatActivity {

    private ProgressBar progressBar1;
    private int progress;
    Bundle bundle ;
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bundle=getIntent().getExtras();
        username=bundle.getString("Tag");
        setContentView(R.layout.activity_loading);
        progressBar1=(ProgressBar) findViewById(R.id.progressBarId);
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                doWorkk();
                startAppp();
            }
        });
        thread.start();
    }
    public void doWorkk()
    {
        for(progress=20;progress<=100;progress=progress+20) {
            try {
                Thread.sleep(1090);
                progressBar1.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void startAppp() {
        Intent intent =new Intent(Loading.this,GameFirstPage.class);
        intent.putExtra("Tag",username);
        startActivity(intent);

        finish();
    }
    
}
