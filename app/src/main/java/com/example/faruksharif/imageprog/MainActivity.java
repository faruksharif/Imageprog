package com.example.faruksharif.imageprog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void switchCat(View view) {

        Log.i("Click","Please click!!!");
        ImageView img=(ImageView)findViewById(R.id.img);
        img.setImageResource(R.drawable.t);
        Toast.makeText(this, "Next image", Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
