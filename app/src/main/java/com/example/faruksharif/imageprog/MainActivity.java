package com.example.faruksharif.imageprog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchCat(View view) {

        Log.i("Click","Please click!!!");
        ImageView image=(ImageView)findViewById(R.id.img);
        image.setImageResource(R.drawable.t);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
