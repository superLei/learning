package learn;

/**
 * 一维数组的动态和
 *
 * */
public class RunningSum {

    public static int[] runSum(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            int j = i;
            if(i == 0){
                arr2[i] = arr[i];
            }else {
                while(j >= 0){
                    arr2[i] += arr[j];
                    j--;
                }
            }

        }
        return arr2;

    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};
        int[] runSum = runSum(arr);
        for (int i = 0; i < runSum.length; i++) {
            System.out.println(runSum[i]);
        }
    }


}
