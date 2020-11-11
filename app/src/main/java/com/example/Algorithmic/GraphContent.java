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

public class GraphContent extends AppCompatActivity {

    private TextView Para1,Para2,Para3,Para4,Para5,Para6,Para7,Para8,Layout1,Layout2;
    private Spinner Spinner,Spinner1,Spinner2;
    private ImageView ChangeImage,ChangeImage1,ChangeImage2;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_content);

        initViews();

        String Para1Text = "A graph is a pictorial representation of a set of objects where some " +
                "pairs of objects are connected by links. The interconnected objects are represented by" +
                " points termed as vertices, and the links that connect the vertices are called edges.\n" +
                "\n" +
                "Formally, a graph is a pair of sets (V, E), where V is the set of vertices and E is the set" +
                " of edges, connecting the pairs of vertices. Take a look at the following graph −";

        Para1.setText(Para1Text);

        String Para2Text = "In the above graph,\n" +
                "\n" +
                "V = {a, b, c, d, e}\n" +
                "\n" +
                "E = {ab, ac, bd, cd, de}";

        Para2.setText(Para2Text);

        String Para3Text = "A graph is a data structure that consists of the following two components:\n" +
                "1. A finite set of vertices also called as nodes.\n" +
                "2. A finite set of ordered pair of the form (u, v) called as edge. The pair is ordered because " +
                "(u, v) is not the same as (v, u) in case of a directed graph(di-graph). The pair of the form (u, v) " +
                "indicates that there is an edge from vertex u to vertex v. The edges may contain weight/value/cost.\n\n" +
                "Following is an example of an undirected graph with 5 vertices.";

        Para3.setText(Para3Text);

        String Para4Text = "The following two are the most commonly used representations of a graph.\n" +
                "1. Adjacency Matrix\n" +
                "2. Adjacency List";

        Para4.setText(Para4Text);

        String Para5Text = "Adjacency Matrix is a 2D array of size V x V where V is the number of vertices in a graph." +
                " Let the 2D array be adj[][], a slot adj[i][j] = 1 indicates that there is an edge from vertex i to vertex j." +
                " Adjacency matrix for undirected graph is always symmetric. Adjacency Matrix is also used to represent weighted graphs. " +
                "If adj[i][j] = w, then there is an edge from vertex i to vertex j with weight w.\n\n"+
                "The adjacency matrix for the above example graph is:";

        Para5.setText(Para5Text);

        String Para6Text = "An array of lists is used. The size of the array is equal " +
                "to the number of vertices. Let the array be an array[]. An entry array[i] " +
                "represents the list of vertices adjacent to the ith vertex. This representation " +
                "can also be used to represent a weighted graph. The weights of edges can be represented" +
                " as lists of pairs. Following is the adjacency list representation of the above graph.";

        Para6.setText(Para6Text);

        List<String> LanguageList = new ArrayList<>();   // List For Spinner for Changing the Language of the Implementation Graph
        LanguageList.add("C++ Language");
        LanguageList.add("Java Language");
        LanguageList.add("Python Language");

        //  Setting All the stuffs for adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,LanguageList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner.setAdapter(adapter);

        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            // Changes the language
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){    // Selecting C++ (Default)
                    ChangeImage.setVisibility(View.VISIBLE);
                    ChangeImage.setImageResource(R.drawable.ic_graphcpp);
                }
                else if(position == 1){     // Selecting Java
                    ChangeImage.setImageResource(R.drawable.ic_graphjava);
                }
                else if(position == 2){              // Selecting Python
                    ChangeImage.setImageResource(R.drawable.ic_graphpython);
                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String Para7Text = "The Breadth First Search (BFS) traversal is an algorithm, which is used to " +
                "visit all of the nodes of a given graph. In this traversal algorithm one node is selected " +
                "and then all of the adjacent nodes are visited one by one. After completing all of the adjacent vertices, " +
                "it moves further to check another vertices and checks its adjacent vertices again.";

        Para7.setText(Para7Text);


        String Para8Text = "The Depth First Search (DFS) is a graph traversal algorithm. In this algorithm one " +
                "starting vertex is given, and when an adjacent vertex is found, it moves to that adjacent vertex " +
                "first and try to traverse in the same manner.";

        Para8.setText(Para8Text);

        String Layout1Text = " DFS-iterative (G, s):           //Where G is graph and s is source vertex\n" +
                "      let S be stack\n" +
                "      S.push( s )            //Inserting s in stack \n" +
                "      mark s as visited.\n" +
                "      while ( S is not empty):\n" +
                "          //Pop a vertex from stack to visit next\n" +
                "          v  =  S.top( )\n" +
                "         S.pop( )\n" +
                "         //Push all the neighbours of v in stack that are not visited   \n" +
                "        for all neighbours w of v in Graph G:\n" +
                "            if w is not visited :\n" +
                "                     S.push( w )         \n" +
                "                    mark w as visited\n" +
                "\n" +
                "\n" +
                "    DFS-recursive(G, s):\n" +
                "        mark s as visited\n" +
                "        for all neighbours w of s in Graph G:\n" +
                "            if w is not visited:\n" +
                "                DFS-recursive(G, w)";



        Layout1.setText(Layout1Text);

        String Layout2Text =  "BFS (G, s)           //Where G is the graph and s is the source node\n" +
                "      let Q be queue.\n" +
                "      Q.enqueue( s ) //Inserting s in queue until all its neighbour vertices are marked.\n" +
                "\n" +
                "      mark s as visited.\n" +
                "      while ( Q is not empty)\n" +
                "           //Removing that vertex from queue,whose neighbour will be visited now\n" +
                "           v  =  Q.dequeue( )\n" +
                "\n" +
                "          //processing all the neighbours of v  \n" +
                "          for all neighbours w of v in Graph G\n" +
                "               if w is not visited \n" +
                "                        Q.enqueue( w )    //Stores w in Q to further visit its neighbour\n" +
                "                        mark w as visited.";

        Layout2.setText(Layout2Text);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GraphContent.this,TreeContent.class);
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
        Para6 = findViewById(R.id.Para6);
        Para7 = findViewById(R.id.Para7);
        Para8 = findViewById(R.id.Para8);
        Spinner = findViewById(R.id.spinner2);
        ChangeImage = findViewById(R.id.changeImage);
        Layout1 = findViewById(R.id.Layout1Text);
        Layout2 = findViewById(R.id.Layout2Text);
        btnNext = findViewById(R.id.btnNext);
    }
}