package com.binarysearchtree.test;

public class Tree {

    private Node topNode;

    public void addNode(int value){
        if(topNode == null){
            topNode = new Node(value);
        }else{
            topNode.addChild(value);
        }
    }

    public void showResultInOrder(){
        if (topNode!=null){
            topNode.printOrder();
        }
    }
}
