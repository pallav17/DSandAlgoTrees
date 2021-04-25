package com.company;

public class Tree {

    private class Node {

        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node root;

    public void insert(int value) {

        if (root == null) {
            root = new Node(value);
            return;
        }

        Node current = root;
        while (true) {

            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public Boolean search(int value) {
        Node current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }

        }
        return false;
    }

    public void traversePreOrder()
    {
        traversePreOrder(root);
    }

    public void traversePreOrder(Node root){

        if(root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseIntOrder()
    {
        traverseIntOrder(root);
    }


    public void traverseIntOrder(Node root) {
        if(root == null )
            return;
        traverseIntOrder(root.leftChild);
        System.out.println(root.value);
        traverseIntOrder(root.rightChild);
    }


    public void traversePostOrder() {
        traversePostOrder(root);
    }


    public void traversePostOrder(Node root) {
        if(root == null )
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder (root.rightChild);
        System.out.println(root.value);

    }

    public int height(){
        return height(root);
    }


    private int height(Node root){
        if(root == null)
            return -1;

        if(root.leftChild == null && root.rightChild == null){
            return 0;
        }
            int heightSum = 1 + Math.max(height(root.leftChild),height(root.rightChild));

            return heightSum;
    }

public int minValue(){
        return minValue(root);
}
    private int minValue(Node root)
    {
       Node current = root;

       while(current.leftChild != null)
        {
            current = current.leftChild;
        }

        return current.value;
    }

    //If its not a binary tree, Condition: Math.min(Math.min(left,right),root.value)

    public Boolean checkEquality(Tree SecondTree)
    {
        if(SecondTree == null)
            return false;

      return checkEquality(root,SecondTree.root);
    }
  private Boolean checkEquality(Node first,Node second){

        if (first == null && second == null)
            return true;

        if(first != null && second != null)
            return first.value == second.value
                   && checkEquality(first.leftChild,second.leftChild)
                    && checkEquality(first.rightChild,second.rightChild);

        return false;

    }
}


