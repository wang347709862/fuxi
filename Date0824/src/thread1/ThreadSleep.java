package thread1;

import java.util.Date;

public class ThreadSleep extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
