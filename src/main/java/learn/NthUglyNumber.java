package learn;

/**
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入: n = 10
 * 输出: 12
 * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
 * 说明:  
 * <p>
 * 1 是丑数。
 * n 不超过1690。
 *
 * @author su
 */
public class NthUglyNumber {
    public static int nthUglyNumber(int n) {
        int i = 0;
        while (n > 0) {
            i++;
            if (isUglyNum(i)) {
                n--;
            }
        }
        return i;

    }




    public static boolean isUglyNum(int i) {
        if (i == 1) {
            return true;
        }
        while (i % 2 == 0) {
            i = i / 2;
        }
        while (i % 3 == 0) {
            i = i / 3;
        }
        while (i % 5 == 0) {
            i = i / 5;
        }
        return i == 1;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1352));
//        System.out.println(isUglyNum(21));
    }
}
