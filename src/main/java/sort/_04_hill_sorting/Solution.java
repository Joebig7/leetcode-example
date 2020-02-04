package sort._04_hill_sorting;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/11/25 9:50
 * @description 希尔排序  平均时间复杂度 O(nlogn)   根据增量进行逻辑分组
 */
public class Solution {

    public static int[] sort(int[] array) {

        int gap = 1;
        while (gap < array.length) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j = i - gap;
                while (j >= 0 && array[j] > temp) {
                    array[j + gap] = array[j];
                    j -= gap;
                }

                array[j + gap] = temp;
            }

            gap = (int) Math.floor(gap / 3);
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 4, 3, 8, 6, 9, 11, 3, 23, 54, 34};
        System.out.println(Arrays.toString(sort(array)));
    }

}