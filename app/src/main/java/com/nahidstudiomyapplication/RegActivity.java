package com.nahidstudiomyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        this.setTitle("Register");
    }
}