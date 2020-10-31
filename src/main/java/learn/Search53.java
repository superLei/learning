package learn;

/**
 * 统计一个数字在排序数组中出现的次数。
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *
 * @author su*/
public class Search53 {
    /**
     * 通过二分查找，找到数x的位置，然后再找到x-1的位置，由于数组是正向有序的，所以通过两个数的位置之差找到x的出现的次数。
     *
     * */
    public static int search(int[] nums, int target) {
        return subSearch(nums,target) - subSearch(nums,target-1);
    }

    /**
     * 二分查找
     * 时间复杂度 O(logN)
     * */
    private static int subSearch(int[] nums,int target){
        int s =0;
        int e = nums.length -1;
        // 为什么是<=,数组中就一个数不得等于了吗
        while (s <= e){

            int mid = (s +e) /2;
            if(nums[mid] <= target){
                s = mid +1;
            }else if(nums[mid] > target){
                e = mid-1;
            }
        }
        return s;
    }

    /**
     * 暴力查找
     *
     * */
    public static int forSearch(int[] nums,int target){
        if(nums == null || nums.length <=0 || target < 0){
            return -1;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] == target) {
              count++;
           }
        }
        return count;
    }

    /**
     *  二分查找
     *  由于是一个已排序的数组
     *  失败了，是因为存在[2,2,2,2]这种情况，不知道向左还是向右移动。
     *  而且二分查找不能用于计数
     * */
    @Deprecated
    private static int binarySearch(int[] nums,int target){
        if(nums == null || nums.length <=0 || target < 0){
            return -1;
        }
        int start = 0, end = nums.length-1;
        int count = 0;
        while (start <= end){
            int mid = (start + end) / 2 ;
            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                // 错误
               count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] n = {1,3,3,3,5,6};
        System.out.println(search(n,3));
        System.out.println(forSearch(n,3));
//        System.out.println(binarySearch(n,1));
    }
}
