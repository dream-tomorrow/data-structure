package com.tiger.link;

import org.junit.jupiter.api.Test;

/**
 * @author： tiger_xi
 * @time： 2023/4/15 12:01
 * @description：
 */
public class DoubleLinkedListTest {

    @Test
    public void headInsert() {
        DoubleLinkedList headLinked = new DoubleLinkedList();
        for (int i = 0; i < 10; i++) {
            headLinked.headInsert(i);
        }
        headLinked.printToHead();
        System.out.println("---------------------------");
        headLinked.printToTail();
    }

    @Test
    public void tailInsert() {
        DoubleLinkedList tailLinked = new DoubleLinkedList();
        for (int i = 0; i < 10; i++) {
            tailLinked.tailInsert(i);
        }
        tailLinked.printToHead();
        System.out.println("---------------------------");
        tailLinked.printToTail();
    }

    @Test
    public void sizeof() {
        DoubleLinkedList tailLinked = new DoubleLinkedList();
        for (int i = 0; i < 10; i++) {
            tailLinked.tailInsert(i);
        }
        System.out.println("链表长度：" + tailLinked.sizeof());
    }

    @Test
    public void add() {
        DoubleLinkedList tailLinked = new DoubleLinkedList();
        for (int i = 0; i < 10; i++) {
            tailLinked.tailInsert(i);
        }
        tailLinked.add(3, 18);
  //      tailLinked.printToTail();
        tailLinked.printToHead();
    }

    @Test
    public void get() {
        DoubleLinkedList tailLinked = new DoubleLinkedList();
        for (int i = 0; i < 10; i++) {
            tailLinked.tailInsert(i);
        }
        tailLinked.printToTail();
        System.out.println("--------------------------------");
        System.out.println("获取元素：" + tailLinked.get(4));
    }
}
