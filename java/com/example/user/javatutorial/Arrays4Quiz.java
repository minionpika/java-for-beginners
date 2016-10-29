package com.example.user.javatutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Arrays4Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrays4_quiz);

        final EditText ed1= (EditText)findViewById(R.id.editText13);
        EditText ed2= (EditText)findViewById(R.id.editText14);
        Button btn1= (Button)findViewById(R.id.button17);
        Button btn2= (Button)findViewById(R.id.button18);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check= ed1.getText().toString();
                StringBuffer ss= new StringBuffer();

                if(check.equals("2"))
                {
                    Toast.makeText(Arrays4Quiz.this, ss.append("RIGHT"), Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Arrays4Quiz.this, ss.append("WRONG"), Toast.LENGTH_LONG).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check= ed1.getText().toString();
                StringBuffer ss= new StringBuffer();

                if(check.equals("17"))
                {
                    Toast.makeText(Arrays4Quiz.this, ss.append("RIGHT"), Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Arrays4Quiz.this, ss.append("WRONG"), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
