package object;

public class Changyong01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        St s=new St();
        System.out.println(s.getClass().getName()+'@'+Integer.toHexString(s.hashCode()));

        Object o=s;
        System.out.println(o.getClass().getName());
        String v="ad";
        int[] a={1,2};
        a.clone();
        St c= (St) s.clone();
    }
//    public boolean equals(Object o){
//        if(this==o){
//            return true;
//        }
//        if(o==null){
//            return false;
//        }
//        if()
//
//    }
}
