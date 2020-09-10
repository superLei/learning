package learn;

/**
 * 寻找数组的中心索引
 */
public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int length = nums.length;
        int cursor = length / 2;
        int pre_sum = 0;
        int end_sum = 0;

        while (cursor > 0 && cursor < length - 1) {
            for (int i = 0; i < cursor; i++) {
                pre_sum += nums[i];
            }
            for (int i = cursor + 1; i < length; i++) {
                end_sum += nums[i];
            }
            if (Math.abs(pre_sum) > Math.abs(end_sum)) {
                cursor--;
               pre_sum = 0;
               end_sum = 0;
            } else if (Math.abs(pre_sum) < Math.abs(end_sum)) {
                cursor++;
                pre_sum = 0;
                end_sum = 0;
            } else {
                return cursor;
            }
        }
        return -1;

    }

    public static int m(int[] nums) {
        int sum=0, leftSum=0;
        for(int x : nums) sum += x;
        for (int i = 0; i < nums.length; i++) {
           if(leftSum == sum -leftSum - nums[i]) {
               return i;
           }
           leftSum += nums[i];

        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] n = {1, 7, 3, 6, 5, 6};
//        int[] n = {1,2,3};
//        int[] n = {-1, -1, -1, -1, -1, 0};
        int [] n = {-1,-1,-1,-1,-1,-1};
        System.out.println(m(n));
    }


}
