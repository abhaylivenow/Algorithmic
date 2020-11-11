package com.example.Algorithmic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dsaapp.R;

public class content_activity extends AppCompatActivity implements View.OnClickListener {

    private CardView TimeCardView,SpaceCardView,ArrayCardView,StacksCardView,QueueCardView,LinkedListCardView,TreeCardView,
    GraphCardView,StringCardView,HashTableCardView,DataStructureCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_activity);

        initViews();    // Initialize all the views

        TimeCardView.setOnClickListener(this);
        ArrayCardView.setOnClickListener(this);
        StacksCardView.setOnClickListener(this);
        QueueCardView.setOnClickListener(this);
        LinkedListCardView.setOnClickListener(this);
        TreeCardView.setOnClickListener(this);
        GraphCardView.setOnClickListener(this);
        SpaceCardView.setOnClickListener(this);
        StringCardView.setOnClickListener(this);
        HashTableCardView.setOnClickListener(this);
        DataStructureCardView.setOnClickListener(this);
    }
    public void initViews(){
        TimeCardView = (CardView) findViewById(R.id.TimeCardView);
        ArrayCardView = (CardView) findViewById(R.id.ArrayCardView);
        StacksCardView = (CardView) findViewById(R.id.StacksCardView);
        QueueCardView = (CardView) findViewById(R.id.QueuesCardView);
        LinkedListCardView = (CardView) findViewById(R.id.LinkedListCardView);
        TreeCardView = (CardView) findViewById(R.id.TreeCardView);
        GraphCardView = (CardView) findViewById(R.id.GraphCardView);
        SpaceCardView = (CardView) findViewById(R.id.SpaceCardView);
        StringCardView = (CardView) findViewById(R.id.StringCardView);
        HashTableCardView = (CardView) findViewById(R.id.HashTableCardView);
        DataStructureCardView = (CardView) findViewById(R.id.DataStructureCardView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.TimeCardView:
                GoToTimeContent();
                break;
            case R.id.ArrayCardView:
                GoToArrayContent();
                break;
            case R.id.StacksCardView:
                GotoStacksContent();
                break;
            case R.id.QueuesCardView:
                GoToQueueContent();
                break;
            case R.id.LinkedListCardView:
                GoToLinkedListContent();
                break;
            case R.id.TreeCardView:
                GoToTreeContent();
                break;
            case R.id.GraphCardView:
                GoToGraphContent();
                break;
            case R.id.SpaceCardView:
                GoToSpaceContent();
                break;
            case R.id.StringCardView:
                GoToStringContent();
                break;
            case R.id.HashTableCardView:
                GoToHashContent();
                break;
            case R.id.DataStructureCardView:
                GoToDataStructureContent();
                break;
        }
    }
    public void GoToTimeContent(){
        Intent intent = new Intent(content_activity.this,TimeComplexityMain.class);
        startActivity(intent);
    }
    public void GoToArrayContent(){
        Intent intent = new Intent(content_activity.this,ArrayContent.class);
        startActivity(intent);
    }
    public void GotoStacksContent(){
        Intent i = new Intent(content_activity.this,StackContent.class);
        startActivity(i);
    }
    public void GoToQueueContent(){
        Intent i = new Intent(content_activity.this,QueueContent.class);
        startActivity(i);
    }
    public void GoToLinkedListContent(){
        Intent i = new Intent(content_activity.this,LinkedListContent.class);
        startActivity(i);
    }
    public void GoToTreeContent(){
        Intent i = new Intent(content_activity.this,TreeContent.class);
        startActivity(i);
    }
    public void GoToGraphContent(){
        Intent i = new Intent(content_activity.this,GraphContent.class);
        startActivity(i);
    }
    public void GoToSpaceContent(){
        Intent i = new Intent(content_activity.this,SpaceContent.class);
        startActivity(i);
    }
    public void GoToStringContent(){
        Intent i = new Intent(content_activity.this,StringContent.class);
        startActivity(i);
    }
    public void GoToHashContent(){
        Intent i = new Intent(content_activity.this,HashingContent.class);
        startActivity(i);
    }
    public void GoToDataStructureContent(){
        Intent i = new Intent(content_activity.this,DataStrcutureContent.class);
        startActivity(i);
    }
}