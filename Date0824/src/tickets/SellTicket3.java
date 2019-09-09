package tickets;

import java.util.Collections;

public class SellTicket3 implements Runnable{
    private static int tickets = 100;
    Object o=new Object();
    private int x = 0;
    @Override
    public void run() {

        while(true){
            if(x%2==0){
                synchronized (o){
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()
                                + "正在出售第" + (tickets--) + "张票 ");
                    }
                }
            }else{
                sellTickets();
            }

            x++;
        }
    }

    private static synchronized void sellTickets(){
        if(tickets>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + "正在出售第" + (tickets--) + "张票 ");
        }
        }
    }

