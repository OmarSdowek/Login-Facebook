package com.example.mm;

import static android.widget.Toast.makeText;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.SharedPreferencesCompat;


import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;


public class MainActivity extends AppCompatActivity {
EditText ed1 ,ed2;
private  String m , b;
SharedPreferences sp;
SharedPreferences.Editor edit;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
btn1 = findViewById(R.id.button2);
ed1 = findViewById(R.id.num);
        ed2 = findViewById(R.id.Password);


btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String num = ed1.getText().toString();
        String pass = ed2.getText().toString();
        sp = getSharedPreferences("user" , MODE_PRIVATE);
        edit = sp.edit();
        edit.putString("username" , num);
        edit.putString("password" , pass);

        edit.apply();

Intent i = new Intent(MainActivity.this , MainActivity3.class);
startActivity(i);
finish();

    }
});
        Intent i = getIntent();









    }




}
