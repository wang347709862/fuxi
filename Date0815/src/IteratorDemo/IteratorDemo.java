package IteratorDemo;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
//        Collection c = new ArrayList();

        // 创建并添加元素
        // String s = "hello";
        // c.add(s);
//        c.add("hello");
//        c.add("world");
//        c.add("java");
//        Iterator iterator = c.iterator();
//        System.out.println(((ArrayList) c).get(1));
//        LinkedHashSet l=new LinkedHashSet();
        List list = new ArrayList();
        // 添加元素
//        list.add("hello");
//        list.add("world");
//        list.add("java");

        Iterator iterator = list.listIterator();
//        while(iterator.hasNext()){
//            if(iterator.next().equals("hello")){
//                ((ListIterator) iterator).add("ads");
//            }
//        }
//    list.add(1,"ddd");
        list.add(2);
        list.add(1);
        list.remove(2);
        System.out.println(list);
//        HashSet hs=new HashSet();
//        LinkedHashSet ll=new LinkedHashSet();
////        ll.add("dad");
//        Iterator iterator2 = list.listIterator();
//        while(iterator2.hasNext()){
//            System.out.println(iterator2.next());
//        }
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).equals("world")){
//                list.remove(i);
//            }
//        }

    }
}
