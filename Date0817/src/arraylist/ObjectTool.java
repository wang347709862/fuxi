package arraylist;

public class ObjectTool<T> {
    private Object o;
    private T obj;

//    public <T> void show(T t){
//        System.out.println(t);
//    }
    public T getObj(){
        return obj;
    }

    public void setObj(T obj){
        this.obj=obj;
    }
}
