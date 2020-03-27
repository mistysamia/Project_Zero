package com.example.project_zero;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class NamePage extends AppCompatActivity  {

    private ImageButton button;
    private EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_page);
        editText1=(EditText)findViewById(R.id.editText11);
        button=(ImageButton)findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String username=editText1.getText().toString().trim();
                    if(v.getId()==R.id.buttonId && !username.isEmpty()){
                        Intent intent =new Intent (NamePage.this,Loading.class);
                        intent.putExtra("Tag",username);
                        startActivity(intent);
                    }
                     else
                    {
                        LayoutInflater inflater=getLayoutInflater();
                        @SuppressLint("WrongViewCast") View layout =inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.textViewToastname));
                        Toast toast= new Toast(getApplicationContext());
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setView(layout);
                        toast.show();

                    }


            }
        });
    }
}
