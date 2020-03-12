package geek._04_sort;

import java.util.Arrays;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2020/3/11 14:19
 * @description 插入排序
 */
public class InsertionSort {

    public static int[] solution(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            for (int j = 0; j < i - 1; j++) {
                int value = array[i];
                if (i == 1) {
                    if (value < array[0]) {
                        int temp = array[0];
                        array[0] = array[1];
                        array[1] = temp;
                    }
                } else if (value >= array[j] && value <= array[j + 1]) {
                    System.arraycopy(array, j + 1, array, j + 2, i - j - 1);
                    array[j + 1] = value;
                } else if (value <= array[j]) {
                    System.arraycopy(array, j, array, j + 1, i);
                    array[j] = value;
                }
            }
        }
        return array;
    }

    public static int[] solution2(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int j = i - 1;
            int value = array[i];
            for (; j >= 0; j--) {

                if (array[j] > value) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = value;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 6, 3, 9, 12, 5, 8, 8, 99, 65, 13, 28, 6, 100, 30, 9, 34, 56, 78, 32, 45, 12, 34};
        System.out.println(Arrays.toString(solution2(array)));
    }
}