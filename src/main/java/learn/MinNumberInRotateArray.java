package learn;

/**
 * @author sulei
 * @date 2020/9/22 2:59 下午
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个 非递减 排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组 {3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小值为 1。
 */
public class MinNumberInRotateArray {

    public static int minNumberInRotateArray(int[] nums){
        if(nums.length == 0) return -1;

        int left = 0;
        int right = nums.length -1;
        if(nums[left] <= nums[right]) return nums[left];
        while(left < right) {
            int mid = (left + right)/2;
            if(nums[mid] > nums[right]){
                left = mid +1;
            } else{
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
//        int[] num = {3,4,5,1,2};
        int[] num = {1,1,1,1,1};
        System.out.println(minNumberInRotateArray(num));
    }
}
