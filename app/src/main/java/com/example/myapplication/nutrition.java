package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nutrition extends AppCompatActivity {
    private Button Btnmove;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
        Btnmove=(Button)findViewById(R.id.btn4);
        button1=(Button)findViewById(R.id.btn5);
        button2=(Button)findViewById(R.id.btn6);
        Btnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityTow();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityThree();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityFour();
            }
        });

    }
    public void moveToActivityTow(){
        Intent intent1=new Intent(this,vegetable.class);
        startActivity(intent1);
    }
    public void moveToActivityThree(){
        Intent intent2=new Intent(this,fruits.class);
        startActivity(intent2);
    }
    public void moveToActivityFour(){
        Intent intent3=new Intent(this,nuts.class);
        startActivity(intent3);
    }

}
