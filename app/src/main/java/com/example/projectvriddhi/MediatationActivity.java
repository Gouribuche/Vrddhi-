package com.example.projectvriddhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toolbar;

public class MediatationActivity extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediatation);

        newArray = new int[]{

                R.id.mindfulness,R.id.spiritual,R.id.focused,R.id.mantra,
        };
    }


    public void Imagebuttonclicked(View view) {

        for(int i=0;i< newArray.length;i++){


            if (view.getId()== newArray[i]){
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(MediatationActivity.this,mindfulness.class);
                intent.putExtra("value",String.valueOf(value));

                startActivity(intent);

            }
        }



    }
}