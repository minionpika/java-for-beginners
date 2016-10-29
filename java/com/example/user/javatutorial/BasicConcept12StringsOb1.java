package com.example.user.javatutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BasicConcept12StringsOb1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_concept12_strings_ob1);
        ya();
    }
    public void ya()
    {
        final EditText ed1= (EditText)findViewById(R.id.editText3);
        final EditText ed2= (EditText)findViewById(R.id.editText4);
        Button btn= (Button)findViewById(R.id.button11);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String check1= ed1.getText().toString();
                String check2= ed2.getText().toString();
                StringBuffer ss= new StringBuffer();

                if(check1.equals("String") && check2.equals("var"))
                {
                    Toast.makeText(BasicConcept12StringsOb1.this, ss.append("GOOD").toString(), Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(BasicConcept12StringsOb1.this, ss.append("WRONG").toString(), Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
