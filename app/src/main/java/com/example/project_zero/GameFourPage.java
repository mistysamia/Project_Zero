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

public class GameFourPage extends AppCompatActivity {

    public int counter3,cou3;
    public int lock4=0;
    int val=0;
    Bundle bundle ;
    String username;
    private Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_four_page);

        bundle=getIntent().getExtras();
        username=bundle.getString("Tag");
        val = getIntent().getIntExtra("TheScore",0);

        button1=(Button)findViewById(R.id.ques141);
        button2=(Button)findViewById(R.id.ques142);
        button3=(Button)findViewById(R.id.ques143);
        button4=(Button)findViewById(R.id.ques144);
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counter3++;
            }

            @Override
            public void onFinish() {
                if(lock4==0){
                    lock4=1;val=val-1;
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
                            cou3++;
                        }

                        @Override
                        public void onFinish() {

                            Intent intent =new Intent(GameFourPage.this,GameFivePage.class);
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
                if(v.getId()==R.id.ques141 && lock4==0)
                {
                    lock4=1;val=val-2;
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
                            cou3++;
                        }

                        @Override
                        public void onFinish() {
                            Intent intent =new Intent (GameFourPage.this,GameFivePage.class);
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
                if(v.getId()==R.id.ques142 && lock4==0)
                {
                    lock4=1;val=val-2;
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
                            cou3++;
                        }

                        @Override
                        public void onFinish() {

                            Intent intent =new Intent (GameFourPage.this,GameFivePage.class);
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
                if(v.getId()==R.id.ques143 && lock4==0)
                {
                    lock4=1;val=val+2;
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
                            cou3++;
                        }

                        @Override
                        public void onFinish() {
                            Intent intent =new Intent (GameFourPage.this,GameFivePage.class);
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
                if(v.getId()==R.id.ques144 && lock4==0)
                {
                    lock4=1;val=val-2;
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
                            cou3++;
                        }

                        @Override
                        public void onFinish() {
                            Intent intent = new Intent(GameFourPage.this, GameFivePage.class);
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
