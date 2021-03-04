package com.mamba.other.sort._03_insertion_sort;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/11/25 9:50
 * @description 插入排序实现  平均时间复杂度 O(n^2)
 */
public class Solution {

    public static int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j >= 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }

            if (j != i) {
                array[j] = temp;
            }
        }

        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 4, 3, 8, 6, 9, 11, 3, 23, 54, 34};
        System.out.println(Arrays.toString(sort(array)));
    }

}