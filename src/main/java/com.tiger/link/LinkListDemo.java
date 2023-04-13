package com.tiger.link;

public class LinkListDemo {
    public static void main(String[] args) {
        SingleLinkedList headLinked = new SingleLinkedList();
        for (int i = 0; i < 10; i++) {
            Node node = new Node(i);
            headLinked.headInsert(node);
        }
        System.out.println("---------- 头插法 ----------");
        headLinked.printNode();

        System.out.println("---------- 尾插法 ----------");
        SingleLinkedList tailLinked = new SingleLinkedList();
        for (int i = 0; i < 10; i++) {
            Node node = new Node(i);
            tailLinked.tailInsert(node);
        }
        tailLinked.printNode();
    }
}
