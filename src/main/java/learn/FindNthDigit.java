package learn;

/**
 * 数字序列中某一位的数字
 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
 * <p>
 * 请写一个函数，求任意第n位对应的数字。
 * 示例 1：
 * <p>
 * 输入：n = 3
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：n = 11
 * 输出：0
 */
public class FindNthDigit {

    public static int findNthDigit(int n) {
        String s = "0123456789101112131415";
        char result = s.charAt(n);
        return Integer.parseInt(String.valueOf(result));
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(3));
    }
}
