package learn.offer68;

/**
 * 连续子数组的最大和
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 *  
 *
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 *
 * */
public class MaxSubArray42 {
    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length <= 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum >= 0){
               max = Math.max(max , sum);
            }else {
               sum = 0;
               max = Math.max(max,nums[i]);
            }
        }
        return max;

    }

    public static void main(String[] args) {
//        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        int[] num = {-2};
        System.out.println(maxSubArray(num));
    }
}
