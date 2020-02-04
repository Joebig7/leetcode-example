package medium._016;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/10/10 17:52
 * @description 题目描述:
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。
 * 假定每组输入只存在唯一答案。
 * <p>
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class Solution {

    //1 暴力法 通过遍历数组
    public static int threeSumClosest(int[] nums, int target) {

        Integer result = null;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int temp = nums[i] + nums[j] + nums[k];
                    if (result == null) {
                        result = temp;
                    } else if (Math.abs(target - temp) < Math.abs(target - result)) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    public static int threeSumClosest2(int[] nums, int target) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1));
    }
}