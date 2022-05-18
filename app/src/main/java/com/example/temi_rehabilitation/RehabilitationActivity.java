package com.example.temi_rehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RehabilitationActivity extends AppCompatActivity {

    Button btn_memory;
    Button btn_physical;
    Button btn_prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehabilitation);

        btn_memory = (Button) findViewById(R.id.btn_memory);
        btn_memory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : REHABILITATION > MEMORY");
                Intent intent = new Intent(getApplicationContext(), MemoryActivity.class);
                startActivity(intent);
            }
        });

        btn_physical= (Button) findViewById(R.id.btn_physical);
        btn_physical.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : REHABILITATION > PHYSICAL");
                Intent intent = new Intent(getApplicationContext(), PhysicalActivity.class);
                startActivity(intent);
            }
        });

        btn_prev= (Button) findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : REHABILITATION > MAIN");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}