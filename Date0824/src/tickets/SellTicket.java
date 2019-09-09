package tickets;

public class SellTicket implements Runnable{
    private  int tickets=100;

    private Object o=new Object();

    @Override
    public void run() {
        while (true) {
            // t1,t2,t3都能走到这里
            // 假设t1抢到CPU的执行权，t1就要进来
            // 假设t2抢到CPU的执行权，t2就要进来,发现门是关着的，进不去。所以就等着。
            // 门(开,关)
            synchronized (o) { // 发现这里的代码将来是会被锁上的，所以t1进来后，就锁了。(关)
                if (tickets > 0) {
                    try {
                        Thread.sleep(100); // t1就睡眠了
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "正在出售第" + (tickets--) + "张票 ");
                    //窗口1正在出售第100张票
                }
            } //t1就出来可，然后就开门。(开)
        }
    }


}
