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

public class TreeContent extends AppCompatActivity {

    private TextView Para01,ParaTerm1,ParaTerm2,ParaTerm3,ParaTerm4,ParaTerm5,ParaTerm6,ParaTerm7,ParaTerm8,ParaTerm9,ParaTerm10,ParaTerm11,ParaTerm12,
            Para1,Para2,PropertiesHead1,
    PropertiesHead2,PropertiesHead3,PropertiesHead4,PropertiesHead5,
    Para3,Para4,Para5,Para6,Para7,Para8,Para9,Para10,Para11,Para12,Para13,Type1,Type2,Type3,Type4;

    private Button btnNext, btnPrev;

    private Spinner spinner;
    private ImageView ChangeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_content);

        initViews();

        String Para1Text = "A tree whose elements have at most 2 children is called a binary tree." +
                " Since each element in a binary tree can have only 2 children, we typically name them the left and right child.";

        Para1.setText(Para1Text);

        String Para2Text = "A Binary Tree node contains following parts.\n" +
                "\n" +
                "Data\n" +
                "Pointer to left child\n" +
                "Pointer to right child";

        Para2.setText(Para2Text);

        // Setting the properties Head of the binary Search Trees

        String Properties1HeadText = "1) The maximum number of nodes at level ‘l’ of a binary tree is 2l.";
        PropertiesHead1.setText(Properties1HeadText);

        String Properties2HeadText = "2) Maximum number of nodes in a binary tree of height ‘h’ is 2h – 1.";
        PropertiesHead2.setText(Properties2HeadText);

        String Properties3HeadText = "3) In a Binary Tree with N nodes, minimum possible height or minimum number of levels is  ? Log2(N+1) ?  ";
        PropertiesHead3.setText(Properties3HeadText);

        String Properties4HeadText = "4) A Binary Tree with L leaves has at least   ? Log2L ? + 1   levels";
        PropertiesHead4.setText(Properties4HeadText);


        // Explaining the properties of the binary search tree with respect to the heading provided above

        String Para3Text = "Here level is number of nodes on path from root to the node (including root and node). Level of root is 0.\n" +
                "This can be proved by induction.\n" +
                "For root, l = 0, number of nodes = 20 = 1\n" +
                "Assume that maximum number of nodes on level ‘l’ is 2l\n" +
                "Since in Binary tree every node has at most 2 children, next level would have twice nodes, i.e. 2 * 2l";

        Para3.setText(Para3Text);

        String Para4Text = "Here height of a tree is maximum number of nodes on root to leaf path. Height of a tree with single node is considered as 1.\n" +
                "This result can be derived from point 2 above. A tree has maximum nodes if all levels have maximum nodes. So maximum number of " +
                "nodes in a binary tree of height h is 1 + 2 + 4 + .. + 2h-1. This is a simple geometric series with h terms and sum of this series" +
                " is 2h – 1.\n" +
                "In some books, height of the root is considered as 0. In this convention, the above formula becomes 2h+1 – 1";

        Para4.setText(Para4Text);

        String Para5Text = "This can be directly derived from point 2 above. If we consider the convention where height of a leaf node is " +
                "considered as 0, then above formula for minimum possible height becomes   ? Log2(N+1) ? – 1";

        Para5.setText(Para5Text);

        String Para6Text = "A Binary tree has maximum number of leaves (and minimum number of levels) when all levels are fully filled. " +
                "Let all leaves be at level l, then below is true for number of leaves L.";

        Para6.setText(Para6Text);

        String Para7Text = "A Binary Tree is a full binary tree if every node has 0 or 2 children. " +
                "The following are the examples of a full binary tree. We can also say a full binary tree " +
                "is a binary tree in which all nodes except leaf nodes have two children. ";

        Para7.setText(Para7Text);

        String Para8Text = "A Binary Tree is a complete Binary Tree if all the levels are completely filled except " +
                "possibly the last level and the last level has all keys as left as possible \n" +
                "\n" +
                "The following are examples of Complete Binary Trees ";

        Para8.setText(Para8Text);

        String Para9Text = "A Binary tree is a Perfect Binary Tree in which all the internal nodes have two children " +
                "and all leaf nodes are at the same level. \n" +
                "The following are the examples of Perfect Binary Trees. \n\n"+
                "A Perfect Binary Tree of height h (where the height of the binary tree is the " +
                "longest path from the root node to any leaf node in the tree) has 2h+1 – 1 node. ";

        Para9.setText(Para9Text);

        String Para10Text = "A binary tree is balanced if the height of the tree is O(Log n)" +
                " where n is the number of nodes. For Example, the AVL tree maintains O(Log n) height " +
                "by making sure that the difference between the heights of the left and right subtrees is almost 1. " +
                "Red-Black trees maintain O(Log n) height by making sure that the number of Black nodes on every root to " +
                "leaf paths is the same and there are no adjacent red nodes. Balanced Binary Search trees are performance-wise " +
                "good as they provide O(log n) time for search, insert and delete. ";

        Para10.setText(Para10Text);

        String Para11Text = "Unlike linear data structures (Array, Linked List, Queues, Stacks, etc) " +
                "which have only one logical way to traverse them, trees can be traversed in different ways." +
                " Following are the generally used ways for traversing trees.";

        Para11.setText(Para11Text);

        String Para12Text = "(1) Inorder (Left, Root, Right) : 4 2 5 1 3\n" +
                "(2) Preorder (Root, Left, Right) : 1 2 4 5 3\n" +
                "(3) Postorder (Left, Right, Root) : 4 5 2 3 1";

        Para12.setText(Para12Text);

        List<String> LanguageList = new ArrayList<>();   // List For Spinner for Changing the Language of the Implementation of tree
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
                    ChangeImage.setImageResource(R.drawable.ic_treec);
                }
                else if(position == 1){     // Selecting C++
                    ChangeImage.setImageResource(R.drawable.ic_treecpp);
                }
                else if(position == 2){              // Selecting Java
                    ChangeImage.setImageResource(R.drawable.ic_treejava);
                }
                else if(position == 3){         // Selecting Python
                    ChangeImage.setImageResource(R.drawable.ic_treepython);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String Para13Text = "Binary Search Tree is a node-based binary tree data structure which has the following properties:\n" +
                "\n" +
                "The left subtree of a node contains only nodes with keys lesser than the node’s key.\n" +
                "The right subtree of a node contains only nodes with keys greater than the node’s key.\n" +
                "The left and right subtree each must also be a binary search tree.";

        Para13.setText(Para13Text);

        // Tree Definition
        String Para01Text = "In linear data structure data is organized in sequential order and in non-linear data structure " +
                "data is organized in random order. A tree is a very popular non-linear data structure used in a wide range of applications. " +
                "A tree data structure can be defined as follows...\n" +
                "\n"+
                "Tree is a non-linear data structure which organizes data in hierarchical structure and this is a recursive definition.";

        Para01.setText(Para01Text);
        // Term Node
        String ParaTerm1Text = "In tree data structure, every individual element is called as Node. Node in a tree data" +
                " structure stores the actual data of that particular element and link to next element in hierarchical structure.\n\n"+
                "In a tree data structure, if we have N number of nodes then we can have a maximum of N-1 number of links.";

        ParaTerm1.setText(ParaTerm1Text);
        // Term Root
        String ParaTerm2Text = "In a tree data structure, the first node is called as Root Node." +
                " Every tree must have a root node. We can say that the root node is the origin of the " +
                "tree data structure. In any tree, there must be only one root node. We never have multiple root nodes in a tree.";

        ParaTerm2.setText(ParaTerm2Text);

        // Term Edge
        String Paraterm3Text = "In a tree data structure, the connecting link between any two nodes is called as EDGE." +
                " In a tree with 'N' number of nodes there will be a maximum of 'N-1' number of edges.";

        ParaTerm3.setText(Paraterm3Text);

        //Term Parent
        String ParaTerm4text = "In a tree data structure, the node which is a predecessor of any node is called as PARENT NODE." +
                " In simple words, the node which has a branch from it to any other node is called a parent node." +
                " Parent node can also be defined as \"The node which has child / children\".";

        ParaTerm4.setText(ParaTerm4text);

        // term Child
        String ParaTerm5Text = "In a tree data structure, the node which is descendant of any node is called" +
                " as CHILD Node. In simple words, the node which has a link from its parent node is called as child node." +
                " In a tree, any parent node can have any number of child nodes. In a tree, all the nodes except root are child nodes.";

        ParaTerm5.setText(ParaTerm5Text);

        // Term Siblings
        String ParaTerm6text = "In a tree data structure, nodes which belong to same Parent are called as SIBLINGS. " +
                "In simple words, the nodes with the same parent are called Sibling nodes.";

        ParaTerm6.setText(ParaTerm6text);

        // term Leaf Node
        String ParaTerm7Text = "In a tree data structure, the node which does not have a child is called as LEAF Node." +
                " In simple words, a leaf is a node with no child.\n" +
                "\n" +
                "In a tree data structure, the leaf nodes are also called as External Nodes." +
                " External node is also a node with no child. In a tree, leaf node is also called as 'Terminal' node.";

        ParaTerm7.setText(ParaTerm7Text);

        // Term Internal Node
        String Paraterm8Text = "In a tree data structure, the node which has atleast one child is called as INTERNAL Node. " +
                "In simple words, an internal node is a node with atleast one child.\n"+
                "In a tree data structure, nodes other than leaf nodes are called as Internal Nodes. ";

        ParaTerm8.setText(Paraterm8Text);

        // term degree of Node
        String Pataterm9Text = "In a tree data structure, the total number of children of a node is called as DEGREE of that Node." +
                " In simple words, the Degree of a node is total number of children it has. The highest degree of a node among all" +
                " the nodes in a tree is called as 'Degree of Tree'";

        ParaTerm9.setText(Pataterm9Text);

        //Term Level
        String ParaTerm10Text = "In a tree data structure, the root node is said to be at Level 0 and the children " +
                "of root node are at Level 1 and the children of the nodes which are at Level 1 will be at Level 2 and so on..." +
                " In simple words, in a tree each step from top to bottom is called as a Level and the Level count starts with '0'" +
                " and incremented by one at each level (Step).";

        ParaTerm10.setText(ParaTerm10Text);

        //Term Height
        String ParaTerm11Text = "In a tree data structure, the total number of edges from leaf node to a particular node " +
                "in the longest path is called as HEIGHT of that Node. In a tree, height of the root node is said to be height of the tree." +
                " In a tree, height of all leaf nodes is '0'.";

        ParaTerm11.setText(ParaTerm11Text);

        // Term Depth
        String ParaTerm12Text = "In a tree data structure, the total number of egdes from root node to a particular node " +
                "is called as DEPTH of that Node. In a tree, the total number of edges from root node to a leaf node in the" +
                " longest path is said to be Depth of the tree. In simple words, the highest depth of any leaf node in a tree is" +
                " said to be depth of that tree. In a tree, depth of the root node is '0'.";

        ParaTerm12.setText(ParaTerm12Text);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TreeContent.this,StringContent.class);
                startActivity(i);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TreeContent.this,GraphContent.class);
                startActivity(i);
            }
        });

    }
    public void initViews(){
        Para01 = findViewById(R.id.Para0_1);
        ParaTerm1 = findViewById(R.id.Para0_2);
        ParaTerm2 = findViewById(R.id.Para0_3);
        ParaTerm3 = findViewById(R.id.Para0_4);
        ParaTerm4 = findViewById(R.id.Para0_5);
        ParaTerm5 = findViewById(R.id.Para0_6);
        ParaTerm6 = findViewById(R.id.Para0_7);
        ParaTerm7 = findViewById(R.id.Para0_8);
        ParaTerm8 = findViewById(R.id.Para0_9);
        ParaTerm9 = findViewById(R.id.Para1_0);
        ParaTerm10 = findViewById(R.id.Para1_1);
        ParaTerm11 = findViewById(R.id.Para1_2);
        ParaTerm12 = findViewById(R.id.Para1_3);
        Para1 = findViewById(R.id.Para1);
        Para2 = findViewById(R.id.Para2);
        Para3 = findViewById(R.id.Para3);
        Para4 = findViewById(R.id.Para4);
        Para5 = findViewById(R.id.Para5);
        Para6 = findViewById(R.id.Para6);
        Para7 = findViewById(R.id.Para7);
        Para8 = findViewById(R.id.Para8);
        Para9 = findViewById(R.id.Para9);
        Para10 = findViewById(R.id.Para10);
        Para11 = findViewById(R.id.Para11);
        Para12 = findViewById(R.id.Para12);
        Para13 = findViewById(R.id.Para13);
        PropertiesHead1 = findViewById(R.id.PropertiesHead1);
        PropertiesHead2 = findViewById(R.id.PropertiesHead2);
        PropertiesHead3 = findViewById(R.id.PropertiesHead3);
        PropertiesHead4 = findViewById(R.id.PropertiesHead4);
        Type1 = findViewById(R.id.Type1);
        Type2 = findViewById(R.id.Type2);
        Type3 = findViewById(R.id.Type3);
        Type4 = findViewById(R.id.Type4);
        spinner = findViewById(R.id.spinner1);
        ChangeImage = findViewById(R.id.changeImage);

        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);
    }
}