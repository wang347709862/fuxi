package ziyuan2;

public class My {
    public static void main(String[] args) {
        Student s=new Student();

        SetThread s1=new SetThread(s);
        GetThread s2=new GetThread(s);

        Thread thread1=new Thread(s1);
        Thread thread2=new Thread(s2);

        thread1.start();
        thread2.start();
    }
}
