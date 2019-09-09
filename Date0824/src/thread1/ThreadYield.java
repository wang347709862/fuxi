package thread1;

public class ThreadYield extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"i"+i);
            Thread.yield();
        }
    }
}
