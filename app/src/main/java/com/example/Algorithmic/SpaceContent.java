package com.example.Algorithmic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dsaapp.R;

public class SpaceContent extends AppCompatActivity {

    private TextView Para1,Para2,Para3,Para4,Para5,Example1,Example2;

    private Button btnNext, btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_content);

        initViews();

        String Para1Text = "Whenever a solution to a problem is written some memory is required to complete." +
                " For any algorithm memory may be used for the following:\n" +
                "\n" +
                "1. Variables (This include the constant values, temporary values)\n" +
                "2. Program Instruction\n" +
                "3. Execution\n\n" +
                "Space complexity is the amount of memory used by the algorithm (including the input values to the algorithm) to execute and produce the result.\n" +
                "Sometime Auxiliary Space is confused with Space Complexity. But Auxiliary Space is the extra space or the temporary space used by the algorithm during it's execution.\n" +
                "\n" +
                "Space Complexity = Auxiliary Space + Input space";

        Para1.setText(Para1Text);

        String Para2Text = "While executing, algorithm uses memory space for three reasons:\n" +
                "\n" +
                "1. Instruction Space :\n\n" +
                "It's the amount of memory used to save the compiled version of instructions.\n" +
                "\n" +
                "2. Environmental Stack\n\n" +
                "Sometimes an algorithm(function) may be called inside another algorithm(function). In such a" +
                " situation, the current variables are pushed onto the system stack, where they wait for further" +
                " execution and then the call to the inside algorithm(function) is made.\n" +
                "\n" +
                "For example, If a function A() calls function B() inside it, then all th variables of the function A()" +
                " will get stored on the system stack temporarily, while the function B() is called and executed inside the function A().\n" +
                "\n" +
                "3. Data Space\n\n" +
                "Amount of space used by the variables and constants.\n" +
                "\n" +
                "But while calculating the Space Complexity of any algorithm, we usually consider only Data Space and" +
                " we neglect the Instruction Space and Environmental Stack.";

        Para2.setText(Para2Text);

        String Para3Text = "For calculating the space complexity, we need to know the value of memory " +
                "used by different type of datatype variables, which generally varies for different operating systems, " +
                "but the method for calculating the space complexity remains the same.\n\n"+
                "Now let's learn how to compute space complexity by taking a few examples:";

        Para3.setText(Para3Text);

        String Para4Text = "In the above expression, variables a, b, c and z are all integer types," +
                " hence they will take up 4 bytes each, so total memory requirement will be (4(4) + 4) = 20 bytes," +
                " this additional 4 bytes is for return value. And because this space requirement is fixed for the above example, " +
                "hence it is called Constant Space Complexity.\n" +
                "\n" +
                "Let's have another example, this time a bit complex one,";
        Para4.setText(Para4Text);

        String Para5Text = "In the above code, 4*n bytes of space is required for the array a[] elements.\n" +
                "4 bytes each for x, n, i and the return value.\n" +
                "Hence the total memory requirement will be (4n + 12), which is increasing linearly with the increase " +
                "in the input value n, hence it is called as Linear Space Complexity.\n" +
                "\n" +
                "Similarly, we can have quadratic and other complex space complexity as well, as the complexity of an algorithm increases.\n" +
                "\n" +
                "But we should always focus on writing algorithm code in such a way that we keep the space complexity minimum.";

        Para5.setText(Para5Text);

        String Example1Text = "{\n" +
                "    int z = a + b + c;\n" +
                "    return(z);\n" +
                "}";

        Example1.setText(Example1Text);

        String Example2Text = "// n is the length of array a[]\n" +
                "int sum(int a[], int n)\n" +
                "{\n" +
                "\tint x = 0;\t\t// 4 bytes for x\n" +
                "\tfor(int i = 0; i < n; i++)\t// 4 bytes for i\n" +
                "\t{\t\n" +
                "\t    x  = x + a[i];\t\t\n" +
                "\t}\n" +
                "\treturn(x);\n" +
                "}";

        Example2.setText(Example2Text);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SpaceContent.this,TimeComplexityMain.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SpaceContent.this,ArrayContent.class);
                startActivity(i);
            }
        });
    }

    public void initViews(){
        Para1 = findViewById(R.id.Para1);
        Para2 = findViewById(R.id.Para2);
        Para3 = findViewById(R.id.Para3);
        Para4 = findViewById(R.id.Para4);
        Para5 = findViewById(R.id.Para5);
        Example1 = findViewById(R.id.example1);
        Example2 = findViewById(R.id.example2);

        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
    }
}