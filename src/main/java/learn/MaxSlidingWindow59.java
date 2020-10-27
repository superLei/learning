package learn;

import java.util.*;

/**
 *
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 *
 * 示例:
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 *
 * */
public class MaxSlidingWindow59 {
    /**
     * 暴力解法
     *
     * */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length < 0 || nums == null || k <= 0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length -k + 1; i++) {
            int curMax = nums[i];
            for (int j = i; j < i+k && j < nums.length; j++) {
               curMax = Math.max(curMax,nums[j]);

            }
            result[i] = curMax;
        }
        return result;
    }

    /**
     *
     * */
    public static int[] maxSlidingWindow2(int[] nums, int k) {
        if(nums.length < 0 || nums == null || k <= 0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        int ci =0, di = 0;
        for (int i = 0; i < nums.length; i++) {

        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,3)));

    }
}
