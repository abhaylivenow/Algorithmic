package com.example.Algorithmic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dsaapp.R;

import org.w3c.dom.Text;

public class HashingContent extends AppCompatActivity {

    private TextView Para1,Para2,Para3,Layout1;
    private Button btnNext, btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashing_content);

        initViews();

        String Para1Text = "Hashing is an important Data Structure which is designed to use a " +
                "special function called the Hash function which is used to map a given value with" +
                " a particular key for faster access of elements. The efficiency of mapping depends of " +
                "the efficiency of the hash function used.\n" +
                "\n" +
                "Let a hash function H(x) maps the value x at the index x%10 in an Array. For example if " +
                "the list of values is [11,12,13,14,15] it will be stored at positions {1,2,3,4,5} in the array or Hash table respectively.";

        Para1.setText(Para1Text);

        String Para2Text = "Given a limited range array contains both positive and non-positive numbers, " +
                "i.e., elements are in the range from -MAX to +MAX. Our task is to search if some number " +
                "is present in the array or not in O(1) time.\n" +
                "\n" +
                "Since range is limited, we can use index mapping (or trivial hashing). We use values as the " +
                "index in a big array. Therefore we can search and insert elements in O(1) time.";

        Para2.setText(Para2Text);

        String Para3Text = "To search any element x in the array.\n" +
                "\n" +
                "1. If X is non-negative check if hash[X][0] is 1 or not. If hash[X][0] is one then the number is present else not present.\n" +
                "2. If X is negative take absolute value of X and then check if hash[X][1] is 1 or not. If hash[X][1] is one then the number is present";

        Para3.setText(Para3Text);

        String Layout1Text = "Assign all the values of the hash matrix as 0.\n" +
                "Traverse the given array:\n" +
                "    If the element ele is non negative assign \n" +
                "        hash[ele][0] as 1.\n" +
                "    Else take the absolute value of ele and \n" +
                "         assign hash[ele][1] as 1.";

        Layout1.setText(Layout1Text);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HashingContent.this,QueueContent.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HashingContent.this,LinkedListContent.class);
                startActivity(i);
            }
        });
    }
    public void initViews(){
        Para1 = findViewById(R.id.Para1);
        Para2 = findViewById(R.id.Para2);
        Para3 = findViewById(R.id.Para3);
        Layout1 = findViewById(R.id.Layout1Text);

        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
    }
}