package com.example.Algorithmic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dsaapp.R;

public class DataStrcutureContent extends AppCompatActivity {

    private TextView Para1,Para2,Para3,Para4;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_strcuture_content);

        initViews();

        String Para1Text = "A computer program is a collection of instructions to perform a specific task. " +
                "For this, a computer program may need to store data, retrieve data, and perform computations on the data.";

        Para1.setText(Para1Text);

        String Para2Text = "A data structure is a named location that can be used to store and" +
                " organize data. And, an algorithm is a collection of steps to solve a particular problem. " +
                "Learning data structures and algorithms allow us to write efficient and optimized computer programs.";

        Para2.setText(Para2Text);

        String Para3Text = "Data structures, as the name implies, are organizational configurations " +
                "of data in Information Technology. Data is stored in computers and via the Cloud on" +
                " RAM or dispersed storage systems, and either way, the data is meant to eventually be " +
                "accessed (that’s the entire point of storing it in the first place). Unfortunately," +
                " computers have to process extremely high quantities of data on a daily basis, so that information " +
                "can rapidly be jumbled or lost.\n" +
                "\n" +
                "Cue data structures. These conformations place data into predictable sequences, locations, " +
                "and arrangements. This way, the information can quickly be withdrawn because it is placed in" +
                " a retrievable location. Without this structure in place, information would be practically " +
                "lost to the ether for all time. Fortunately, we are able to create very functional structures" +
                " that allow easy access to all of our data.";

        Para3.setText(Para3Text);

        String Para4Text = "Obviously, algorithmic knowledge has a very limited correlation with the ability " +
                "to solve everyday programming tasks. In every company. You can be a brilliant developer " +
                "and know nothing about dynamic programming. Or you can easily solve these dynamic programming " +
                "questions (especially if you are into competitive programming) and still don't be able to bring " +
                "value to a company.\n\n" +"If you are hiring a specific candidate to a specific team it would be much" +
                " better to ask the questions that are important for your team. If you need to know algorithms" +
                " - ask about algorithms, if deep knowledge of some particular technology is required - ask about it and so on.\n" +
                "\n" +
                "But don't big tech companies know about it? Of course they do. But there is another thing here." +
                " Not only there are a lot of candidates for each position, but there are also a lot of teams" +
                " inside the company who want to have this successful candidate. Say about ten. And neither a " +
                "company, nor a candidate wants to have ten interviews with each of the teams.\n\n"+" So a company" +
                " decides to have \"interview as a service\", a candidate has a limited amount of interviews " +
                "and all the candidate teams can see the results afterwards. It works but now you can't ask " +
                "team-specific questions, because there are a lot of teams, so you ask something very generic. " +
                "Yes, algorithms, data structures, basic troubleshooting, and systems design. It isn't that " +
                "good as a team-specific approach but scales much better. And another benefit is a standardized " +
                "approach to hiring in every team (you don't want to have a situation when one team has much " +
                "stricter hiring standards than another).";

        Para4.setText(Para4Text);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DataStrcutureContent.this,TimeComplexityMain.class);
                startActivity(i);
            }
        });

    }
    public void initViews(){
        Para1 = findViewById(R.id.Para1);
        Para2 = findViewById(R.id.Para2);
        Para3 = findViewById(R.id.Para3);
        Para4 = findViewById(R.id.Para4);
        btnNext = findViewById(R.id.btnNext);
    }
}