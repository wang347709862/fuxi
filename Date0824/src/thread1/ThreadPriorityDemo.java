package thread1;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
//        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("东方不败");
        tp2.setName("岳不群");
//        tp3.setName("林平之");

        tp1.setPriority(1);
        tp2.setPriority(10);

        System.out.println(tp1.getPriority());
         System.out.println(tp2.getPriority());
//         System.out.println(tp3.getPriority());

        tp1.start();
        tp2.start();
//        tp3.start();
    }
}
