package com.example.project_zero;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;

public class AveragePage extends AppCompatActivity {
    Bundle bundle ;
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average_page);
        bundle=getIntent().getExtras();
        username=bundle.getString("Tag");
        int val = getIntent().getIntExtra("TheScore",0);// The second argument is default value.

        TextView tv2 = (TextView) findViewById(R.id.showVal1);
        TextView tv1=(TextView)findViewById(R.id.average);
        tv2.setText(String.valueOf(val));
        tv1.setText(username);
    }
    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder =new AlertDialog.Builder(AveragePage.this);
        builder.setMessage("Are you sure you want to exit?");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent =new Intent(AveragePage.this,NamePage.class);
                startActivity(intent);
                finish();
            }
        });
        builder.setPositiveButton("Close!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}
