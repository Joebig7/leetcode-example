package com.mamba._01_array._026;

import java.util.stream.Stream;

/**
 * @Author JoeBig7
 * @date 2021/3/4 11:07:42
 * @description 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例1:
 * 给定数组 nums = [1,1,2],
 * <p>
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 说明:
 * 为什么返回数值是整数，但输出的答案是数组呢?
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * <p>
 * 你可以想象内部操作如下:
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 * <p>
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
 * for (int i = 0; i < len; i++) {
 * print(nums[i]);
 * }
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 1;
        int temp = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                temp = nums[i];
                nums[index++] = temp;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 2, 2, 3, 4, 5, 5};

        int count = new Solution().removeDuplicates(nums);


        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
