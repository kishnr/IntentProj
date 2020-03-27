package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView value1;
    TextView value2;
    TextView method;
    Button add;
    Button minus;
    Button div;
    Button mul;
    EditText temp;

    String num1;
    String num2;

    //double variables to do calculations
    double val1,val2,total =0;

    CharSequence message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        value1 = (TextView) findViewById(R.id.numbe1);
        value2 = (TextView) findViewById(R.id.numbe2);
        method = (TextView) findViewById(R.id.output);

        add = (Button) findViewById(R.id.add);
        minus =(Button) findViewById(R.id.minus);
        mul = (Button) findViewById(R.id.multiply);
        div = (Button) findViewById(R.id.divide);

        Intent receive = getIntent();

        //get passed values to variables
        num1 = receive.getStringExtra("n1");
        num2 = receive.getStringExtra("n2");

        value1.setText(num1);
        value2.setText(num2);

        //convert string variable to double
        val1 = Double.parseDouble(num1);
        val2 = Double.parseDouble(num2);

        final Context context = getApplicationContext();

        final int duration = Toast.LENGTH_LONG;
        final Toast toast = Toast.makeText(context,message,duration);
        toast.setGravity(Gravity.TOP,0,0);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" + "+ val2 +" = "+ (val1+val2));

                message = "Add two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" - "+ val2 +" = "+ (val1-val2));

                message = "Subtract two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" * "+ val2 +" = "+ (val1*val2));

                message = "Multiply two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });
        
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" / "+ val2 +" = "+ (val1/val2));

                message = "Devide two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });
    }


}