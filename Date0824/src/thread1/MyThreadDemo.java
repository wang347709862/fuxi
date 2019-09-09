package thread1;

public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread thread=new MyThread();
////        MyThread thread2=new MyThread();
//        thread.start();
//        thread2.start();
        MyThread my1 = new MyThread();
         MyThread my2 = new MyThread();
//         //调用方法设置名称

         my1.setName("你能抢得过我吗");
         my2.setName("你好可以的");
         my1.start();
         my2.start();
        System.out.println(Thread.currentThread().getName());
    }
}
