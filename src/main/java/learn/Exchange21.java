package learn;


import java.util.Arrays;

/**
 * 正数在左，负数在右。
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * 示例：
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 */
public class Exchange21 {

    public static int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] >= 0) {
                left++;
            }
            while (left < right && nums[right] < 0) {
                right--;
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        return nums;
    }

    /**
     * 采用分治思想，左右开工，使用左右两个指针，判断各自的下标对应的数字是否满足条件，满足则交换，否则跳过。
     *
     * */
    public static int[] exchange2(int[] nums) {
        int len = nums.length - 1;
        int start = 0, end = len;
        while (start < end) {
            while (start < end&& nums[start] % 2 != 0) {
                start++;
            }
            while (end > start && nums[end] % 2 == 0) {
                end--;
            }
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {1, -2, -3, 22, 3, 5, -9};
        System.out.println(Arrays.toString(exchange2(nums)));
    }

}
