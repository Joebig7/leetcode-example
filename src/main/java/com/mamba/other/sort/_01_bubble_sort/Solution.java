package com.mamba.other.sort._01_bubble_sort;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/11/25 9:50
 * @description 冒泡排序实现  平均时间复杂度 O(n^2)  空间复杂度 O(n)
 */
public class Solution {

    public static int[] sort(int[] array) {
        boolean flag = true;

            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                        flag = false;
                    }
                }

            if (flag == true) {
                break;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 4, 3, 8, 6, 9, 11, 3, 23, 54, 34};
        System.out.println(Arrays.toString(sort(array)));
    }

}