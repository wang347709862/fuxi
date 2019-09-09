package decimal;

import java.math.BigDecimal;

public class D1 {
    public static void main(String[] args) {
//        System.out.p
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        System.out.println(bd1.add(bd2));
        BigDecimal bd3 = new BigDecimal("1.0");
        BigDecimal bd4 = new BigDecimal("0.32");
        System.out.println(bd3.subtract(bd4));
        BigDecimal bd5 = new BigDecimal("1.015");
        BigDecimal bd6 = new BigDecimal("100");
        System.out.println(bd5.multiply(bd6));
        BigDecimal bd7 = new BigDecimal("1.301");
        BigDecimal bd8 = new BigDecimal("100");
        System.out.println(bd7.divide(bd8));
        System.out.println(2147483647+1);
        System.out.println("divide:"
                + bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP));
        System.out.println("divide:"
                + bd7.divide(bd8, 8, BigDecimal.ROUND_HALF_UP));
//        Integer iii = new Integer("2147483648");
//        System.out.println(iii);
    }
}
