package com.example.temi_rehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MathActivity extends AppCompatActivity {

    TextView tv_title;
    TextView tv_question;
    EditText et_answer;
    Button btn_submit;
    Button btn_next;
    Button btn_prev;

    static int answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_question = (TextView) findViewById(R.id.tv_question);
        et_answer = (EditText) findViewById(R.id.et_answer);

        make_problem();

        btn_submit = (Button) findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Math Game : Submit");

                int submit = Integer.parseInt(et_answer.getText().toString());
                if (submit == answer) {
                    Toast.makeText(getApplicationContext(), "정답입니다!", Toast.LENGTH_SHORT).show();
                    make_problem();
                }
                else {
                    Toast.makeText(getApplicationContext(), "다시 시도해보세요!", Toast.LENGTH_SHORT).show();
                }
                et_answer.setText(null);
            }
        });

        btn_next = (Button) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Math Game : Submit");

                make_problem();
            }
        });

        btn_prev= (Button) findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("TAG", "Intent : MATH > MEMORY");
                Intent intent = new Intent(getApplicationContext(), MemoryActivity.class);
                startActivity(intent);
            }
        });

    }

    private void make_problem() {

        int first = (int)((Math.random()*10000)%10) + 1;
        int second = (int)((Math.random()*10000)%10) + 1;

        int option = (int)((Math.random()*10000)%4);

        if (option==0) { // 덧셈
            tv_question.setText(first + " + " + second + " = ");
            answer = first + second;
        }
        else if (option==1) { // 뺄셈
            tv_question.setText(first + " - " + second + " = ");
            answer = first - second;
        }
        else if (option==2) { // 곱셈
            tv_question.setText(first + " X " + second + " = ");
            answer = first * second;
        }
        else if (option==3) { // 나눗셈
            tv_question.setText(first*second + " / " + second + " = ");
            answer = first;
        }
    }
}