package com.nahidstudiomyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nahidstudiomyapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Button click_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click_button = findViewById(R.id.click_button);

        click_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login_Page.class);
                startActivity(intent);
            }
        });






    }
}