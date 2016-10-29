package com.example.user.javatutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConditionalsLoops extends AppCompatActivity {
    ListView lv;
    String []values= {"1. Conditional Statements", "2. Nested if Statements", "3. Switch Statements", "4. While Loops", "5. For Loops", "6. Do While Loops",
            "7. Module Quiz 2" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditionals_loops);

        lv=(ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent= new Intent(ConditionalsLoops.this, ConditionalsLoops1ConditionalStatement.class);
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent= new Intent(ConditionalsLoops.this, ConditionalsLoops2Nestedif.class);
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent= new Intent(ConditionalsLoops.this, ConditionalsLoops3Switch.class);
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent= new Intent(ConditionalsLoops.this, ConditionalsLoops4Whileloops.class);
                    startActivity(intent);
                }
                else if(position==4)
                {
                    Intent intent= new Intent(ConditionalsLoops.this, ConditionalsLoops5Forloops.class);
                    startActivity(intent);
                }
                else if(position==5)
                {
                    Intent intent= new Intent(ConditionalsLoops.this, ConditionalsLoops6DoWhile.class);
                    startActivity(intent);
                }
                else if(position==6)
                {
                    Intent intent= new Intent(ConditionalsLoops.this, ConditionalsLoops7Quiz.class);
                    startActivity(intent);
                }

            }
        });
    }
}
