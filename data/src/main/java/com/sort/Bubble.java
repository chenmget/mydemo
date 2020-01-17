package com.sort;

/**
 * @program: mydemo
 * @description: 冒泡排序
 * @author: cm
 * @create: 2020-01-11 19:03
 **/
public class Bubble {
    public static void sort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int tmp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{5, 4, 3, 2, 1};
        Bubble.sort(arrays);
    }

}
