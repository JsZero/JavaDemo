package cn.neu.demo.attr.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("[CHILD] child thread has been interrupted");
                    throw new InterruptedException();
                }
                System.out.println("[CHILD] i=" + (i + 1));
            }
            System.out.println("[CHILD] run the code out of the for-loop");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();
            System.out.println("[PARENT] status 0: " + thread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
