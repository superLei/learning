package learn;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * */
public class GetLeastNumbers {

    public static int[] getLeastNumbers(int[] arr, int k) {

        Queue<Integer> pq = new PriorityQueue<>((v1,v2) -> v2-v1);
        for(int i :arr){
            if(pq.size() < k){
                pq.offer(i);
            }else if(i < pq.peek()){
                pq.poll();
                pq.offer(i);
            }
        }
        return pq.stream().mapToInt(Integer::intValue).toArray();
    }
}

