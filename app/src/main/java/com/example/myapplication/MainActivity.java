package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    TextView view;
    Button bt_sum;
    Button bt_min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.TextView);
        bt_sum = findViewById(R.id.button);
        bt_min = findViewById(R.id.button2);

        bt_sum.setOnClickListener(e -> {
            counter++;
            view.setText(Integer.toString(counter));
        });
        bt_min.setOnClickListener(e -> {
            counter--;
            view.setText(Integer.toString(counter));
        });
    }
}