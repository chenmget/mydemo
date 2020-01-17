package com.line;

/**
 * @program: mydemo
 * @description: 队列
 * @author: cm
 * @create: 2020-01-11 09:50
 **/
public class MyQueue {
    private int[] array;
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        this.array = new int[capacity];
    }

    public void enQueue(int element) {
        if ((rear + 1) % array.length == front) {
            throw new IndexOutOfBoundsException("队列已满");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    public int deQueue() {
        if (rear == front) {
            throw new IndexOutOfBoundsException("队列已空");
        }
        int rst = array[front];
        front = (front+1)%array.length;
        return rst;
    }

    public void output(){
        for(int i=front;i!=rear;i=(i+1)%array.length){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.deQueue();
        myQueue.output();
    }
}
