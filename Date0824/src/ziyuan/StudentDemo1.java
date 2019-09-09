package ziyuan;

public class StudentDemo1 {
    public static void main(String[] args) {
        Student s = new Student();

        //设置和获取的类
        SetThread st = new SetThread(s);
        GetThread gt = new GetThread(s);

        //线程类
        Thread t1 = new Thread(st);

        Thread t2 = new Thread(gt);

        //启动线程
        t1.start();

        t2.start();

    }
}
