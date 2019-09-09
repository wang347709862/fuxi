package string;

public class String2 {
    public static void main(String[] args) {
//        String s = "helloworld";
//        System.out.println(s.charAt(3));
//        System.out.println(s.indexOf('l'));
//        System.out.println(s.indexOf("owo"));
//
//        System.out.println("---------------");
//        System.out.println(s.indexOf('l',4));
//        System.out.println(s.substring(5));
//        System.out.println(s.substring(2,3));
//        String s = "JavaSE";
//        byte[] bys=s.getBytes();
//        char[] chs=s.toCharArray();
//        for (int x = 0; x < bys.length; x++) {
//            System.out.println(bys[x]);
//        }
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//        System.out.println(s.concat(null));
        String s = "helloWORLD";
        String a=s.substring(0,1);
        String b=s.substring(1,s.length());
        String a1=a.toUpperCase();
        String b1=b.toLowerCase();
        String s1=a1.concat(b1);
        System.out.println(s1);

        System.out.println(
s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase())
        );

    }
}
