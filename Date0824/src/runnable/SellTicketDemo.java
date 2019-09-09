package runnable;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket2 s1=new SellTicket2();
//        SellTicket2 s2=new SellTicket2();
//        SellTicket2 s3=new SellTicket2();

        Thread t1=new Thread(s1);
        Thread t2=new Thread(s1);
        Thread t3=new Thread(s1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
