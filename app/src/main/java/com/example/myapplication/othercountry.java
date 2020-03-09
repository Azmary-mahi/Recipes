package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class othercountry extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_othercountry);
        button1=(Button)findViewById(R.id.btn36);
        button2=(Button)findViewById(R.id.btn37);
        button3=(Button)findViewById(R.id.btn38);
        button4=(Button)findViewById(R.id.btn39);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityOne();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivitytow();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivitythree();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityfour();
            }
        });
    }
    public void moveToActivityOne(){
        Intent intent1=new Intent(this,chessychicken.class);
        startActivity(intent1);
    }
    public void moveToActivitytow(){
        Intent intent2=new Intent(this,chickensoup.class);
        startActivity(intent2);
    }
    public void moveToActivitythree(){
        Intent intent3=new Intent(this,pizzapasta.class);
        startActivity(intent3);
    }
    public void moveToActivityfour(){
        Intent intent4=new Intent(this,potatosalad.class);
        startActivity(intent4);
    }
}

