package runnable;

public class SellTicket extends Thread {
    private static int ticketsNum=100;
    @Override
    public void run() {
        while(ticketsNum>0){
            System.out.println(Thread.currentThread().getName()+"现在正在出售第"+(100-(--ticketsNum))+"张票");
//            ticketsNum--;
//            System.out.println("现在正在出售第"+(100-ticketsNum)+"张票");
        }
    }

}
