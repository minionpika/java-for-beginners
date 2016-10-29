package com.example.user.javatutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BasicConcept7HelloWorldOb1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_concept7_hello_world_ob1);
        yobabe();
    }
    public void yobabe()
    {
        final EditText ed1= (EditText)findViewById(R.id.editText);
        final EditText ed2= (EditText)findViewById(R.id.editText2);
        Button btn= (Button)findViewById(R.id.button9);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check1= ed1.getText().toString();
                String check2= ed2.getText().toString();
                StringBuffer ss= new StringBuffer();

                if(check1.equals("class") && check2.equals("main"))
                {
                    ss.append("GOOD");
                    Toast.makeText(BasicConcept7HelloWorldOb1.this, ss.toString(), Toast.LENGTH_LONG).show();
                }
                else
                {
                    ss.append("YOU ARE WRONG!!");
                    Toast.makeText(BasicConcept7HelloWorldOb1.this, ss.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
