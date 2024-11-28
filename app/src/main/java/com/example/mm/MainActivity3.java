package com.example.mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
Button log_out;
SharedPreferences sp;
SharedPreferences.Editor ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        log_out = findViewById(R.id.button);
        Intent i = getIntent();
        sp = getSharedPreferences("user" , MODE_PRIVATE);
        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed = sp.edit();
                ed.clear();
                ed.apply();
                Intent i = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}