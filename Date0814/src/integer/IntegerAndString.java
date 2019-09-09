package integer;

public class IntegerAndString {
    public static void main(String[] args) {
        int num=100;
        String s="101";

        //
        String s1=String.valueOf(num);
        String s2=Integer.toString(num);
        String s3=new Integer(num).toString();
        String s4=""+num;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        //
        int n1=Integer.parseInt(s);
        int n2=Integer.valueOf(s);
        System.out.println(n1);
        System.out.println(n2);
    }
}
