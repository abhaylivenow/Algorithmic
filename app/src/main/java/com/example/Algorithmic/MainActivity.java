package com.example.Algorithmic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dsaapp.R;

public class MainActivity extends AppCompatActivity {

    private Button btnEnterApp , btnPractise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        initViews();

        btnEnterApp.setOnClickListener(new View.OnClickListener() {      // Button to explore the main content of tha app
            @Override
            public void onClick(View v) {   // Intent to the content page
              Intent intent = new Intent(MainActivity.this,content_activity.class);
              startActivity(intent);
            }
        });

        btnPractise.setOnClickListener(new View.OnClickListener() {     // Button to explore practise question (Advanced Level)
            @Override
            public void onClick(View v) {
                // will be coming in next update
                Toast.makeText(MainActivity.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void initViews(){
        btnEnterApp = findViewById(R.id.btnEnterApp);
        btnPractise = findViewById(R.id.btnPractise);
    }
}