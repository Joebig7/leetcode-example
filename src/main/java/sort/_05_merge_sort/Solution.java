package sort._05_merge_sort;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/11/25 9:50
 * @description 归并排序  平均时间复杂度O(nlogn)
 */
public class Solution {

    public static int[] sort(int[] array, int low, int high) {

        int mid = (low + high) / 2;
        if (low < high) {
            sort(array, low, mid);
            sort(array, mid + 1, high);

            merge(array, low, mid, high);

        }

        return array;
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2 + low] = temp[k2];
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 4, 3, 8, 6, 9, 11, 3, 23, 54, 34};
        System.out.println(Arrays.toString(sort(array, 0, array.length - 1)));
    }

}