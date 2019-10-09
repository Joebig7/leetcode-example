package easy._001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/10/9 10:19
 * @description 题目描述：给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
 * <p>
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Solution {

    //方法一：暴力法，通过遍历数组来依次检查是否有符合的元素，时间复杂度为O(n^2)
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};

                }
            }
        }

        return new int[]{};
    }


    //方法二：通过hash表的方式，将数组中遍历过的值存储进去，这样只需要遍历一次hash表就可以判断是否有符合的元素。时间复杂度O(n)
//    public static int[] twoSum(int[] nums, int target) {
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int temp = target - nums[i];
//            if (map.containsKey(temp)) {
//                return new int[]{map.get(temp), i};
//            }
//
//            map.put(nums[i], i);
//        }
//
//        return new int[]{};
//
//    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}