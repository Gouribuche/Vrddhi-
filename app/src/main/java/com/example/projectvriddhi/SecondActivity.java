package com.example.projectvriddhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        newArray = new int[]{

                R.id.one_pose,R.id.two_pose,R.id.three_pose,R.id.four_pose,R.id.five_pose,R.id.six_pose,R.id.seven_pose,




        };
    }


    public void Imagebuttonclicked(View view) {

        for(int i=0;i< newArray.length;i++){


            if (view.getId()== newArray[i]){
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity.this,pose1.class);
                intent.putExtra("value",String.valueOf(value));

                startActivity(intent);

            }
        }



    }
}