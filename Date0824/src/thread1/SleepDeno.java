package thread1;

public class SleepDeno {
    public static void main(String[] args) {
        ThreadSleep t1=new ThreadSleep();
        ThreadSleep t2=new ThreadSleep();
        ThreadSleep t3=new ThreadSleep();
        t1.start();
        t2.start();
        t3.start();
    }
}
