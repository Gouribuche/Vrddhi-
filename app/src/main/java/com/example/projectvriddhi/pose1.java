package com.example.projectvriddhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pose1 extends AppCompatActivity {

    String buttonvalue;
    Button startbtn;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private boolean MTimerunning;
    private long Mtimerun;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pose1);


        Intent intent = getIntent();
        buttonvalue= intent.getStringExtra("value");


        int intvalue = Integer.valueOf(buttonvalue);

        switch (intvalue){

            case 1 :
                setContentView(R.layout.activity_pose2);
                break;
            case 2 :
                setContentView(R.layout.activity_pose3);
                break;
            case 3 :
                setContentView(R.layout.activity_pose4);
                break;
            case 4 :
                setContentView(R.layout.activity_pose5);
                break;
            case 5 :
                setContentView(R.layout.activity_pose6);
                break;
            case 6 :
                setContentView(R.layout.activity_pose7);
                break;

        }

        startbtn=findViewById(R.id.startbutton);
        mtextview=findViewById(R.id.time);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MTimerunning)
                {
                    stoptimer();


                }
                else {
                    startTimer();

                }
            }
        });



    }

    private void stoptimer(){

        countDownTimer.cancel();
        MTimerunning=false;
        startbtn.setText("START");

    }


    private void startTimer(){


        final CharSequence value1=mtextview.getText();
        String num1=value1.toString();
        String num2= num1.substring(0,2);
        String num3= num1.substring(3,5);


        final int number= Integer.valueOf(num2)* 60+ Integer.valueOf(num3);
        Mtimerun = number*1000;


        countDownTimer = new CountDownTimer(Mtimerun,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                Mtimerun= millisUntilFinished;
                updateTimer();

            }

            @Override
            public void onFinish() {

                int newvalue = Integer.valueOf(buttonvalue)+1;
                if (newvalue<=7){
                    Intent intent = new Intent(pose1.this,pose1.class);

                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                    intent.putExtra("value",String.valueOf(newvalue));
                    startActivity(intent);

                }
                else {
                    newvalue=1;
                    Intent intent=new Intent(pose1.this,pose1.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newvalue));
                    startActivity(intent);


                }
            }
        }.start();
        startbtn.setText("Pause");
        MTimerunning=true;

    }

    private void updateTimer()
    {
        int minutes=(int) Mtimerun/60000;
        int seconds=(int) Mtimerun%60000/1000;

        String timelefttext="";
        if (minutes<10)
            timelefttext="0";
        timelefttext= timelefttext+minutes+":";
        if (seconds<10)
            timelefttext+="0";
        timelefttext+=seconds;
        mtextview.setText(timelefttext);




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}