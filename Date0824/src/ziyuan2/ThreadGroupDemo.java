package ziyuan2;

public class ThreadGroupDemo {
    public static void main(String[] args) {
//        MyRunnable my = new MyRunnable();
//        Thread t1 = new Thread(my, "林青霞");
//        Thread t2 = new Thread(my, "刘意");
//        // 我不知道他们属于那个线程组,我想知道，怎么办
//        // 线程类里面的方法：public final ThreadGroup getThreadGroup()
//        ThreadGroup tg1 = t1.getThreadGroup();
//        ThreadGroup tg2 = t2.getThreadGroup();
//        // 线程组里面的方法：public final String getName()
//        String name1 = tg1.getName();
//        String name2 = tg2.getName();
//        System.out.println(name1);
//        System.out.println(name2);
//        // 通过结果我们知道了：线程默认情况下属于main线程组
//        // 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
//        System.out.println(Thread.currentThread().getThreadGroup().getName());
        ThreadGroup tg = new ThreadGroup("这是一个新的组");

        MyRunnable my = new MyRunnable();
        // Thread(ThreadGroup group, Runnable target, String name)
        Thread t1 = new Thread(tg, my, "林青霞");
        Thread t2 = new Thread(tg, my, "刘意");

        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());

        //通过组名称设置后台线程，表示该组的线程都是后台线程
        tg.setDaemon(true);
    }
}
