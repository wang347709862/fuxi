package arraylist;

import java.util.LinkedList;

public class MyStack {
    private LinkedList link;

    public MyStack(){
        link=new LinkedList();
    }

    public void add(Object o){
        link.addLast(o);
    }

    public Object get(){
        return link.removeLast();
    }

    public boolean isEmpty(){
        return link.isEmpty();
    }
}
