package learn;

/**
 * 统计一个数字在排序数组中出现的次数。
 * */
public class Search {
    public static int search(int[] nums, int target) {
        return subSearch(nums,target) - subSearch(nums,target-1);
    }

    private static int subSearch(int[] nums,int target){
        int s =0;
        int e = nums.length -1;
        // 为什么是<=,因为
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

    public static void main(String[] args) {
        int[] n = {1,3,3,3,5,6};
        System.out.println(search(n,3));
    }
}
