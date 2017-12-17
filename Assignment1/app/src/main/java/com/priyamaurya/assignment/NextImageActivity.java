package com.priyamaurya.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.priyamaurya.assginment.R;


public class NextImageActivity extends AppCompatActivity {

    ImageView imageView;
    String image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_image_activity);
        imageView=findViewById(R.id.image_live);

        final String category=getIntent().getStringExtra("category");
        switch (category){
            case "dance":
                imageView.setImageResource(R.drawable.dance);
                break;
            case "photography":
                imageView.setImageResource(R.drawable.goldenretrieverdogspuppies);
                break;
            case "cooking":
                imageView.setImageResource(R.drawable.pasta_salad);
                break;
        }

        findViewById(R.id.go_live).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(NextImageActivity.this,CameraActivity.class);
                i.putExtra("category",category);
                startActivity(i);
            }
        });
    }
}
