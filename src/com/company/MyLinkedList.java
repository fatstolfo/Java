package com.company;

public class MyLinkedList {
    private Node root;


    public MyLinkedList() {
        root = null;
    }


    public void add(String str) {
        if (root == null) {
            Node node = new Node();
            node.element = str;
            root = node;
        } else {
            Node node = root;
            while (node.node != null) {
                node = node.node;
            }
            Node node2 = new Node();
            node2.element = str;
            node.node = node2;
            node2.node = null;
        }
    }

    public void deleteLast() {
        if (root.node == null) {
            root = null;
        } else {
            Node node = root;
            while (node.node.node != null) {
                node = node.node;
            }
            node.node = null;
        }
    }

    public void Out(){
        System.out.println(root.element);
    }

    public void element(){
        System.out.println(root.element);
    }

    private class Node {
        String element;
        Node node;
    }
}