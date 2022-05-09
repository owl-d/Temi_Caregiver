package com.example.temi_rehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MemoryActivity extends AppCompatActivity {

    Button btn_music;
    Button btn_matching;
    Button btn_math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);

        btn_music = (Button) findViewById(R.id.btn_music);
        btn_music.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : MEMORY > MUSIC");
                Intent intent = new Intent(getApplicationContext(), MusicActivity.class);
                startActivity(intent);
            }
        });

        btn_matching = (Button) findViewById(R.id.btn_matching);
        btn_matching.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : MEMORY > MATCHING");
                Intent intent = new Intent(getApplicationContext(), MatchingActivity.class);
                startActivity(intent);
            }
        });

        btn_math = (Button) findViewById(R.id.btn_math);
        btn_math.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : MEMORY > MATH");
                Intent intent = new Intent(getApplicationContext(), MathActivity.class);
                startActivity(intent);
            }
        });
    }
}