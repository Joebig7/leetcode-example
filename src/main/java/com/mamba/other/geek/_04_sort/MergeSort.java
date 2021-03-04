package com.mamba.other.geek._04_sort;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2020/3/17 13:47
 * @description 归并排序 平均时间复杂度O(nlogn)  空间复杂度 O(n)
 * <p>
 * 解析：
 * merge_sort(p...q)=merge_sort(p...r-1)+merge_sort(r...q)
 * 终止条件：
 * p>=q
 */
public class MergeSort {
    public static int[] solution(int[] array) {

        int length = array.length;
        return mergeSort(array, 0, length - 1);

    }

    public static int[] mergeSort(int[] array, int start, int end) {
        if (start >= end) {
            return new int[]{array[start]};
        }

        int mid = (start + end) / 2;

        int[] left = mergeSort(array, start, mid);
        int[] right = mergeSort(array, mid + 1, end);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {

        int[] temp = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i <= left.length - 1 && j <= right.length - 1) {
            if (left[i] <= right[j]) {
                temp[k++] = left[i++];
            } else if (right[j] <= left[i]) {
                temp[k++] = right[j++];
            }
        }

        while (i <= left.length - 1) {
            temp[k++] = left[i++];
        }
        while (j <= right.length - 1) {
            temp[k++] = right[j++];
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 6, 3, 9, 12, 5, 8, 8, 99, 65, 13, 28, 6, 100, 30, 9, 34, 56, 78, 32, 45, 12, 34};
        System.out.println(Arrays.toString(solution(array)));
    }
}