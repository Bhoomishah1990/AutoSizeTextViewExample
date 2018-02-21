package com.autotextviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvAutoSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAutoSize = findViewById(R.id.tvAutoSize);
    }

    public void onClick(View view) {
        tvAutoSize.setText(tvAutoSize.getText() + " AutoTextViewExample");
    }
}
