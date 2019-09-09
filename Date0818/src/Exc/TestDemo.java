package Exc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestDemo {
    private int count;

    public static void main(String[] args) {
        TestDemo test = new TestDemo(88);
        System.out.println(test.count);
        String a="daddd";
        ArrayList aa=new ArrayList();
        aa.add(1);
        aa.add(3);
        aa.add(5);
        try{}catch (Exception e){}
        Iterator iterator = aa.listIterator();
        while(iterator.hasNext()){
            ((ListIterator) iterator).add(2);
        }
        System.out.println(aa);
    }

    TestDemo(int a) {
        count = a;
    }
}

