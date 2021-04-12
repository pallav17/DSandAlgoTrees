package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10 );
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);


        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(9);
        tree2.insert(8);
        tree2.insert(10 );
        tree2.insert(4);
        tree2.insert(1);
        tree2.insert(6);

       // tree.checkEquality();


      //  System.out.println(tree.search(0));

        // tree.traversePreOrder();

        // tree.traverseIntOrder();
        //tree.traversePostOrder();

        System.out.println(tree.minValue());

        System.out.println(tree.checkEquality(null));
    }
}
