package learn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 * <p>
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *
 * @author su
 */
public class GetLeastNumbers40 {

    public static int[] getLeastNumbers(int[] arr, int k) {

        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int i : arr) {
            if (pq.size() < k) {
                pq.offer(i);
            } else if (i < pq.peek()) {
                pq.poll();
                pq.offer(i);
            }
        }
        return pq.stream().mapToInt(Integer::intValue).toArray();
    }


    /**
     * 大顶堆
     */
    public static int[] getLeastNumbers3(int[] arr, int k) {

        // 重写队列的比较器,确保队列中的第一个数是最大的。
        Queue<Integer> queue = new PriorityQueue<>((v1,v2) -> v2 -v1);
        for (int i = 0; i < arr.length; i++) {
            // 队列长度小于k，则添加到队列中,否则取队列中第一个和数组中的数比较，大数进入队列中。
            if (queue.size() < k) {
                queue.add(arr[i]);
            } else if(queue.peek() > arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] getLeastNumbers2(int[] arr, int k) {
        Queue<Integer> res = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int i : arr) {
            if (res.size() < k) {
                res.add(i);
            } else if (res.peek() > i) {
                res.poll();
                res.add(i);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] n = {3,2,1};
        System.out.println(Arrays.toString(getLeastNumbers3(n,2)));
        System.out.println(Arrays.toString(getLeastNumbers2(n,2)));
    }
}

