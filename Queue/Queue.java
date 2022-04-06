package com.bridge.Queue;

import com.bridge.LinkedList.LinkedList;
import com.bridge.LinkedList.Node;

public class Queue {
    private Node top;
    private LinkedList linkedList;
    Node head;
    Node tail;

    public Queue() {
        this.linkedList = new LinkedList();
    }

    public void enqueue() {
        head = linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
    public void dequeue() {
        enqueue();
        top = head;
        Node temp = top;
        while (temp != null) {
            linkedList.pop();
            temp = temp.next;
        }
        System.out.println("After");
        linkedList.print();
    }
}