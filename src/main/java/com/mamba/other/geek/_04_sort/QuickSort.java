package com.mamba.other.geek._04_sort;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2020/3/17 15:19
 * @description 快速排序  平均时间复杂度O(nloogn)  空间复杂度O(1)
 * <p>
 * quick_sort(n) = quick_sort(start..pivot-1)+quick_sort(pivot+1...end)
 */
public class QuickSort {

    public static int[] solution(int[] array) {
        int length = array.length;
        return quickSort(array, 0, length - 1);
    }


    public static int[] quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return array;
        }

        int partitionIndex = partition(array, start, end);
        quickSort(array, start, partitionIndex - 1);
        quickSort(array, partitionIndex + 1, end);
        return array;
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start;

        for (int j = i; j <= end; j++) {
            if (array[j] < pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }

        int temp = array[end];
        array[end] = array[i];
        array[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 6, 3, 9, 12, 5, 8, 8, 99, 65, 13, 28, 6, 100, 30, 9, 34, 56, 78, 32, 45, 12, 34};
        System.out.println(Arrays.toString(solution(array)));
    }
}