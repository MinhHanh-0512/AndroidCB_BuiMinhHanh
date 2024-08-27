package com.example.ramdoms;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.TextView;
import android.widget.Button;
import android.view.View;


import java.util.Random;

import kotlin.random.URandomKt;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv_So);
        btn = findViewById(R.id.btn_rd);

        final Random rd = new Random();

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                int val = rd.nextInt(90000);
                tv.setText(Integer.toString(val));
            }
        });
    }
}