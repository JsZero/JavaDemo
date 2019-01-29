package cn.neu.demo.attr;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LambdaDemo {
    public static void main(String[] args) throws InterruptedException {
//        new LambdaDemo().demo();
        Thread thread = new Thread(() -> {
            boolean exit = false;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            while (!exit) {
                try {
                    Thread.sleep(1000);
                    System.out.println(sdf.format(new Date()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "child_thread");
        thread.start();
        Thread.sleep(1000 * 30);
        thread.stop();
        System.out.println("主进程终止");

    }

//    private void demo() {
//        List<Integer> list = Arrays.asList(5, 4, 6);
//        list.sort((e1, e2) -> {
//            int result = e1.compareTo(e2);
//            return result;
//        });
//        list.forEach(System.out::println);
//    }
}
