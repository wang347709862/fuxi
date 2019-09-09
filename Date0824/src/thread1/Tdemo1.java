package thread1;

public class Tdemo1 {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("关羽");
        td2.setName("张飞");

        // 设置收获线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        Thread.currentThread().setName("刘备");
        for (int x = 0; x < 50; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }

}
