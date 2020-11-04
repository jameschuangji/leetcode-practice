package com.jc.leetcode.practice0001;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */

public class demo1 {

    public static int[] twoSum(int[] nums, int target){
//        int[] tmp = null;
        int [] tmp = new int[2];
        for (int i = 0; i<nums.length; i++)
            for (int j = i+1; j< nums.length; j++)
                if (target - nums[i] == nums[j]) {
                    tmp[0] = i;
                    tmp[1] = j;
                }
        return tmp;


    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int[] res = null;

        res = twoSum(array,26);
        for (int a = 0; a< res.length; a++)
            System.out.println(res[a]);
    }

}
