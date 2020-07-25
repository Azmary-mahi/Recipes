package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class bmi extends AppCompatActivity {
    EditText weight,hight;
    TextView result;
    String calculation,BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        weight= findViewById(R.id.weight);
        hight= findViewById(R.id.hight);
        result= findViewById(R.id.result);
    }

    public void calculateBMI(View view) {
        String S1= weight.getText().toString();
        String S2= hight.getText().toString();
        float weightvalue = Float.parseFloat(S1);
        float hightvalue = Float.parseFloat(S2)/100;
        float bmi = weightvalue/(hightvalue + hightvalue);
        if(bmi<16){
            BMIresult = "Severely Under Weight";
        }else if(bmi<18.5){
            BMIresult = "Under Weight";
        }else if(bmi>=18.5&& bmi<=24.9){
            BMIresult = "Normal Weight";
        }else if(bmi>=25&& bmi<=29.9){
            BMIresult = "OverWeight";
        }else {
            BMIresult = "Obese";
        }
        calculation="Result:\n\n"+ bmi +"\n" +BMIresult;
        result.setText(calculation);
    }
}
