package com.tiger.link;

import org.junit.jupiter.api.Test;

/**
 * @author： tiger_xi
 * @time： 2023/4/14 23:31
 * @description：
 */
class SingleLinkedListTest {

    @Test
    void headInsert() {
        SingleLinkedList headLinked = new SingleLinkedList();
        for (int i = 0; i < 10; i++) {
            headLinked.headInsert(i);
        }
        headLinked.printNode();
    }

    @Test
    void tailInsert() {
        SingleLinkedList tailLinked = new SingleLinkedList();
        for (int i = 0; i < 10; i++) {
            tailLinked.tailInsert(i);
        }
        tailLinked.printNode();
    }

    @Test
    void get() {
        SingleLinkedList tailLinked = new SingleLinkedList();
        for (int i = 0; i < 10; i++) {
            tailLinked.tailInsert(i);
        }
        System.out.println("节点元素："+tailLinked.get(3));
    }

    @Test
    void add() {
        SingleLinkedList tailLinked = new SingleLinkedList();
        for (int i = 0; i < 10; i++) {
            tailLinked.tailInsert(i);
        }
        tailLinked.add(4, 18);
        tailLinked.printNode();
    }
}