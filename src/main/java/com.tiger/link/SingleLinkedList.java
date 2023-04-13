package com.tiger.link;

public class SingleLinkedList {

    private Node head;

    public SingleLinkedList() {
        this.head = new Node();
    }

    public void headInsert(Node node) {
        node.setNext(this.head.getNext());
        head.setNext(node);
    }

    public void tailInsert(Node node) {
        Node point = head;
        while (point.getNext() != null) {
            point = point.getNext();
        }
        point.setNext(node);
    }

    public void printNode() {
        Node point = this.head;
        do {
            point = point.getNext();
            System.out.println("节点数据：" + point.getData());
        } while (point.getNext() != null);
    }
}
