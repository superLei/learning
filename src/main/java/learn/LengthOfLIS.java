package learn;

import java.util.Arrays;

/**
 * @author sulei
 * @date 2020/9/17 11:22 上午
 *
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 */
public class LengthOfLIS {

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 使用hashtable保存结果
        int[] dp= new int[nums.length];
        int res = 0;
        Arrays.fill(dp,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res= Math.max(res,dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] n = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] n = {10,9,2,5,3,4};
        System.out.println(lengthOfLIS(n));
//        int[] a = {1,2,3};
//        int[] b = {4,5,6};
//        System.arraycopy(a,0,b,2,1);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(b[i]);
//        }
//        StringBuffer sa = new StringBuffer("123");
//        sa.replace(1,3,"d");
//        System.out.println(sa.toString());
    }
}

