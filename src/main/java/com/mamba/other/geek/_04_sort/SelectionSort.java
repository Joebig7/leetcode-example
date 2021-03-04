package com.mamba.other.geek._04_sort;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2020/3/11 15:26
 * @description 选择排序
 */
public class SelectionSort {


    public static int[] solution(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 6, 3, 9, 12, 5, 8, 8, 99, 65, 13, 28, 6, 100, 30, 9, 34, 56, 78, 32, 45, 12, 34};
        System.out.println(Arrays.toString(solution(array)));
    }

}