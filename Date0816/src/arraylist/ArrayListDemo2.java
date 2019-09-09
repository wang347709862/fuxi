package arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList();

        // 添加多个字符串元素(包含内容相同的)
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("java");
        array.add("world");


        for(int i=0;i< array.size()-1;i++){
           for(int j=i+1;j<array.size();j++){
               if(array.get(i).equals(array.get(j))){
                   array.remove(j);
                   j--;
               }
           }
        }
//        ArrayList list=new ArrayList();
//        int size=array.size();
//        for(int i=0;i<size;i++){
//            Object o=array.get(i);
//            if(!list.contains(o)){
//                list.add(o);
//            }
//        }

//        HashSet hs=new HashSet();
//        Iterator it = array.iterator();
//        while(it.hasNext()){
//            hs.add(it.next());
//        }

        System.out.println(array);
    }
}
