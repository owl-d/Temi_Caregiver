package com.example.temi_rehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MatchingActivity extends AppCompatActivity {

    Button btn_animal;
    Button btn_fruit;
    Button btn_figure;
    private ImageView imageView;

    static int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching);

        make_problem();

        btn_animal = (Button) findViewById(R.id.btn_animal);
        btn_animal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Matching Game : Submit");

                if (answer == 1) {
                    Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_SHORT).show();
                    make_problem();
                }
                else {
                    Toast.makeText(getApplicationContext(), "틀렸습니다!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_fruit = (Button) findViewById(R.id.btn_fruit);
        btn_fruit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Matching Game : Submit");

                if (answer == 2) {
                    Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_SHORT).show();
                    make_problem();
                }
                else {
                    Toast.makeText(getApplicationContext(), "틀렸습니다!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_figure = (Button) findViewById(R.id.btn_figure);
        btn_figure.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Matching Game : Submit");

                if (answer == 3) {
                    Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_SHORT).show();
                    make_problem();
                }
                else {
                    Toast.makeText(getApplicationContext(), "틀렸습니다!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void make_problem() {

        imageView = (ImageView)findViewById(R.id.imageView);
        int option = (int)((Math.random()*30000)%15);

        if (option == 0) {
            imageView.setImageResource(R.drawable.dog);
            answer = 1;
        }
        else if (option == 1) {
            imageView.setImageResource(R.drawable.cat);
            answer = 1;
        }
        else if (option == 2) {
            imageView.setImageResource(R.drawable.giraffe);
            answer = 1;
        }
        else if (option == 3) {
            imageView.setImageResource(R.drawable.lion);
            answer = 1;
        }
        else if (option == 4) {
            imageView.setImageResource(R.drawable.tiger);
            answer = 1;
        }
        else if (option == 5) {
            imageView.setImageResource(R.drawable.grape);
            answer = 2;
        }
        else if (option == 6) {
            imageView.setImageResource(R.drawable.apple);
            answer = 2;
        }
        else if (option == 7) {
            imageView.setImageResource(R.drawable.pineapple);
            answer = 2;
        }
        else if (option == 8) {
            imageView.setImageResource(R.drawable.strawberry);
            answer = 2;
        }
        else if (option == 9) {
            imageView.setImageResource(R.drawable.watermelon);
            answer = 2;
        }
        else if (option == 10) {
            imageView.setImageResource(R.drawable.circle);
            answer = 3;
        }
        else if (option == 11) {
            imageView.setImageResource(R.drawable.triangle);
            answer = 3;
        }
        else if (option == 12) {
            imageView.setImageResource(R.drawable.square);
            answer = 3;
        }
        else if (option == 13) {
            imageView.setImageResource(R.drawable.sphere);
            answer = 3;
        }
        else if (option == 14) {
            imageView.setImageResource(R.drawable.cone);
            answer = 3;
        }
    }
}