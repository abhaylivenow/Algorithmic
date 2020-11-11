package com.example.Algorithmic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dsaapp.R;

public class StringContent extends AppCompatActivity {

    private TextView Para1,Layout1,Layout2,Layout3,Layout4;
    private Button btnNext, btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_content);

        initViews();

        String Para1Text = "Strings are defined as an array of characters. The difference between a " +
                "character array and a string is the string is terminated with a special character ‘\\0’.";

        Para1.setText(Para1Text);

        String Layout1Text = "char str_name[size];";
        Layout1.setText(Layout1Text);

        String Layout2Text = "char greeting[6] = {'H', 'e', 'l', 'l', 'o', '\\0'}";
        Layout2.setText(Layout2Text);

        String Layout3Text = "String str = \"GeeksForGeeks\"";
        Layout3.setText(Layout3Text);

        String Layout4Text = "empty_string = \"\"";
        Layout4.setText(Layout4Text);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StringContent.this,LinkedListContent.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StringContent.this,TreeContent.class);
                startActivity(i);
            }
        });

    }

    public void initViews(){
        Para1 = findViewById(R.id.Para1);
        Layout1 = findViewById(R.id.Layout1Text);
        Layout2 = findViewById(R.id.Layout2Text);
        Layout3 = findViewById(R.id.Layout3Text);
        Layout4 = findViewById(R.id.Layout4Text);

        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
    }
}