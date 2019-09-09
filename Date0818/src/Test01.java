import java.util.Arrays;

public class Test01 extends TT{
    public Test01(){
        super(5);
    }
    private static int a=0;
    public static void main(String[] args) {
        split(12);
    }
    public static int split(int number) {
        if (number > 1) {
            if (number % 2 != 0) System.out.print(split((number + 1) / 2));
            System.out.print(split(number / 2));
        }
        return number;
    }
//    public static void main(String[] args) {
//        int[] a={1};
//        int[] a2={1};
//        byte a = 127;
//        byte b = 127;
//        String a3="aa";
//        StringBuffer s=new StringBuffer();
//
//        a+=b;
//        System.out.println(a);
//        String i3="100";
//        String i4="1"+new String("00");
//        System.out.println(i3==i4);
//        Arrays.equals(a,a2);
//    }
}
