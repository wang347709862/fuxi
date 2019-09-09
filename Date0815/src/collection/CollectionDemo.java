package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(new Student("asd",1));
        c.add(new Student("a4",2));
        c.add(new Student("a6",3));
        Object[] objects = c.toArray();
        for (Object object : objects) {
            Student s=(Student)object;
            System.out.println(s.getName());
        }
//        Collection c1 = new ArrayList();
//        c1.add("abc1");
//        c1.add("abc2");
//        c1.add("abc3");
//        c1.add("abc4");
//
//        // 创建集合2
//        Collection c2 = new ArrayList();
//
//        c2.add("abc3");
//        c2.add("abc7");
//
//        boolean b = c1.retainAll(c2);
//        System.out.println(b);
//        System.out.println(c1);
//        Object[] objects = c1.toArray();

    }
}
