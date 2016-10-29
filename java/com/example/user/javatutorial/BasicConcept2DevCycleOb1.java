package com.example.user.javatutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class BasicConcept2DevCycleOb1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_concept2_dev_cycle_ob1);
        yapi();
    }

    public void yapi()
    {
        final RadioGroup radioGroup1= (RadioGroup)findViewById(R.id.radioGroup);
        final RadioButton radioButton1=(RadioButton)findViewById(R.id.radioButton);
        final RadioButton radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        final RadioButton radioButton3=(RadioButton)findViewById(R.id.radioButton3);

        RadioGroup radioGroup2= (RadioGroup)findViewById(R.id.radioGroup2);
        final RadioButton radioButton4=(RadioButton)findViewById(R.id.radioButton4);
        final RadioButton radioButton5=(RadioButton)findViewById(R.id.radioButton5);
        final RadioButton radioButton6=(RadioButton)findViewById(R.id.radioButton6);

        Button btn1= (Button)findViewById(R.id.button6);
        Button btn2= (Button)findViewById(R.id.button7);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer ss= new StringBuffer();
                if(radioButton1.isChecked())  ss.append("WRONG");
                else if(radioButton2.isChecked())  ss.append("RIGHT");
                else if(radioButton3.isChecked())  ss.append("WRONG");

                Toast.makeText(BasicConcept2DevCycleOb1.this, ss.toString(), Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer ss1= new StringBuffer();
                if(radioButton4.isChecked())  ss1.append("WRONG");
                else if(radioButton5.isChecked())  ss1.append("RIGHT");
                else if(radioButton6.isChecked())  ss1.append("WRONG");

                Toast.makeText(BasicConcept2DevCycleOb1.this, ss1.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
