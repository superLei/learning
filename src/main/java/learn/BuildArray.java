package learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildArray {


    public static List<String> buildArray(int[] target, int n) {
        Stack<String> stack = new Stack<>();
        List<String> list = new ArrayList<>();
        for (int i = n,j=target.length -1; i > 0; ) {

        }


        return list;

    }

    public static int caculateStr(String s) {

        String[] strs = s.split(" ");
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].equals("you")) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "";

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        System.out.println(stack);
    }

}
