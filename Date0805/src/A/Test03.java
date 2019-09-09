package A;

public class Test03 {
    public int num = 10;


    public static void main(String[] args) {
        new AA();
    }
    static class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(new Test03().num);
        }
    }

}
