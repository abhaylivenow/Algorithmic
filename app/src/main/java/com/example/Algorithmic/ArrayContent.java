package com.example.Algorithmic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dsaapp.R;

public class ArrayContent extends AppCompatActivity {

    private TextView HeadText,Para0,SubHead1,Para1,Para2,Para3,Para4,Para5,Para6,
            Para1_2D,Para2_2D,Para3_2D,Layout1text,Layout2text,Layout3text,Layout4text,Layout5text;
    private Button btnNext, btnPrev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_content);

        initView();

        String HeadTextText = "3. Arrays";   // Set the head of the
        HeadText.setText(HeadTextText);

        String Para0Text = "Arrays are of two types 1 dimensional and 2 dimensional";
        Para0.setText(Para0Text);

        String SubHead1text = "What is an 1D Array?";   // Set The 1st SubHeading of Array
        SubHead1.setText(SubHead1text);

        String Para1Text = "An array is a collection of items stored at contiguous memory locations. " +   // Set the 1st para
                "The idea is to store multiple items of the same type together. This makes it easier to " +
                "calculate the position of each element by simply adding an offset to a base value, i.e.," +
                " the memory location of the first element of the array (generally denoted by the name of the array)." +
                " The base value is index 0 and the difference between the two indexes is the offset.\n\n"+
                "For simplicity, we can think of an array a fleet of stairs where on each step is placed a value (let’s say " +
                "one of your friends). Here, you can identify the location of any of your friends by simply knowing the count of" +
                " the step they are on. \n" +
                "Remember: “Location of next index depends on the data type we use”. ";

        Para1.setText(Para1Text);

        String Para2text = "The above image can be looked at as a top-level view of a staircase " +
                "where you are at the base of the staircase. Each element can be uniquely identified " +
                "by their index in the array (in a similar way as you could identify your friends by" +
                " the step on which they were on in the above example). ";
        Para2.setText(Para2text);

        String Para3text = "In C language array has the fixed size meaning one’s size is given to it. " +
                "It can’t change i.e. can’t shrink it, can’t expand it. The reason was that for" +
                " expanding if we change the size we can’t be sure ( it’s not possible every time)" +
                " that we get the next memory location to us as free. The shrinking will not work " +
                "because array, when declared, it gets memory statically, and thus compiler is the only one to destroy it.";

        Para3.setText(Para3text);

        String Para4Text = "1. 0 (zero-based indexing): The first element of the array is indexed by subscript of 0\n\n"+
                           "2. 1 (one-based indexing): The second element of the array is indexed by subscript of 1\n\n"+
                "3. n (n-based indexing): The base index of an array can be freely chosen. Usually programming languages" +
                " allowing n-based indexing also allow negative index values and other scalar data types like enumerations" +
                ", or characters may be used as an array index.\n";
        Para4.setText(Para4Text);

        String Para5Text = "1. Arrays allow random access of elements. This makes accessing elements by position faster.\n\n"+
                "2. Arrays allocate memory in contiguous memory locations for all its elements. Hence there is no" +
                " chance of extra memory being allocated in case of arrays. This avoids memory overflow or shortage " +
                "of memory in arrays.";
        Para5.setText(Para5Text);

        String Para6Text = "1. The number of elements to be stored in an array should be known in advance.\n\n"+
                "2. An array is a static structure (which means the array is of fixed size). " +
                "Once declared the size of the array cannot be modified. The memory which is allocated " +
                "to it cannot be increased or decreased.\n\n"+
                "3. Insertion and deletion are quite difficult in an array as the elements are " +
                "stored in consecutive memory locations and the shifting operation is costly.\n\n"+
                "4. Allocating more memory than the requirement leads to wastage of memory space and less " +
                "allocation of memory also leads to a problem.";

        Para6.setText(Para6Text);

        String Para1_2DText = "we can define multidimensional arrays in simple words as array" +
                " of arrays. Data in multidimensional arrays are stored in tabular form (in row major order).";

        Para1_2D.setText(Para1_2DText);

        String Para2_2DText = "Total number of elements that can be stored in a multidimensional array can be calculated by multiplying the size of all the dimensions.\n" +
                "For example:\n\n" +
                "The array int x[10][20] can store total (10*20) = 200 elements.\n\n";
        Para2_2D.setText(Para2_2DText);

        String Para3_2DText = "Two – dimensional array is the simplest form of a multidimensional array." +
                " We can see a two – dimensional array as an array of one – dimensional array for easier understanding.\n\n"+
                "Elements in two-dimensional arrays are commonly referred by x[i][j] where i is the row number and ‘j’ is the column number.\n\n" +
                "A two – dimensional array can be seen as a table with ‘x’ rows and ‘y’ columns where " +
                "the row number ranges from 0 to (x-1) and column number ranges from 0 to (y-1). A two – dimensional array " +
                "‘x’ with 3 rows and 3 columns is shown below:";

        Para3_2D.setText(Para3_2DText);

        String Layout1 = "Array declaration by Specific Size : \n\n"+     // Text for layout 1
                          "int arr1[10]     // Array of size 10 \n\n"+
                         "Array declaration by initializing elements \n\n"+
                          "int arr[] = { 10, 20, 30, 40 } ";
        Layout1text.setText(Layout1);

        String Layout2 = "Array declaration by Specific Size : \n\n"+
                         "int[] arr = new int[10]    // Array of size 10 \n\n"+
                         "Array declaration by initializing elements \n\n"+
                         "int arr[] = {10 , 20 , 30 , 40}";
        Layout2text.setText(Layout2);

        String Layout3 = "import array as arr \n\n"+
                "a = arr.array('i', [1, 2, 3])      // a is Array , i is datatype";
        Layout3text.setText(Layout3);

        String Layout4Text = "int x[10][20];";
        Layout4text.setText(Layout4Text);

        String Layout5Text = "int x[3][4] = {{0,1,2,3}, {4,5,6,7}, {8,9,10,11}};";

        Layout5text.setText(Layout5Text);


        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ArrayContent.this,SpaceContent.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ArrayContent.this,StackContent.class);
                startActivity(i);
            }
        });


    }
    public void initView(){
        HeadText = findViewById(R.id.Headtext);
        SubHead1 = findViewById(R.id.SubHead1);
        Para0 = findViewById(R.id.Para0);
        Para1 = findViewById(R.id.Para1);
        Para2 = findViewById(R.id.Para2);
        Para3 = findViewById(R.id.Para3Text);
        Para4 = findViewById(R.id.Para4Text);
        Para5 = findViewById(R.id.Para5Text);
        Para6 = findViewById(R.id.Para6Text);
        Para1_2D = findViewById(R.id.Para1_2D);
        Para2_2D = findViewById(R.id.Para2_2D);
        Para3_2D = findViewById(R.id.Para3_2D);
        Layout1text = findViewById(R.id.Layout1Text);
        Layout2text = findViewById(R.id.Layout2Text);
        Layout3text = findViewById(R.id.Layout3Text);
        Layout4text = findViewById(R.id.Layout4Text);
        Layout5text = findViewById(R.id.Layout5Text);

        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
    }
}