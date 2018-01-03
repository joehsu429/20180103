package com.example.student.a20180103;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView);
    }
    public void click1(View v)
    {
        img.setImageResource(R.drawable.black1);
    }
    public void click2(View v)
    {
        Picasso.with(MainActivity.this).load("https://www.fotor.com/images2/features/photo_effects/e_bw.jpg")
                .into(img);
    }
    public void click3(View v)
    {
        img.setImageResource(R.drawable.bb);
    }
}
