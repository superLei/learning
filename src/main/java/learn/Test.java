package learn;

import java.util.Arrays;

public class Test {
    public static int[] method(int[] a, int[] b){
        if(a == null || b == null || a.length <1 || b.length <1){
            return new int[0];
        }

        int len = a.length + b.length;
        int[] res = new int[len];

        for (int i = 0; i < a.length; i++) {
           res[i] = a[i];
        }
        int start = a.length;
        for (int i = 0; i < b.length; i++) {
            res[start] = b[i];
            start++;
        }
        Arrays.sort(res);
        return res;
    }
}
