package arraylist;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack ms = new MyStack();

        // 添加元素
        ms.add("hello");
        ms.add("world");
        ms.add("java");

        while (!ms.isEmpty()){
            System.out.println(ms.get());
        }
    }
}
