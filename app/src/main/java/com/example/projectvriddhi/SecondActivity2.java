package com.example.projectvriddhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toolbar;

public class SecondActivity2 extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        newArray = new int[]{

                R.id.yoga1,R.id.yoga2,R.id.yoga3,R.id.yoga4,R.id.yoga5,R.id.yoga6,R.id.yoga7,




        };
    }


    public void Imagebuttonclicked1(View view) {

        for(int i=0;i< newArray.length;i++){


            if (view.getId()== newArray[i]){
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this,yogapose1.class);
                intent.putExtra("value",String.valueOf(value));

                startActivity(intent);

            }
        }



    }
}