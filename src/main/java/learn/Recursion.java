package learn;

public class Recursion {
    public static int reduce(int start) {
        if (start == 1) {
            return 1;
        } else if(start == 0){
            return 0;
        } else {
            return reduce(start - 1) + reduce(start);
        }
    }
    public static int sum(int x){
        if (x == 1)
            return 1;
        return x + sum(x-1);
    }


    private static void m(int i) {
        if (i == 1) {
            System.out.println("1*1=1");
        } else {
            m(i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.println(i + "*" + j + "=" + (i * j) + "");
            }

        }
    }


    public static int method(int index){
       if(index == 0 || index ==1) {
           return 1;
       } else {
           return method(index -1) + method(index -2);
       }
    }

    public static int sum2(int index){
        if(index == 1){
            return 1;
        }else {
            return sum2(index -1) +index;
        }
    }

    public static void main(String[] args) {
//        System.out.println(Recursion.reduce(9));
//        System.out.println(Recursion.sum(10));
//        m(8);
//        System.out.println(Recursion.method(4));
        System.out.println(Recursion.sum2(2));
    }
}
