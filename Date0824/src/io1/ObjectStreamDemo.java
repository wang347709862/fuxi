package io1;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) {
        try {
//            write();
            read();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f:\\test\\object1.txt"));
        Person p =(Person) ois.readObject();
        System.out.println(p);
    }
    private static void write() throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("f:\\test\\object1.txt"));
        Person p=new Person("王利杰",20);
        oos.writeObject(p);
        oos.close();
    }
}
