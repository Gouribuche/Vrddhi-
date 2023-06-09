package com.example.projectvriddhi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class PushupMain extends AppCompatActivity {
    TextView goal, counter, cheer;
    int count, session;
    Button end;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup_main);
        Random random = new Random();
        int session = random.nextInt(6) + 15;
        count = 0;
        goal = findViewById(R.id.goal);
        counter = findViewById(R.id.counter);
        cheer = findViewById(R.id.cheer);
        goal.setText("Session Goal: " + Integer.toString(session));
        RelativeLayout rootLayout = findViewById(R.id.root_layout);
        rootLayout.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    count+=1;
                    counter.setText(Integer.toString(count));
                    if (count==1){
                        cheer.setText("Keep Pushing");
                    }
                    else if (count == session / 2){
                        cheer.setText("Halfway There!!");
                    }
                    else if (((session/2)+1)==count){
                        cheer.setText("Keep Pushing");
                    }
                    else if (session-count==3){
                        cheer.setText("3!");
                    }
                    else if (session-count==2){
                        cheer.setText("2!");
                    }
                    else if (session-count==1){
                        cheer.setText("1!");
                    }
                    else if (session-count==0){
                        cheer.setText("0! GOOD JOB!");
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();

                    }
                    else{
                        cheer.setText("Well Done! Keep Pushing");
                    }
                }
                return true;
            }
        });
    }
    }
