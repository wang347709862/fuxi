package file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file8 = new File("f:\\liuyi\\b.txt");
        File file = new File("f:\\liuyi");
//        System.out.println(file.exists());
        System.out.println("getAbsolutePath:" + file.getAbsolutePath());
        System.out.println("getPath:" + file.getPath());
        System.out.println("getName:" + file.getName());
//        System.out.println( file8.mkdir());
        Date d = new Date(1416471971031L);
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }
    }
}
