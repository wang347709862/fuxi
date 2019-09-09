package stream1;

import java.io.*;
import java.util.Arrays;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis=new FileInputStream("f:\\test\\新建文件夹\\liuyi\\b.txt");
//        FileOutputStream fos=new FileOutputStream("f:\\test\\新建文件夹\\liuyi\\b2.txt");
//
//        int length=0;
//        byte[] bys=new byte[1024];
//        while((length=fis.read(bys))!=-1){
//            fos.write(bys,0,length);
//        }
//        fis.close();
//        fos.close();
//        String s="我爱你中国";
//        byte[] bys=s.getBytes();
//        System.out.println(Arrays.toString(bys));
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
//                "F:\\test\\新建文件夹\\liuyi\\b.txt"));
//
////         读取数据
//         int by = 0;
//         while ((by = bis.read()) != -1) {
//         System.out.print((char) by);
//         }
//         System.out.println("---------");
//
//        byte[] bys = new byte[1024];
//        int len = 0;
//        while ((len = bis.read(bys)) != -1) {
//            System.out.print(new String(bys, 0, len));
//        }

        // 释放资源
//        bis.close();

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("f:"));
    }
}
