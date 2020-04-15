package com.binarysearchtree.test;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        for(int i = 0; i < 100 ; i++){
            Random r = new Random();
            int randomNumber = r.nextInt(100) + 1;
            tree.addNode(randomNumber);
        }
        tree.showResultInOrder();
    }

}
