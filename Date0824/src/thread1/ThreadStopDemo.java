package thread1;

public class ThreadStopDemo {
    public static void main(String[] args) {
        ThreadStop t=new ThreadStop();
        t.start();
        try {
            Thread.sleep(3000);
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
