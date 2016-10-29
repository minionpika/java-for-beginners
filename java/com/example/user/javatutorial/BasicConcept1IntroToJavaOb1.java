package com.example.user.javatutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class BasicConcept1IntroToJavaOb1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_concept1_intro_to_java_ob1);
        check();
    }

    public void check()
    {
        final CheckBox checkBox_2version= (CheckBox)findViewById(R.id.checkBox_twoversions);
        final CheckBox oneforeachplat= (CheckBox)findViewById(R.id.checkBox2_oneforeachplatform);
        final CheckBox justone= (CheckBox)findViewById(R.id.checkBox3_justoneversion);
        final CheckBox hugedeveloper= (CheckBox)findViewById(R.id.checkBox);
        final CheckBox usedonlyweb= (CheckBox)findViewById(R.id.checkBox2);
        final CheckBox usedinnasa= (CheckBox)findViewById(R.id.checkBox3);
        Button btn1= (Button)findViewById(R.id.button3);
        Button btn2= (Button)findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer ss= new StringBuffer();
                if(checkBox_2version.isChecked()) ss.append("WRONG");
                if (oneforeachplat.isChecked()) ss.append("WRONG");
                if(justone.isChecked()) ss.append("RIGHT");

                Toast.makeText(BasicConcept1IntroToJavaOb1.this, ss.toString(), Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer ss1= new StringBuffer();
                if(usedonlyweb.isChecked()) ss1.append("WRONG");
                if (usedinnasa.isChecked()) ss1.append("WRONG");
                if(hugedeveloper.isChecked()) ss1.append("RIGHT");

                Toast.makeText(BasicConcept1IntroToJavaOb1.this, ss1.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
