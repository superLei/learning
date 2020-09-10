package learn;

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000000; i++) {
            if(MyThread.interrupted()){
                System.out.println("it stopped");
//                break;
                return;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("see it, oh no!");
    }

}

public class ThreadDemo2 {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

    }
}
