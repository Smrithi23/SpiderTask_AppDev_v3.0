package com.example.smrithi_bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {



    EditText height, weight;
    TextView header, bmi, result;
    Button reset,calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height  = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        header= (TextView) findViewById(R.id.header);
        bmi= (TextView) findViewById(R.id.bmi);
        result= (TextView) findViewById(R.id.result);
        reset = (Button) findViewById(R.id.reset);
        calculate = (Button) findViewById(R.id.calculate);
    }
    public void Calculate(View view) {
        display1();
    }
    public void Reset(View view) {
        display2();
    }
    private void display1() {
        String value1 = height.getText().toString();
        String value2 = weight.getText().toString();


        float val1 = Integer.parseInt(value1);
        float val2 = Integer.parseInt(value2);
        float res = ((val2*100*100)/(val1*val1));

        bmi.setText(String.valueOf(res));

        if(res<15)
        {
            result.setText("Very severely underweight");
        }
        else if(res<16)
        {
            result.setText("Severely underweight");
        }
        else if(res<18.5)
        {
            result.setText("Underweight");
        }
        else if(res<25)
        {
            result.setText("Normal");
        }
        else if(res<30)
        {
            result.setText("Overweight");
        }
        else if(res<35)
        {
            result.setText("Moderately obese");
        }
        else if(res<40)
        {
            result.setText("Severely obese");
        }
        else
        {
            result.setText("Very severely obese");
        }
    }
    private void display2() {
        bmi.setText("bmi");
        result.setText("normal");
        height.setText("0");
        weight.setText("0");
    }


}
