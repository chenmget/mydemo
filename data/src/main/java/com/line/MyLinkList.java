package com.line;

/**
 * @program: mydemo
 * @description: 链表
 * @author: cm
 * @create: 2020-01-10 21:01
 **/
public class MyLinkList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node last;
    private int size;

    private void insert(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组长度");
        }
        Node insertNode = new Node(data);
        if (size == 0) {
            head = insertNode;
            last = insertNode;
        } else if (index == 0) {
            insertNode.next = head;
            head = insertNode;
        } else if (index == size) {
            last.next = insertNode;
            last = insertNode;
        } else {
            Node temp = getNode(index - 1);
            insertNode.next = temp.next;
            temp.next = insertNode;
        }
        size++;
    }

    public Node delete(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组长度");
        }
        Node removeNode = null;
        if (index == 0) {
            removeNode = head;
            head = head.next;
        } else if (index == size - 1) {
            Node temp = getNode(index - 1);
            removeNode = temp.next;
            temp.next = null;
            last = temp;
        } else {
            Node temp = getNode(index - 1);
            Node nextNode = temp.next.next;
            removeNode = temp.next;
            temp.next = nextNode;
        }
        size--;
        return removeNode;
    }

    public void outPut() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private Node getNode(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组范围");
        }
        Node rst = head;
        for (int i = 0; i < index; i++) {
            rst = rst.next;
        }
        return rst;
    }

    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.insert(0, 1);
        myLinkList.insert(1, 2);
        myLinkList.insert(2, 3);
        myLinkList.insert(3, 4);
        myLinkList.delete(0);
        myLinkList.outPut();
    }


}
