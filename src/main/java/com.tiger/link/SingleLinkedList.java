package com.tiger.link;

/**
 * @author： tiger_xi
 * @date： 2023/4/14 23:22
 * @description：单链表
 */
public class SingleLinkedList<E> {

    private Node head;

    public SingleLinkedList() {
        this.head = new Node();
    }

    /**
     * 头插法
     *
     * @param element
     */
    public void headInsert(E element) {
        Node node = new Node();
        node.setData(element);
        node.setNext(this.head.getNext());
        head.setNext(node);
    }

    /**
     * 尾插法
     *
     * @param element
     */
    public void tailInsert(E element) {
        Node node = new Node();
        Node point = head;
        while (point.getNext() != null) {
            point = point.getNext();
        }
        node.setData(element);
        point.setNext(node);
    }

    /**
     * 遍历链表
     */
    public void printNode() {
        Node point = this.head;
        do {
            point = point.getNext();
            System.out.println("节点数据：" + point.getData());
        } while (point.getNext() != null);
    }

    /**
     * 获取链表长度
     *
     * @return
     */
    public int sizeof() {
        int count = 0;
        Node point = head;
        do {
            count++;
            point = point.getNext();
        } while (point.getNext() != null);
        return count;
    }

    /**
     * 获取指定位置的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        isOut(index);
        Node point = head;
        while (index-- > 0) {
            point = point.getNext();
        }
        return point.getData();
    }

    /**
     * 指定位置插入元素
     *
     * @param index
     * @param element
     */
    public void add(int index, E element) {
        isOut(index);
        Node point = head;
        while (--index > 0) {
            point = point.getNext();
        }

        Node current = new Node();
        current.setData(element);
        current.setNext(point.getNext());
        point.setNext(current);
    }

    private void isOut(int index) {
        if (index < 0 || index > sizeof()) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    class Node {
        private E data;
        private Node next;

        public Node() {
        }

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
