package dielock;

public class DieLockDemo {
    public static void main(String[] args) {
        Dielock dielock1=new Dielock(true);
        Dielock dielock2=new Dielock(false);
        dielock1.start();
        dielock2.start();
    }
}
