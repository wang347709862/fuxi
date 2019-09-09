package tgread1;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();

        SetThread s1=new SetThread(s);
        GetThread s2=new GetThread(s);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        //启动线程
        t1.start();
        t2.start();
    }
}
