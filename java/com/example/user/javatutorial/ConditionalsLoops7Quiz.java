package com.example.user.javatutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConditionalsLoops7Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditionals_loops7_quiz);
        gg();
    }
    public void gg()
    {
        final EditText ed1= (EditText)findViewById(R.id.editText9);
        final EditText ed2= (EditText)findViewById(R.id.editText10);
        final EditText ed3= (EditText)findViewById(R.id.editText11);
        final EditText ed4= (EditText)findViewById(R.id.editText12);

        Button btn1= (Button)findViewById(R.id.button14);
        Button btn2= (Button)findViewById(R.id.button15);

        final String check1= ed1.getText().toString();
        final String check2= ed2.getText().toString();
        String check3= ed3.getText().toString();
        String check4= ed4.getText().toString();


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String check1= ed1.getText().toString();
                final String check2= ed2.getText().toString();
                StringBuffer ss= new StringBuffer();

                if(check1.equals("7") && check2.equals("x"))
                {
                    Toast.makeText(ConditionalsLoops7Quiz.this, ss.append("GOOD"), Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(ConditionalsLoops7Quiz.this, ss.append("WRONG"), Toast.LENGTH_LONG).show();
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String check1= ed3.getText().toString();
                final String check2= ed4.getText().toString();
                StringBuffer ss= new StringBuffer();

                if(check1.equals("&&") && check2.equals("72"))
                {
                    Toast.makeText(ConditionalsLoops7Quiz.this, ss.append("GOOD"), Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(ConditionalsLoops7Quiz.this, ss.append("WRONG"), Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
