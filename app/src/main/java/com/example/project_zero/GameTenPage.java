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

public class GameTenPage extends AppCompatActivity {

    public int counter9,cou9;
    public int lock10=0;int val=0;
    private Button button1,button2,button3,button4;
    Bundle bundle ;
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_ten_page);

        val = getIntent().getIntExtra("TheScore",0);

        bundle=getIntent().getExtras();
        username=bundle.getString("Tag");
        button1=(Button)findViewById(R.id.ques101);
        button2=(Button)findViewById(R.id.ques102);
        button3=(Button)findViewById(R.id.ques103);
        button4=(Button)findViewById(R.id.ques104);
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counter9++;
            }

            @Override
            public void onFinish() {
                if(lock10==0)
                {
                    lock10=1;val=val-1;
                    LayoutInflater inflater=getLayoutInflater();
                    @SuppressLint("WrongViewCast") View layout =inflater.inflate(R.layout.toast_timeup,(ViewGroup) findViewById(R.id.textViewToast2));
                    Toast toast= new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();

                    new CountDownTimer(3000, 2500) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            cou9++;
                        }

                        @Override
                        public void onFinish() {
                            if(val>=14)
                            {
                                Intent intent =new Intent (GameTenPage.this,WelldonePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else if(val>=7)
                            {
                                Intent intent =new Intent (GameTenPage.this,AveragePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else
                            {
                                Intent intent =new Intent (GameTenPage.this,WorsePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                        }
                    }.start();

                }

            }
        }.start();
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.ques101 && lock10==0)
                {
                    lock10=1;val=val-2;
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
                            cou9++;
                        }

                        @Override
                        public void onFinish() {

                            if(val>=14)
                            {
                                Intent intent =new Intent (GameTenPage.this,WelldonePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else if(val>=7)
                            {
                                Intent intent =new Intent (GameTenPage.this,AveragePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else
                            {
                                Intent intent =new Intent (GameTenPage.this,WorsePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                        }
                    }.start();

                }


            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.ques102 && lock10==0)
                {
                    lock10=1;val=val+2;
                    LayoutInflater inflater=getLayoutInflater();
                    @SuppressLint("WrongViewCast") View layout =inflater.inflate(R.layout.toast_right,(ViewGroup) findViewById(R.id.textViewToast));
                    Toast toast= new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();

                    new CountDownTimer(3000, 2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            cou9++;
                        }

                        @Override
                        public void onFinish() {
                            if(val>=14)
                            {
                                Intent intent =new Intent (GameTenPage.this,WelldonePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else if(val>=7)
                            {
                                Intent intent =new Intent (GameTenPage.this,AveragePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else
                            {
                                Intent intent =new Intent (GameTenPage.this,WorsePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }

                        }
                    }.start();

                }


            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.ques103 && lock10==0)
                {
                    lock10=1;val=val-2;
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
                            cou9++;
                        }

                        @Override
                        public void onFinish() {

                            if(val>=14)
                            {
                                Intent intent =new Intent (GameTenPage.this,WelldonePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else if(val>=7)
                            {
                                Intent intent =new Intent (GameTenPage.this,AveragePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else
                            {
                                Intent intent =new Intent (GameTenPage.this,WorsePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                        }
                    }.start();

                }


            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.ques104 && lock10==0)
                {
                    lock10=1;val=val-2;
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
                            cou9++;
                        }

                        @Override
                        public void onFinish() {

                            if(val>=14)
                            {
                                Intent intent =new Intent (GameTenPage.this,WelldonePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else if(val>=7)
                            {
                                Intent intent =new Intent (GameTenPage.this,AveragePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                            else
                            {
                                Intent intent =new Intent (GameTenPage.this,WorsePage.class);
                                intent.putExtra("TheScore",val);
                                intent.putExtra("Tag",username);
                                startActivity(intent);
                            }
                        }
                    }.start();

                }


            }
        });

    }
}
