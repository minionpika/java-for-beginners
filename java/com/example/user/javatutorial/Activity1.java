package com.example.user.javatutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity1 extends AppCompatActivity {

    ImageButton basic, loops, arrays, obj, moreclass, exception, threads, congrats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        basic= (ImageButton)findViewById(R.id.imageButton);
        loops = (ImageButton)findViewById(R.id.imageButton2);
        arrays= (ImageButton)findViewById(R.id.imageButton3);
        obj= (ImageButton)findViewById(R.id.imageButton4);
        moreclass= (ImageButton)findViewById(R.id.imageButton5);
        exception= (ImageButton)findViewById(R.id.imageButton6);
        threads= (ImageButton)findViewById(R.id.imageButton7);
        congrats= (ImageButton)findViewById(R.id.imageButton8);

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(Activity1.this, BasicConcept.class);
                startActivity(intent1);
            }
        });

        loops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Activity1.this, ConditionalsLoops.class);
                startActivity(intent2);
            }
        });

        arrays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(Activity1.this, Arrays.class);
                startActivity(intent3);
            }
        });

        obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(Activity1.this, ClassesObjects.class);
                startActivity(intent4);
            }
        });

        moreclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5= new Intent(Activity1.this, MoreOnClasses.class);
                startActivity(intent5);
            }
        });

        exception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6= new Intent(Activity1.this, ExceptionListFile.class);
                startActivity(intent6);
            }
        });

        threads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7= new Intent(Activity1.this, MultiThreading.class);
                startActivity(intent7);
            }
        });

        congrats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8= new Intent(Activity1.this, Congrats.class);
                startActivity(intent8);
            }
        });
    }
}
