package learn;

import java.util.*;

/**
 *找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * */
public class FindRepeatNumber03 {
    /**
     *  时间复杂度为O(n),空间复杂度为O(n)
     *  利用Set集合的特性，判断是否出现重复的数字
     * */
    public static int findRepeatNumber(int[] nums) {
        if(nums.length == 0) return -1;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
           if(!set.add(nums[i])){
               return nums[i];
           }
        }
        return -1;
    }

    /**
     * 时间复杂度为O(n),空间复杂度为O(1)
     * 如果没有重复的数字，那么正常排序后，数字i就应该在下标i的位置上。如果不相等，假设下标i的值为m,则与下标为m的数字进行交换，直到找到相等的结束。
     *
     * @return*/
    public static int findRepeatNumber2(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
           while (nums[i] != i){
               if(nums[i] == nums[nums[i]]){
                   return nums[i];
               }
               temp = nums[i];
               nums[i] = nums[temp];
               nums[temp] = temp;
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ns = {0,1,2,3,3,4,5,5};
        System.out.println(findRepeatNumber2(ns));
    }
}
