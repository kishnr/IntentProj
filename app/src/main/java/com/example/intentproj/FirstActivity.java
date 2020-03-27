package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


    EditText num1;
    EditText num2;
    Button btn;

    String numb1;
    String numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById((R.id.num2));
        btn = (Button)findViewById(R.id.submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                intent.putExtra("n1",num1.getText().toString());
                intent.putExtra("n2", num2.getText().toString());

                Context context = getApplicationContext();
                CharSequence message = "You clicked the button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);

                startActivity(intent);
            }
        });



    }


}
