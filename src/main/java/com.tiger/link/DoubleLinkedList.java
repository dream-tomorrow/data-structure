package com.tiger.link;

/**
 * @author： tiger_xi
 * @time： 2023/4/14 23:46
 * @description：双链表
 */
public class DoubleLinkedList<E> {
    private Node head;

    public DoubleLinkedList() {
        this.head = new Node();
    }

    /**
     * 头插法
     *
     * @param element
     */
    public void headInsert(E element) {
        Node current = new Node();
        current.setData(element);

        if (head.getNextNode() != null) {
            // head下一节点向前指向当前节点
            head.getNextNode().setPreNode(current);
            // 当前节点向后指向head下一节点
            current.setNextNode(head.getNextNode());
        }
        // 当前节点向前指向head节点
        current.setPreNode(head);
        head.setNextNode(current);
    }

    /**
     * 尾插法
     *
     * @param element
     */
    public void tailInsert(E element) {
        Node point = head;
        while (point.getNextNode() != null) {
            point = point.getNextNode();
        }
        Node current = new Node();
        current.setData(element);
        point.setNextNode(current);
        current.setPreNode(point);
    }

    /**
     * 从前向后遍历链表
     */
    public void printToTail() {
        Node point = head;
        do {
            point = point.getNextNode();
            System.out.println("节点数据：" + point.getData());
        } while (point.getNextNode() != null);
    }

    /**
     * 从后向前遍历链表
     */
    public void printToHead() {
        Node point = head;
        do {
            point = point.getNextNode();
        } while (point.getNextNode() != null);

        do {
            System.out.println("节点数据：" + point.getData());
            point = point.getPreNode();
        } while (point.getPreNode() != null);
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
            point = point.getNextNode();
        } while (point.getNextNode() != null);
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
        do {
            point = point.getNextNode();
        } while (index-- > 0);
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
            point = point.getNextNode();
        }

        Node current = new Node();
        current.setData(element);

        current.setPreNode(point);
        current.setNextNode(point.getNextNode());
        if (point.getNextNode() != null) {
            point.getNextNode().setPreNode(current);
        }
        // point的位置要在最后修改，否则会导致新增失败
        point.setNextNode(current);
    }

    private void isOut(int index) {
        if (index < 0 || index > sizeof()) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    class Node {
        private Node preNode;
        private E data;
        private Node nextNode;

        public Node getPreNode() {
            return preNode;
        }

        public void setPreNode(Node preNode) {
            this.preNode = preNode;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }
}
