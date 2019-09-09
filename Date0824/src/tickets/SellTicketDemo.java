package tickets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket3 s=new SellTicket3();
        Thread t1=new Thread(s,"窗口1");
        Thread t2=new Thread(s,"窗口2");
        Thread t3=new Thread(s,"窗口3");

        t1.start();
        t2.start();
        t3.start();
//        List<String> strings = Collections.synchronizedList(new ArrayList<String>());
    }
}
