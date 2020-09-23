package learn;

/**
 * @author sulei
 * @date 2020/9/17 6:05 下午
 *
 * 求斐波那契数列数列的第n项。
 *  1, 1, 2, 3,5,8......
 */
public class Fibonacci {
    public static  int fibonacci(int n) {
        if(n <= 2){
            return 1;
        }
        int pre1 = 1;
        int pre2 = 1;
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = pre1 + pre2;
            pre1 = pre2;
            pre2 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
