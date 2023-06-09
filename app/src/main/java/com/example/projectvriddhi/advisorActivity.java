package com.example.projectvriddhi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class advisorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advisor);
    }
    public void OnClickFind(View view){
        TextView e1 = findViewById(R.id.exercise1);
        TextView e2 = findViewById(R.id.exercise2);
        ImageView e1img = findViewById(R.id.exercise1img);
        ImageView e2img = findViewById(R.id.exercise2img);
        Spinner workoutType = findViewById(R.id.bodypart);
        String bodyPart = String.valueOf(workoutType.getSelectedItem());
        if(bodyPart.equals("Chest")){
            e1.setText("BenchPress");
            e1img.setImageResource(R.drawable.cheste1);
            e2.setText("Chest Fly");
            e2img.setImageResource(R.drawable.cheste2);
        }
        else if(bodyPart.equals("Triceps")){
            e1.setText("CablePushdown");
            e1img.setImageResource(R.drawable.tricepe1);
            e2.setText("DIPS");
            e2img.setImageResource(R.drawable.tricepe2);
        }
        else if(bodyPart.equals("Back")){
            e1.setText("LatPulldown");
            e1img.setImageResource(R.drawable.backe1);
            e2.setText("Rowing");
            e2img.setImageResource(R.drawable.backe2);
        }
        else if(bodyPart.equals("Legs")){
            e1.setText("Squats");
            e1img.setImageResource(R.drawable.legse1);
            e2.setText("LegPress");
            e2img.setImageResource(R.drawable.legse2);
        }
        else if(bodyPart.equals("Shoulders")){
            e1.setText("ShoulderPress");
            e1img.setImageResource(R.drawable.shouldere1);
            e2.setText("FrontRaises");
            e2img.setImageResource(R.drawable.shouldere2);
        }
        else{
            e1.setText("BicepCurl");
            e1img.setImageResource(R.drawable.bicepe1);
            e2.setText("PullUps");
            e2img.setImageResource(R.drawable.bicepe2);
        }
    }
}