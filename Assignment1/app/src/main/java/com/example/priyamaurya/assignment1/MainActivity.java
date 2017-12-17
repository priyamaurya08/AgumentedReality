package com.example.priyamaurya.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.dance).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,NextImageActivity.class);
                i.putExtra("category","dance");
                startActivity(i);
            }
        });
        findViewById(R.id.photography).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,NextImageActivity.class);
                i.putExtra("category","photography");
                startActivity(i);
            }
        });
        findViewById(R.id.cooking).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,NextImageActivity.class);
                i.putExtra("category","cooking");
                startActivity(i);
            }
        });
    }
}
