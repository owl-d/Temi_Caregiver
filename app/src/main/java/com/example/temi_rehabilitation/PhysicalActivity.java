package com.example.temi_rehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PhysicalActivity extends AppCompatActivity {

    Button btn_stretching;
    Button btn_walking;
    Button btn_prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical);

        btn_stretching = (Button) findViewById(R.id.btn_stretching);
        btn_stretching.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : PHYSICAL > STRETCHING");
                Intent intent = new Intent(getApplicationContext(), StretchingActivity.class);
                startActivity(intent);
            }
        });

        btn_walking = (Button) findViewById(R.id.btn_walking);
        btn_walking.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : PHYSICAL > WALKING");
                Intent intent = new Intent(getApplicationContext(), WalkingActivity.class);
                startActivity(intent);
            }
        });

        btn_prev= (Button) findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : PHYSICAL > REHABILITATION");
                Intent intent = new Intent(getApplicationContext(), RehabilitationActivity.class);
                startActivity(intent);
            }
        });
    }
}