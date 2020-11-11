package com.example.Algorithmic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dsaapp.R;

import java.sql.ParameterMetaData;
import java.sql.Time;

public class TimeComplexityMain extends AppCompatActivity {

    private TextView TimeHead, WhatIsTimeC ,SubHead1, Para1, Example1,Example2,Example3,Example4,Example5,Example6,Example7,
            Para2, Para2_1,Para3,Para4,Para5,Para6,Para7,Para8,Para9;

    private Button btnNext, btnPrev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_complexity_main);

        initViews();
        String Headtext = "1. Time Complexity";        // Set the Main heading of Time Complexity
        TimeHead.setText(Headtext);

//        String SubHead1Text = "Time Complexity";   // Set first sub heading in the time complexity activity
//        SubHead1.setText(SubHead1Text);

        // Set the content for the first paragraph
        String Para1Text = "For any defined problem, there can be N number of solution. This is true in general." +
                " If I have a problem and I discuss about the problem with all of my friends, they will all suggest me " +
                "different solutions. And I am the one who has to decide which solution is the best based on the circumstances.\n" +
                "\n" +
                "Similarly for any problem which must be solved using a program, there can be infinite number of solutions." +
                " Let's take a simple example to understand this. Below we have two different algorithms to find square of a" +
                " number(for some time, forget that square of any number n is n*n):\n" +
                "\n" +
                "One solution to this problem can be, running a loop for n times, starting with the number n and adding n to it, every time.";
        Para1.setText(Para1Text);

        String Para2Text = "Or, we can simply use a mathematical operator * to find the square.";
        Para2.setText(Para2Text);

        String Para2_1Text = "In the above two simple algorithms, you saw how a single problem can have many solutions." +
                " While the first solution required a loop which will execute for n number of times, the second solution " +
                "used a mathematical operator * to return the result in one line. So which one is the better approach," +
                " of course the second one.";

        Para2_1.setText(Para2_1Text);


        String WhatIsTimeText = "Time complexity of an algorithm signifies the total time required by the program to run till " +
                "its completion.\n" +
                "\n" +
                "The time complexity of algorithms is most commonly expressed using the big O notation. It's an asymptotic notation " +
                "to represent the time complexity. We will study about it in detail in the next tutorial.\n" +
                "\n" +
                "Time Complexity is most commonly estimated by counting the number of elementary steps performed by any algorithm " +
                "to finish execution. Like in the example above, for the first code the loop will run n number of times, so the time complexity will be n atleast and as the value of n will increase the time taken will also increase. While for the second code, time complexity is constant, because it will never be dependent on the value of n, it will always give the result in 1 step.\n" +
                "\n" +
                "And since the algorithm's performance may vary with different types of input data, hence for an algorithm we usually" +
                " use the worst-case Time complexity of an algorithm because that is the maximum time taken for any input size.";

        WhatIsTimeC.setText(WhatIsTimeText);

        String Para3Text = "Now lets tap onto the next big topic related to Time complexity," +
                " which is How to Calculate Time Complexity. It becomes very confusing some times," +
                "but we will try to explain it in the simplest way.\n" +
                "\n" +
                "Now the most common metric for calculating time complexity is Big O notation. " +
                "This removes all constant factors so that the running time can be estimated in relation to N, " +
                "as N approaches infinity. In general you can think of it like this";

        Para3.setText(Para3Text);

        String Para4Text = "Above we have a single statement. Its Time Complexity will be Constant." +
                " The running time of the statement will not change in relation to N.";

        Para4.setText(Para4Text);

        String Para5Text = "The time complexity for the above algorithm will be Linear. " +
                "The running time of the loop is directly proportional to N. When N doubles, so does the running time.";

        Para5.setText(Para5Text);

        String Para6Text = "This time, the time complexity for the above code will be Quadratic." +
                " The running time of the two loops is proportional to the square of N. When N doubles," +
                " the running time increases by N * N.";

        Para6.setText(Para6Text);

        String Para7Text = "Now we will discuss and understand the various notations used for Time Complexity.\n" +
                "1. Big Oh denotes \"fewer than or the same as\" <expression> iterations.\n" +
                "2. Big Omega denotes \"more than or the same as\" <expression> iterations.\n" +
                "3. Big Theta denotes \"the same as\" <expression> iterations.\n" +
                "4. Little Oh denotes \"fewer than\" <expression> iterations.\n" +
                "5. Little Omega denotes \"more than\" <expression> iterations.";

        Para7.setText(Para7Text);

        String Para8Text = "O(expression) is the set of functions that grow slower than or at the same rate as expression." +
                " It indicates the maximum required by an algorithm for all input values. It represents the worst case of an algorithm's " +
                "time complexity.\n" +
                "\n" +
                "Omega(expression) is the set of functions that grow faster than or at the same rate as expression. It indicates " +
                "the minimum time required by an algorithm for all input values. It represents the best case of an algorithm's" +
                " time complexity.\n" +
                "\n" +
                "Theta(expression) consist of all the functions that lie in both O(expression) and Omega(expression). " +
                "It indicates the average bound of an algorithm. It represents the average case of an algorithm's time complexity.\n" +
                "\n" +
                "Suppose you've calculated that an algorithm takes f(n) operations, where,";

        Para8.setText(Para8Text);

        String Para9Text = "Since this polynomial grows at the same rate as n2, then you could say " +
                "that the function f lies in the set Theta(n2). (It also lies in the sets O(n2) and Omega(n2) " +
                "for the same reason.)\n" +
                "\n" +
                "The simplest explanation is, because Theta denotes the same as the expression. Hence, as f(n)" +
                " grows by a factor of n2, the time complexity can be best represented as Theta(n2).";

        Para9.setText(Para9Text);


        String Example1Text = "/* \n" +
                "    we have to calculate the square of n\n" +
                "*/\n\n" +
                "for i=1 to n\n" +
                "    do n = n + n\n\n" +
                "// when the loop ends n will hold its square\n" +
                "return n";

        Example1.setText(Example1Text);

        String Example2Text = "/* \n" +
                "    we have to calculate the square of n\n" +
                "*/\n" +
                "return n*n";
        Example2.setText(Example2Text);

        String Example3Text = "statement";
        Example3.setText(Example3Text);

        String Example4Text = "for(i=0; i < N; i++)\n" +
                "{\n" +
                "    statement;\n" +
                "}";
        Example4.setText(Example4Text);

        String Example5Text = "for(i=0; i < N; i++) \n" +
                "{\n" +
                "    for(j=0; j < N;j++)\n" +
                "    { \n" +
                "    statement;\n" +
                "    }\n" +
                "}";

        Example5.setText(Example5Text);

        String Example6Text = "while(low <= high) \n" +
                "{\n" +
                "    mid = (low + high) / 2;\n" +
                "    if (target < list[mid])\n" +
                "        high = mid - 1;\n" +
                "    else if (target > list[mid])\n" +
                "        low = mid + 1;\n" +
                "    else break;\n" +
                "}";

        Example6.setText(Example6Text);

        String Example7Text = "f(n) = 3*n^2 + 2*n + 4.   // n^2 means square of n";
        Example7.setText(Example7Text);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TimeComplexityMain.this,DataStrcutureContent.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TimeComplexityMain.this,SpaceContent.class);
                startActivity(i);
            }
        });

    }

    public void initViews(){
        TimeHead = findViewById(R.id.TimeHead);
        SubHead1 = findViewById(R.id.SubHead1);
        Para1 = findViewById(R.id.Para1);
        Example1 = findViewById(R.id.example1);
        Example2 = findViewById(R.id.example2);
        Example3 = findViewById(R.id.example3);
        Example4 = findViewById(R.id.example4);
        Example5 = findViewById(R.id.example5);
        Example6 = findViewById(R.id.example6);
        Example7 = findViewById(R.id.example7);
        Para2 = findViewById(R.id.Para2);
        WhatIsTimeC = findViewById(R.id.WhatIsTime);
        Para2_1 = findViewById(R.id.Para2_1);
        Para3 = findViewById(R.id.Para3);
        Para4 = findViewById(R.id.Para4);
        Para5 = findViewById(R.id.Para5);
        Para6 = findViewById(R.id.Para6);
        Para7 = findViewById(R.id.Para7);
        Para8 = findViewById(R.id.Para8);
        Para9 = findViewById(R.id.Para9);

        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
    }
}