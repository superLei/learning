package learn;


/**
 *  正数在左，负数在右。
 *
 * */
public class Exchange {

    public static int[] exchange(int[] nums){
        int left =0;
        int right = nums.length -1;
        while (left < right){
            while (left < right && nums[left] >= 0){
                left++;
            }
            while (left< right && nums[right] <0){
                right--;
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,-2,-3,22,3,5,-9};
        int[] exchange = exchange(nums);
        for(int i : exchange){
            System.out.println(i);
        }
    }

}
