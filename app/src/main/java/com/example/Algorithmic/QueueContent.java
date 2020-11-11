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

public class QueueContent extends AppCompatActivity {
    private TextView Para1, Para2, Para3;
    private Spinner spinner;
    private ImageView ChangeImage;

    private Button btnNext, btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_content);

        initViews();

        String Para1Text = "A Queue is a linear structure which follows a particular order " +
                "in which the operations are performed. The order is First In First Out (FIFO)." +
                " A good example of a queue is any queue of consumers for a resource where the consumer" +
                " that came first is served first. The difference between stacks and queues is in removing." +
                " In a stack we remove the item the most recently added; in a queue, we remove the item the " +
                "least recently added.";

        Para1.setText(Para1Text);

        String Para2text = "Queues maintain two data pointers, front and rear. Therefore, its operations are comparatively difficult " +
                "to implement than that of stacks.\n" +
                "\n" +
                "The following steps should be taken to enqueue (insert) data into a queue −\n" +
                "\n" +
                "Step 1 − Check if the queue is full.\n" +
                "\n" +
                "Step 2 − If the queue is full, produce overflow error and exit.\n" +
                "\n" +
                "Step 3 − If the queue is not full, increment rear pointer to point the next empty space.\n" +
                "\n" +
                "Step 4 − Add data element to the queue location, where the rear is pointing.\n" +
                "\n" +
                "Step 5 − return success.";

        Para2.setText(Para2text);

        String Para3Text = "Accessing data from the queue is a process of two tasks − access the data where " +
                "front is pointing and remove the data after access. The following steps are taken to perform dequeue operation −\n" +
                "\n" +
                "Step 1 − Check if the queue is empty.\n" +
                "\n" +
                "Step 2 − If the queue is empty, produce underflow error and exit.\n" +
                "\n" +
                "Step 3 − If the queue is not empty, access the data where front is pointing.\n" +
                "\n" +
                "Step 4 − Increment front pointer to point to the next available data element.\n" +
                "\n" +
                "Step 5 − Return success.";

        Para3.setText(Para3Text);


        List<String> LanguageList = new ArrayList<>();   // List For Spinner for Changing the Language of the Implementation of Queue
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
                    ChangeImage.setImageResource(R.drawable.ic_queuec);
                }
                else if(position == 1){     // Selecting C++
                    ChangeImage.setImageResource(R.drawable.ic_queuecpp);
                }
                else if(position == 2){              // Selecting Java
                    ChangeImage.setImageResource(R.drawable.ic_queuejava);
                }
                else if(position == 3){         // Selecting Python
                    ChangeImage.setImageResource(R.drawable.ic_queuepython);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QueueContent.this,StackContent.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QueueContent.this,HashingContent.class);
                startActivity(i);
            }
        });
    }


    public void initViews(){
        Para1 = findViewById(R.id.Para1);
        Para2 = findViewById(R.id.Para2);
        Para3 = findViewById(R.id.Para3);
        spinner = findViewById(R.id.spinner2);
        ChangeImage = findViewById(R.id.changeImage);

        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
    }
}