package geek._04_sort;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2020/3/11 12:15
 * @description 实现一个冒泡排序算法
 */
public class BubbleSort {
    public static int[] sort(int[] array) {


        for (int i = array.length - 1; i >= 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }

            if (flag == true) {
                return array;
            }
        }

        return array;
    }

    public static void main(String[] args) {

        int[] array = new int[]{10, 2, 6, 3, 9, 12, 5, 8, 8,99,65,13,28,6};

        System.out.println(Arrays.toString(sort(array)));


    }

}