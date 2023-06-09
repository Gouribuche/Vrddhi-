package com.example.projectvriddhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pushup extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup);
        button1 = findViewById(R.id.pushupwelcome);
    }
    public void OnClickFind(View view){
        Intent intent = new Intent(getApplicationContext(), PushupMain.class);
        startActivity(intent);
        finish();
    }
}