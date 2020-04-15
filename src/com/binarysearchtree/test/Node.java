package com.binarysearchtree.test;


public class Node {

    private int data;
    private Node leftChild;
    private Node rightChild;

    public void addChild(int input) {
        if (input == data) {
            return;
        }

        if (input < data) {
            if (leftChild == null) {
                leftChild = new Node(input);
            } else {
                leftChild.addChild(input);
            }
        } else {
            if (rightChild == null) {
                rightChild = new Node(input);
            } else {
                rightChild.addChild(input);
            }
        }
    }

    public void printOrder(){
        if(leftChild != null){
            leftChild.printOrder();
        }

        System.out.println("Data = " + data + ", ");

        if (rightChild != null){
            rightChild.printOrder();
        }

    }

    public Node(int data) {
        this.data = data;
    }


}
