package com.example.user.javatutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BasicConcept14Module1Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_concept14_module1_quiz);
        tt();
    }
    public void tt()
    {
        final EditText ed1= (EditText)findViewById(R.id.editText5);
        final EditText ed2= (EditText)findViewById(R.id.editText6);
        EditText ed3= (EditText)findViewById(R.id.editText7);
        EditText ed4= (EditText)findViewById(R.id.editText8);

        Button btn1= (Button)findViewById(R.id.button12);
        Button btn2= (Button)findViewById(R.id.button13);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check1= ed1.getText().toString();
                String check2= ed2.getText().toString();
                StringBuffer ss= new StringBuffer();

            }
        });
    }
}
