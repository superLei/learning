package learn;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组
 * [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 *
 * 示例 1：
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 示例 2：
 *
 * 输入：[2,2,2,0,1]
 * 输出：0
 */
public class MinArray11 {

    public static int minArray(int[] nums) {
        if (nums.length == 0) return -1;

        int start = 0, end = nums.length - 1;
        while (start < end) {
            // 每次循环都计算中间值
            int mid = (start + end) / 2;
           if(nums[mid] < nums[end]){
               // 说明在左边，将mid赋值给右指针,不+1的原因是中间小于最右边是正常的序列,如3，2，1，4，5，则需要包括1.
               end = mid;
           }else if(nums[mid] > nums[end]){
               // 说明在右边，将mid+1赋值给左指针,因为是旋转了，如7，8，9，4，5.所以+1.
               start = mid+1;
           }else{
               // 如果相等，则右指针向左移动
                end--;
           }
        }
        // 返回序列的起始值
        return nums[start];
    }

    /**
     * 两次查询，时间复杂度O(n)
     * */
    public static int minArray2(int[] numbers) {
        int start = 0;
        int count = 0;
        for (int i = 1; i < numbers.length; i++) {
           if(numbers[start] == numbers[i]){
              count++;
           }
        }
        if(count == numbers.length -1) return numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[start] <= numbers[i]){
                start = i;
            }else {
                return numbers[start+1];
            }
        }
        return numbers[0];

    }

    /**
     * 二分查找
     *
     * */
    public static int minArray3(int[] numbers) {
        int start = 0,end = numbers.length -1;
        while (start < end) {
            int mid = (start + end) /2;
            if(numbers[mid] < numbers[end]){
               end = mid;
            }else if (numbers[mid] > numbers[end]){
                start = mid + 1;
            }else {
                end--;
            }

        }
        return numbers[start];
    }
    public static void main(String[] args) {
//        int[] nums = {7,8,9,4,5};
//        int[] nums = {2,2,2,0,1};
        int[] nums = {6,7,1,2,3,4,5};
        System.out.println(minArray(nums));
        System.out.println(minArray3(nums));
    }
}
