package com.example.temi_rehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class WalkingActivity extends AppCompatActivity {

    Button btn_prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walking);

        btn_prev= (Button) findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : WALKING > PHYSICAL");
                Intent intent = new Intent(getApplicationContext(), PhysicalActivity.class);
                startActivity(intent);
            }
        });
    }
}