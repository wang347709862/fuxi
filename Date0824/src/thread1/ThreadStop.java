package thread1;

import java.util.Date;

public class ThreadStop extends Thread {
    @Override
    public void run() {
        System.out.println("开始执行"+new Date());
        try {
            Thread.sleep(10000);
            System.out.println(">>>>>");
        } catch (InterruptedException e) {
            System.out.println("你别想睡觉");
        }
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
//        System.out.println("结束执行"+new Date());
    }
}
