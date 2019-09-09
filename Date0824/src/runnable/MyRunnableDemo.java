package runnable;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my=new MyRunnable();
        Thread t1=new Thread(my,"林青霞");
        Thread t2=new Thread(my,"刘意");

        t1.start();
        t2.start();

    }
}
