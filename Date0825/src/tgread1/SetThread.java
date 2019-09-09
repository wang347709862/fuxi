package tgread1;

public class SetThread implements Runnable{
    private Student s;
    public  SetThread(Student s){
        this.s=s;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.name="wanglijie";
        s.age=22;
    }
}
