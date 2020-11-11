package com.example.Algorithmic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.dsaapp.R;

import java.util.ArrayList;
import java.util.List;

public class StackContent extends AppCompatActivity {

    private TextView Para1,Para2,PushDetail,PopDetail;
    private Spinner spinner;
    private ImageView ChangeImage;
    private Button btnNext, btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_content);

        initView();

        String Para1Text = "Stack is a linear data structure which follows a particular order " +
                "in which the operations are performed. The order may be LIFO(Last In First Out) " +
                "or FILO(First In Last Out).";

        Para1.setText(Para1Text);

        String Para2Text = "There are many real-life examples of a stack. Consider an example " +
                "of plates stacked over one another in the canteen. The plate which is at the top " +
                "is the first one to be removed, i.e. the plate which has been placed at the bottommost" +
                " position remains in the stack for the longest period of time. So, it can be simply seen " +
                "to follow LIFO(Last In First Out)/FILO(First In Last Out) order.";

        Para2.setText(Para2Text);

        String PushText = "The process of putting a new data element onto stack is known as a Push Operation." +
                " Push operation involves a series of steps − \n\n" +
                "Step 1 − Checks if the stack is full.\n" +
                "\n" +
                "Step 2 − If the stack is full, produces an error and exit.\n" +
                "\n" +
                "Step 3 − If the stack is not full, increments top to point next empty space.\n" +
                "\n" +
                "Step 4 − Adds data element to the stack location, where top is pointing.\n" +
                "\n" +
                "Step 5 − Returns success.";

        PushDetail.setText(PushText);

        String PopText = "Accessing the content while removing it from the stack, is known as a Pop Operation." +
                " In an array implementation of pop() operation, the data element is not actually removed," +
                " instead top is decremented to a lower position in the stack to point to the next value. But" +
                " in linked-list implementation, pop() actually removes data element and deallocates memory space.\n" +
                "\n" +
                "A Pop operation may involve the following steps −\n" +
                "\n" +
                "Step 1 − Checks if the stack is empty.\n" +
                "\n" +
                "Step 2 − If the stack is empty, produces an error and exit.\n" +
                "\n" +
                "Step 3 − If the stack is not empty, accesses the data element at which top is pointing.\n" +
                "\n" +
                "Step 4 − Decreases the value of top by 1.\n" +
                "\n" +
                "Step 5 − Returns success.";

        PopDetail.setText(PopText);

        List<String> LanguageList = new ArrayList<>();   // List For Spinner for Changing the Language of the Implementation of Stack
        LanguageList.add("C Language");
        LanguageList.add("C++ Language");
        LanguageList.add("Java Language");
        LanguageList.add("Python Language");

        //  Setting All the stuffs for adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,LanguageList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            // Changes the language
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){    // Selecting C (Default)
                    ChangeImage.setVisibility(View.VISIBLE);
                    ChangeImage.setImageResource(R.drawable.ic_stackc);
                }
                else if(position == 1){     // Selecting C++
                    ChangeImage.setImageResource(R.drawable.ic_stackcpp);
                }
                else if(position == 2){              // Selecting Java
                    ChangeImage.setImageResource(R.drawable.ic_stackjava);
                }
                else if(position == 3){         // Selecting Python
                    ChangeImage.setImageResource(R.drawable.ic_stackpython);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StackContent.this,ArrayContent.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StackContent.this,QueueContent.class);
                startActivity(i);
            }
        });
    }


    public void initView(){
        Para1 = findViewById(R.id.Para1);
        Para2 = findViewById(R.id.Para2);
        PushDetail = findViewById(R.id.PushDetail);
        PopDetail = findViewById(R.id.PopDetail);
        spinner = (Spinner) findViewById(R.id.spinner);
        ChangeImage = findViewById(R.id.changeImage);

        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
    }


}