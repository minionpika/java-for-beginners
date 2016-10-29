package com.example.user.javatutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ClassesObjects4Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes_objects4_quiz);

        final EditText ed1= (EditText)findViewById(R.id.editText15);
        final EditText ed2= (EditText)findViewById(R.id.editText16);
        final EditText ed3= (EditText)findViewById(R.id.editText17);
        final EditText ed4= (EditText)findViewById(R.id.editText18);
        final EditText ed5= (EditText)findViewById(R.id.editText19);
        Button btn= (Button)findViewById(R.id.button22);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String c1= ed1.getText().toString();
                String c2= ed2.getText().toString();
                String c3= ed3.getText().toString();
                String c4= ed4.getText().toString();
                String c5= ed5.getText().toString();

                StringBuffer ss= new StringBuffer(); //b a e d  c

                if(c1.equals("a") && c2.equals("c") && c3.equals("b") && c4.equals("e") && c5.equals("d") )
                {
                    Toast.makeText(ClassesObjects4Quiz.this, ss.append("EXCELLENT"), Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(ClassesObjects4Quiz.this, ss.append("SORRY !!! WRONG"), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
