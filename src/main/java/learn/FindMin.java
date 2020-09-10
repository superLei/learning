package learn;

public class FindMin {

    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        if(nums.length == 1) return nums[0];
        int curIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }
        return -1;
    }

    public static int findMin2(int[] nums) {
        if(nums.length == 1) return nums[0];
        int left =0,right = nums.length -1;
        if(nums[right] > nums[0]) return nums[0];
        while (right >= left) {
           int mid = left + (right - left) /2;
           if(nums[mid] > nums[right]){
               left = mid+1;
           }else {
               right = mid;
           }
        }
        return nums[left];
    }
    public static void main(String[] args) {
//        int[] num = {3,4,5,1,2};
        int[] num = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(num));
    }

}
