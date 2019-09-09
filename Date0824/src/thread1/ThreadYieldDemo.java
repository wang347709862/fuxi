package thread1;

public class ThreadYieldDemo {
    public static void main(String[] args) {
        ThreadYield ty1 = new ThreadYield();
        ThreadYield ty2 = new ThreadYield();

        ty1.setName("林青霞");
        ty2.setName("刘意");

        ty1.start();
        ty2.start();
    }
}
