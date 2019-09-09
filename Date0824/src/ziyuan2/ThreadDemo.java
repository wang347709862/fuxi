package ziyuan2;

public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.out.println("hello" + ":" + x);
                }
            }
        }){
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.out.println("world" + ":" + x);
                }
            }
        }.start();
    }
}
