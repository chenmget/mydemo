package com.line;

/**
 * @program: mydemo
 * @description: 数组插入
 * @author: cm
 * @create: 2020-01-10 16:46
 **/
public class MyArray {
    private int[] array;
    private int size;

    public MyArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    /**
     * 插入
     *
     * @param index
     * @param element
     */
    public void insert(int index, int element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("超出数组范围");
        }
        if (index == size) {
            resize();
        }


        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出数组范围");
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    /**
     * 扩容
     */
    private void resize() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    /**
     * 输出
     */
    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(4);
        myArray.insert(0, 1);
        myArray.insert(1, 2);
        myArray.insert(2, 3);
        myArray.insert(3, 4);
        myArray.insert(1, 5);
        myArray.delete(1);
        myArray.output();
    }
}
