package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class splash extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        button = (Button) findViewById(R.id.btn2);
        button1 = (Button) findViewById(R.id.btn3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityThree();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }
    public void moveToActivityThree(){
        Intent intent2=new Intent(this,nutrition.class);
        startActivity(intent2);
    }
}
