package dielock;

public class Dielock extends Thread {
    private boolean flag;
    public Dielock(boolean flag){
        this.flag=flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (MyLock.objA){
                System.out.println("if objA");
                synchronized(MyLock.objB){
                    System.out.println("if objB");
                }
            }
        }else{
            synchronized (MyLock.objB){
                System.out.println("else objB");
                synchronized(MyLock.objA){
                    System.out.println("else objA");
                }
            }
        }
    }
}
