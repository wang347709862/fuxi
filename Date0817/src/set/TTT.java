package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TTT {
    public static void main(String[] args) {
//        TreeSet t=new TreeSet();
//        t.add(1);
//        t.add(1);
//        System.out.println(t);

        TreeSet t=new TreeSet<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
