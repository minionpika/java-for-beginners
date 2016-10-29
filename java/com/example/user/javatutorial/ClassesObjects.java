package com.example.user.javatutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ClassesObjects extends AppCompatActivity {

    ListView lv;
    String []values={"1. Creating Class", "2. Constructor", "3. Other Properties of Class", "4. Modulo Quiz"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes_objects);


        lv=(ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent intent= new Intent(ClassesObjects.this, ClassesObjects1Creatingclass.class);
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent= new Intent(ClassesObjects.this, ClassesObjects2Constructor.class);
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent= new Intent(ClassesObjects.this, ClassesObjects3Others.class);
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent= new Intent(ClassesObjects.this, ClassesObjects4Quiz.class);
                    startActivity(intent);
                }
            }
        });
    }
}
