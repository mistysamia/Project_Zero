package com.example.project_zero;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class WelldonePage extends AppCompatActivity {
    Bundle bundle ;
    String username;
    private ImageButton button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welldone_page);
        int val = getIntent().getIntExtra("TheScore",0);// The second argument is default value.
        bundle=getIntent().getExtras();
        username=bundle.getString("Tag");
        TextView tv2 = (TextView) findViewById(R.id.showVal);
        TextView tv1=(TextView)findViewById(R.id.well);
        tv2.setText(String.valueOf(val));
         tv1.setText(username);
        button1=(ImageButton)findViewById(R.id.welldonetryagain);
        button2=(ImageButton)findViewById(R.id.welldoneexit);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent (WelldonePage.this,NamePage.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder =new AlertDialog.Builder(WelldonePage.this);
        builder.setMessage("Are you sure you want to exit?");
        builder.setCancelable(false);

        builder.setNegativeButton("Close!", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

               finish();
                moveTaskToBack(true);
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}
