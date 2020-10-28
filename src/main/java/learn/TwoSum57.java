package learn;

/**
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。
 * 如果有多对数字的和等于s，则输出任意一对即可。
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 *
 * */
public class TwoSum57 {

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int sum = 0;
        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                return new int[]{start, end};
            }
        }
        return new int[]{-1,-1};

    }

    public static int[] twoSum2(int[] numbers, int target) {
        int start=0,end = numbers.length-1;
        int[] res = new int[]{};
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if(sum > target){
               end--;
            }else if(sum < target) {
                start++;
            }else {
                return new int[]{start,end};
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ints = twoSum2(nums, 9);
        for(int x : ints) System.out.println(x);
    }
}
