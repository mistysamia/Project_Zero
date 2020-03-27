package com.example.project_zero;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class GameEightPage extends AppCompatActivity {

    public int counter7,cou7;
    public int lock8=0;
    int val =0;
    Bundle bundle ;
    String username;
    private Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        val = getIntent().getIntExtra("TheScore",0);
        bundle=getIntent().getExtras();
        username=bundle.getString("Tag");
        setContentView(R.layout.activity_game_eight_page);
        button1=(Button)findViewById(R.id.ques181);
        button2=(Button)findViewById(R.id.ques182);
        button3=(Button)findViewById(R.id.ques183);
        button4=(Button)findViewById(R.id.ques184);
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counter7++;
            }

            @Override
            public void onFinish() {
                if(lock8==0)
                {
                    lock8=1;val=val-1;
                    LayoutInflater inflater=getLayoutInflater();
                    @SuppressLint("WrongViewCast") View layout =inflater.inflate(R.layout.toast_timeup,(ViewGroup) findViewById(R.id.textViewToast2));
                    Toast toast= new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();

                    new CountDownTimer(3000, 2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            cou7++;
                        }

                        @Override
                        public void onFinish() {
                            Intent intent =new Intent (GameEightPage.this,GameNinePage.class);
                            intent.putExtra("TheScore",val);
                            intent.putExtra("Tag",username);
                            startActivity(intent);

                        }
                    }.start();

                }

            }
        }.start();
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.ques181 && lock8==0)
                {
                    lock8=1;val=val-2;
                    LayoutInflater inflater=getLayoutInflater();
                    @SuppressLint("WrongViewCast") View layout =inflater.inflate(R.layout.toast_wrong,(ViewGroup) findViewById(R.id.textViewToast));
                    Toast toast= new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();

                    new CountDownTimer(3000, 2500) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            cou7++;
                        }

                        @Override
                        public void onFinish() {
                            Intent intent =new Intent (GameEightPage.this,GameNinePage.class);
                            intent.putExtra("TheScore",val);
                            intent.putExtra("Tag",username);
                            startActivity(intent);

                        }
                    }.start();

                }


            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.ques182 && lock8==0)
                {
                    lock8=1;val=val-2;
                    LayoutInflater inflater=getLayoutInflater();
                    @SuppressLint("WrongViewCast") View layout =inflater.inflate(R.layout.toast_wrong,(ViewGroup) findViewById(R.id.textViewToast));
                    Toast toast= new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();

                    new CountDownTimer(3000, 2500) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            cou7++;
                        }

                        @Override
                        public void onFinish() {
                            Intent intent =new Intent (GameEightPage.this,GameNinePage.class);
                            intent.putExtra("TheScore",val);
                            intent.putExtra("Tag",username);
                            startActivity(intent);

                        }
                    }.start();

                }


            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.ques183 && lock8==0)
                {
                    lock8=1;val=val-2;
                    LayoutInflater inflater=getLayoutInflater();
                    @SuppressLint("WrongViewCast") View layout =inflater.inflate(R.layout.toast_wrong,(ViewGroup) findViewById(R.id.textViewToast));
                    Toast toast= new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();

                    new CountDownTimer(3000, 2500) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            cou7++;
                        }

                        @Override
                        public void onFinish() {
                            Intent intent =new Intent (GameEightPage.this,GameNinePage.class);
                            intent.putExtra("TheScore",val);
                            intent.putExtra("Tag",username);
                            startActivity(intent);

                        }
                    }.start();

                }


            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.ques184 && lock8==0)
                {
                    lock8=1;val=val+2;
                    LayoutInflater inflater=getLayoutInflater();
                    @SuppressLint("WrongViewCast") View layout =inflater.inflate(R.layout.toast_right,(ViewGroup) findViewById(R.id.textViewToast));
                    Toast toast= new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();

                    new CountDownTimer(3000, 2500) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            cou7++;
                        }

                        @Override
                        public void onFinish() {

                            Intent intent =new Intent (GameEightPage.this,GameNinePage.class);
                            intent.putExtra("TheScore",val);
                            intent.putExtra("Tag",username);
                            startActivity(intent);
                        }
                    }.start();

                }


            }
        });

    }
}
