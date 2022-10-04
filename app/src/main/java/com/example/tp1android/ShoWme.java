package com.example.tp1android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShoWme extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showme);
        TextView names =  (TextView) findViewById(R.id.textView);
        Intent g = getIntent();
        String msg = g.getStringExtra(MainActivity.EXTRA_MESSAGE);
        names.setText(msg);
    }
}