package tgread1;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket ss=new SellTicket();

        Thread t1=new Thread(ss,"窗口1");
        Thread t2=new Thread(ss,"窗口2");
        Thread t3=new Thread(ss,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
