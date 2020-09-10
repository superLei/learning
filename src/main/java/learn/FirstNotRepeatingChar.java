package learn;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FirstNotRepeatingChar {
    public static char firstNotRepeatingChar(String str){
        if(str == null ||str.equals("")) return '\0';
        int length = str.length();
        int[] res = new int[26];
        for (int i = 0; i < length; i++) {
            res[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < length; i++) {
           if(res[str.charAt(i) - 'a'] ==1) return str.charAt(i);
        }
        return '\0';
    }

    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    public static void main(String[] args) {
        String s = "abaccdeff";
        StringBuffer res = new StringBuffer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s1 = scanner.nextLine();
            System.out.println(s1);
        }

//        int a = 'b';
//        System.out.println(a);
//        System.out.println(firstNotRepeatingChar(s));
//        System.out.println(compare(22,8));
//        HashMap map = new HashMap();
//        Hashtable hashtable= new Hashtable();
//        Set set = new HashSet<>();
//        ConcurrentHashMap
    }
}
