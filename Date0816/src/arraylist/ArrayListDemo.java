package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Integer[] i = new Integer[list.size()];
                list.toArray(i);
        System.out.println(Arrays.toString(i));
//        Vector vr=new Vector();
//        vr.addElement("hello");
//        vr.addElement("world");
//        vr.addElement("java");
//
//
//        Enumeration elements = vr.elements();
//        while(elements.hasMoreElements()){
//            String s=(String)elements.nextElement();
//            System.out.println(s);
//        }


    }
}
