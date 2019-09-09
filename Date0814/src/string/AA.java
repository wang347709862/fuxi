package string;

public class AA {
    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer().append("hello");
//        StringBuffer sb2=sb.append("aaa");
//        System.out.println(sb==sb2);
//        StringBuffer sb2 = new StringBuffer(50);
//        System.out.println("sb2:" + sb2);
//        System.out.println("sb2.capacity():" + sb2.capacity());
//        System.out.println("sb2.length():" + sb2.length());
//        StringBuffer sb3 = new StringBuffer("hello");
//        sb3.delete(1,2);
//        sb3.replace(1,2,"a");
//        System.out.println(sb3.toString());
//        String s="hello";
//        s.replace('e','a');
//        System.out.println(s);
//        System.out.println("sb3:" + sb3);
//        System.out.println("sb3.capacity():" + sb3.capacity());
//        System.out.println("sb3.length():" + sb3.length());
//        String s="abcba";
//        System.out.println(new StringBuffer(s).reverse().toString().equals(s));
        // public String substring(int start,int end)
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append("world").append("java");
        String ss = sb.substring(5, 10);
        System.out.println("ss:" + ss);
        System.out.println("sb:" + sb);
        new String();
    }
}
