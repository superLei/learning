package learn;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadDemo1 {
    public static void main(String[] args) {
        final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(10);
        // 定义生产者
        final Runnable runnable = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                    blockingQueue.put(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        // 定义消费者
        final Runnable consume_run = new Runnable() {
            public void run() {
                // 使用线程池
                ExecutorService executor = Executors.newCachedThreadPool();
                // 启动线程A---生产者
                System.out.println("begin to product ");
                for (int i = 0; i <3 ; i++) {
                   executor.submit(runnable);
                }
                System.out.println("5 second after");
                for (int i = 0; i <3 ; i++) {
                    try {
                        System.out.println("product index: "+ blockingQueue.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("success take it");
            }
        };
        new Thread(consume_run).start();

    }
}
