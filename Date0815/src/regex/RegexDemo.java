package regex;

public class RegexDemo {
    public static void main(String[] args) {
//        String regex="[1-9][0-9]{4,14}";
//        String regex2="\\w+@\\w{2,6}(.\\w{2,3})+";
//        System.out.println("347709862".matches(regex));
        String s2 = "aa.bb.cc";
        String[] str2Array = s2.split("\\.");
        for (int x = 0; x < str2Array.length; x++) {
            System.out.println(str2Array[x]);
        }

    }
}
