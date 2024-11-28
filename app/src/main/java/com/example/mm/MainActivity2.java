package com.example.mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
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
import java.util.ResourceBundle;


public class MainActivity2 extends AppCompatActivity {
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    sp = getSharedPreferences("user" , MODE_PRIVATE);
                    String username = sp.getString("username", null);
                    String password = sp.getString("password", null);

                    if (username != null && password != null) {
                        // If credentials are saved, go to the third activity
                        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                        startActivity(intent);
                    } else {
                        // Otherwise, go to the login activity
                        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                        startActivity(intent);
                    }

                    finish();
                }
            },2000);
        }}



