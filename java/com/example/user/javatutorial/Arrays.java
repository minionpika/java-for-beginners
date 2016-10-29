package com.example.user.javatutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Arrays extends AppCompatActivity {

    ListView lv;
    String []values= {"1. Arrays", "2. Enhanced for Loop", "3. Multidimensional Arrays", "4. Module 3 Quiz"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrays);

        lv=(ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent= new Intent(Arrays.this, Arrays1Arrays.class);
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent= new Intent(Arrays.this, Arrays2Enhancedforloop.class);
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent= new Intent(Arrays.this, Arrays3MultidimentionalArrays.class);
                    startActivity(intent);
                }
                else if(position==3)
                {
                    Intent intent= new Intent(Arrays.this, Arrays4Quiz.class);
                    startActivity(intent);
                }
            }
        });
    }
}
