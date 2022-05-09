package com.example.temi_rehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_rehabilitation;
    Button btn_medicine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_rehabilitation = (Button) findViewById(R.id.btn_rehabilitation);
        btn_rehabilitation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : MAIN > REHABILITATION");
                Intent intent = new Intent(getApplicationContext(), RehabilitationActivity.class);
                startActivity(intent);
            }
        });

        btn_medicine= (Button) findViewById(R.id.btn_medicine);
        btn_medicine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Log.d("TAG", "Intent : MAIN > MEDICINE");
            }
        });
    }
}