package system;

import java.util.Arrays;
import java.util.Random;

public class A {
    public static void main(String[] args) {

        Random r = new Random();
        Random r2=new Random(1111);
        for (int x = 0; x < 2; x++) {
            // int num = r.nextInt();
            int num = r.nextInt(100) + 1;
            int num2 = r2.nextInt(100) + 1;
            System.out.println(num);
            System.out.println(num2);
        }
//        int[] arr = { 11, 22, 33, 44, 55 };
//        int[] arr2 = { 6, 7, 8, 9, 10 };
//
//        // 请大家看这个代码的意思
//        System.arraycopy(arr, 1, arr2, 2, 2);
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        long start = System.currentTimeMillis();
//        for (int x = 0; x < 100000; x++) {
//            System.out.println("hello" + x);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
