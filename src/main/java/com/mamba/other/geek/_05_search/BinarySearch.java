package com.mamba.other.geek._05_search;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2020/4/1 14:23
 * @description 通过常规循环以及递归方式实现二分查找
 */
public class BinarySearch {

    public static int binarySearchWithLoop(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;


        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] == value) {
                return mid;
            }

            if (array[mid] > value) {
                high = mid - 1;
            }

            if (array[mid] < value) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int binarySearchWithRecursive(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        return binary(array, low, high, value);
    }

    private static int binary(int[] array, int low, int high, int value) {
        int mid = low + ((high - low) >> 1);
        if (low > high) {
            return -1;

        }

        if (array[mid] == value) {
            return mid;
        } else if (array[mid] < value) {
            return binary(array, mid + 1, high, value);
        } else {
            return binary(array, low, mid - 1, value);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 12, 13, 15, 18, 23};

        System.out.println(binarySearchWithLoop(array, 23));
        System.out.println(binarySearchWithRecursive(array, 23));
    }

}