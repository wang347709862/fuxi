package tgread1;

public class DieLock extends Thread{
        private boolean flag;
        public DieLock(boolean flag){
            this.flag=flag;
        }

    @Override
    public void run() {
        if(flag){
            synchronized(MyLock.obja){
                System.out.println("if obja");
                synchronized(MyLock.objb){
                    System.out.println("if objb");
                }
            }
        }else{
            synchronized(MyLock.objb){
                System.out.println("else objb");
                synchronized (MyLock.obja) {
                    System.out.println("else obja");
                }
            }
        }
    }
}
