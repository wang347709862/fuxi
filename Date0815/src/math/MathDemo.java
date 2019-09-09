package math;

public class MathDemo {
    public static void main(String[] args) {
//        System.out.println(Math.ceil(12.34));/
//        System.out.println(Math.floor(12.34));/
//        System.out.println(Math.(12.34));/
//        System.out.println(Math.ceil(12.34));/
//        System.out.println(Math.ceil(12.34));/
        int start=5;
        int end=66;
       int i=start+(int)(Math.round(Math.random()*(end-start)) );
        System.out.println(i);
    }
}
