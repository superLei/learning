package learn;

/**
 * 冒泡排序j
 */
public class BubbleSort {

    public static void doWork() {
        int[] nums = {3, 5, 2, 8, 6, 1, 9, 7};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                // 左数大于右数，则交换顺序j
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int reverse(int x) {
        int res = 0;
        while (x !=0) {
            int tmp = x % 10;
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;

    }


    public static void main(String[] args) {
//        BubbleSort.doWork();
//        int x  = -123465789;
        int x = 1000200;
        System.out.println(BubbleSort.reverse(x));
    }
}
