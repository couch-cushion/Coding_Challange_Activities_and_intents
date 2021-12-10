package com.example.codingchallangeactivitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {
    TextView txtView;
    public static final String TAG=secondactivity.class.getSimpleName();
    private String textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        txtView=findViewById(R.id.txtView);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_PASSAGE);
        if(message!=null) {
            txtView.setText(message);
        }
        else{
            Log.d(TAG,"message not received" );
        }
    }
}