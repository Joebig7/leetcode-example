package com.mamba.other.sort._02_selection_sort;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/11/25 9:50
 * @description 选择排序实现  平均时间复杂度 O(n^2)
 */
public class Solution {

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }

        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 4, 3, 8, 6, 9, 11, 3, 23, 54, 34};
        System.out.println(Arrays.toString(sort(array)));
    }

}