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

public class LinkedListContent extends AppCompatActivity {

    private TextView Para1,Para2,Para3,Para4,Para5;
    private Spinner spinner,spinner2,spinner3,spinner4;
    private ImageView ChangeImage,ChangeImage1,ChangeImage2,ChangeImage3;

    private Button btnNext, btnPrev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linked_list_content);

        initView();
        String Para1Text = "A linked list is a linear data structure, in which the elements are not" +
                " stored at contiguous memory locations. The elements in a linked list are linked using " +
                "pointers as shown in the below image:";

        Para1.setText(Para1Text);

        String Para2Text = "In simple words, a linked list consists of nodes where" +
                " each node contains a data field and a reference(link) to the next node in the list.";

        Para2.setText(Para2Text);

        List<String> LanguageList = new ArrayList<>();   // List For Spinner for Changing the Language of the Implementation of LinkedList
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
                    ChangeImage.setImageResource(R.drawable.ic_linkedlistc);
                }
                else if(position == 1){     // Selecting C++
                    ChangeImage.setImageResource(R.drawable.ic_linkedcpp);
                }
                else if(position == 2){              // Selecting Java
                    ChangeImage.setImageResource(R.drawable.ic_linkedlistjava);
                }
                else if(position == 3){         // Selecting Python
                    ChangeImage.setImageResource(R.drawable.ic_linkedlistpython);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        // Above spinner end here

        // This Spinner is for inserting the Node to the head of the Linked List
//        List<String> LanguageList1 = new ArrayList<>();   // List For Spinner for Changing the Language of the Implementation of LinkedList
//        LanguageList1.add("C Language");
//        LanguageList1.add("C++ Language");
//        LanguageList1.add("Java Language");
//        LanguageList1.add("Python Language");
//
//        //  Setting All the stuffs for adapter
//        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,LanguageList1);
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner2.setAdapter(adapter1);
//
//        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            // Changes the language
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if(position == 0){    // Selecting C (Default)
//                    ChangeImage1.setVisibility(View.VISIBLE);
//                    ChangeImage1.setImageResource(R.drawable.ic_arraylogo1);
//                }
//                else if(position == 1){     // Selecting C++
//                    ChangeImage1.setImageResource(R.drawable.ic_graph);
//                }
//                else if(position == 2){              // Selecting Java
//                    ChangeImage1.setImageResource(R.drawable.ic_hashtable);
//                }
//                else if(position == 3){         // Selecting Python
//                    ChangeImage1.setImageResource(R.drawable.ic_queue);
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//        // Above Spinner ends here
//
//        // This Spinner is for inserting the Node at the tail of the Linked List
//        List<String> LanguageList2 = new ArrayList<>();
//        LanguageList2.add("C Language");
//        LanguageList2.add("C++ Language");
//        LanguageList2.add("Java Language");
//        LanguageList2.add("Python Language");
//
//        //  Setting All the stuffs for adapter
//        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,LanguageList2);
//        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner3.setAdapter(adapter2);
//
//        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            // Changes the language
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if(position == 0){    // Selecting C (Default)
//                    ChangeImage2.setVisibility(View.VISIBLE);
//                    ChangeImage2.setImageResource(R.drawable.ic_arraylogo1);
//                }
//                else if(position == 1){     // Selecting C++
//                    ChangeImage2.setImageResource(R.drawable.ic_graph);
//                }
//                else if(position == 2){              // Selecting Java
//                    ChangeImage2.setImageResource(R.drawable.ic_hashtable);
//                }
//                else if(position == 3){         // Selecting Python
//                    ChangeImage2.setImageResource(R.drawable.ic_queue);
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//        // Above Spinner ends here
//
//
//        // This Spinner is for deleting the Node in the Linked List
//        List<String> LanguageList3 = new ArrayList<>();
//        LanguageList3.add("C Language");
//        LanguageList3.add("C++ Language");
//        LanguageList3.add("Java Language");
//        LanguageList3.add("Python Language");
//
//        //  Setting All the stuffs for adapter
//        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,LanguageList3);
//        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner4.setAdapter(adapter3);
//
//        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            // Changes the language
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if(position == 0){    // Selecting C (Default)
//                    ChangeImage3.setVisibility(View.VISIBLE);
//                    ChangeImage3.setImageResource(R.drawable.ic_arraylogo1);
//                }
//                else if(position == 1){     // Selecting C++
//                    ChangeImage3.setImageResource(R.drawable.ic_graph);
//                }
//                else if(position == 2){              // Selecting Java
//                    ChangeImage3.setImageResource(R.drawable.ic_hashtable);
//                }
//                else if(position == 3){         // Selecting Python
//                    ChangeImage3.setImageResource(R.drawable.ic_queue);
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//        // Above Spinner ends here

        String Para3Text = "The new node is always added before the head of the given Linked List." +
                " And newly added node becomes the new head of the Linked List. For example if " +
                "the given Linked List is 10->15->20->25 and we add an item 5 at the front, then the" +
                " Linked List becomes 5->10->15->20->25. Let us call the function that adds at the front " +
                "of the list is push(). The push() must receive a pointer to the head pointer, because push" +
                " must change the head pointer to point to the new node";

        Para3.setText(Para3Text);

        String Para4Text = "The new node is always added after the last node of " +
                "the given Linked List. For example if the given Linked List is 5->10->15->20->25 " +
                "and we add an item 30 at the end, then the Linked List becomes 5->10->15->20->25->30. \n" +
                "Since a Linked List is typically represented by the head of it, we have to traverse the " +
                "list till end and then change the next of last node to new node.";

        Para4.setText(Para4Text);

        String Para5Text = "To delete a node from the linked list, we need to do the following steps. \n" +
                "1) Find the previous node of the node to be deleted. \n" +
                "2) Change the next of the previous node. \n" +
                "3) Free memory for the node to be deleted.";

        Para5.setText(Para5Text);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LinkedListContent.this,HashingContent.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LinkedListContent.this,StringContent.class);
                startActivity(i);
            }
        });

    }
    public void initView(){
        Para1 = findViewById(R.id.Para1);
        Para2 = findViewById(R.id.Para2);
        Para3 = findViewById(R.id.Para3);
        Para4 = findViewById(R.id.Para4);
        Para5 = findViewById(R.id.Para5);
        spinner = findViewById(R.id.spinner2);
        ChangeImage = findViewById(R.id.changeImage);
//        spinner2 = findViewById(R.id.spinner3);
//        ChangeImage1 = findViewById(R.id.changeImage1);
//        spinner3 = findViewById(R.id.spinner4);
//        ChangeImage2 = findViewById(R.id.changeImage2);
//        spinner4 = findViewById(R.id.spinner5);
//        ChangeImage3 = findViewById(R.id.changeImage3);

        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
    }
}