package com.example.codingchallangeactivitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button txt1 ,txt2,txt3;
    public static final String EXTRA_PASSAGE="com.example.twoactivities.extra.PASSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.btn_1);
        txt2 = findViewById(R.id.btn_2);
        txt3 = findViewById(R.id.btn_3);

    }

    public void Btn_1(View view) {

        Intent intent = new Intent(MainActivity.this, secondactivity.class);
        intent.putExtra(EXTRA_PASSAGE,getResources().getString(R.string.paragraph_1));
        startActivity(intent);
        
    }

    public void Btn_2(View view) {
        Intent intent = new Intent(MainActivity.this, secondactivity.class);
        intent.putExtra(EXTRA_PASSAGE,getResources().getString(R.string.paragraph_2));
        startActivity(intent);
    }

    public void Btn_3(View view) {
            Intent intent = new Intent(MainActivity.this, secondactivity.class);
            intent.putExtra(EXTRA_PASSAGE,getResources().getString(R.string.paragraph_3));
            startActivity(intent);
    }
}