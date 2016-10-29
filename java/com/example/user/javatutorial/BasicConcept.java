package com.example.user.javatutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BasicConcept extends AppCompatActivity {

    ListView lv;
    String []values= {"1. Introduction To Java", "2. The Development Cycle", "3. Installing the JDK", "4. A Hello World Program", "5. Java Comments", "6. Variables",
    "7. Primitive Operators", "8. Increment & Decrement", "9. Strings", "10. Getting User Input", "11. Module 1 Quiz"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_concept);

        lv=(ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept1IntroToJava.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept2DevCycle.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept3InstallJDK.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept7HelloWorld.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept8Comments.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept9Variables.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept10Operators.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept11IncreDecre.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept12Strings.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept13Userinput.class);
                    startActivityForResult(myIntent, 0);
                }

                else if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), BasicConcept14Module1Quiz.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}
