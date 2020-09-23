package learn;


/**
 *
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。
 *
 * 采用动态规划，当i=0 或f(i)<0 时，f(i) = array[i];
 * 当 i>0 ,f(i)>0时，f(i) = f(i-1) + array[i]
 *
 * @author sulei
 * */
public class FindGreatestSumOfSubArray {

    public static  int findGreatestSumOfSubArray(int[] array) {
        if(array.length < 0){
            return 0;
        }
        int maxSum = array[0];
        int curMax = maxSum;
        for (int i = 0; i < array.length; i++) {
            if(curMax <=0){
                curMax = array[i];
            }else{
                curMax += array[i];
            }
            if(curMax > maxSum){
                maxSum = curMax;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] n = {1,-2,3,-5};
        System.out.println(findGreatestSumOfSubArray(n));
    }
}
