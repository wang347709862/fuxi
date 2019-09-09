package stream1;

import java.io.*;

public class CopyMp4Demo {
    public static void main(String[] args) {
        File file=new File("f:\\test\\新建文件夹\\liuyi\\acg.gy_11.jpg");

//        for(int i=0;i<4;i++){
            long start=System.currentTimeMillis();
            method4(file);
            long end=System.currentTimeMillis();
            System.out.println(end-start);
//            long end;
//            switch (i){
//                case 0:method1(file);
//                end=System.currentTimeMillis();
//                    System.out.println(end-start);
//                    break;
//                case 1:method2(file);
//                    end=System.currentTimeMillis();
//                    System.out.println(end-start);
//                    break;
//                case 2:method3(file);
//                    end=System.currentTimeMillis();
//                    System.out.println(end-start);
//                    break;
//                case 3:method4(file);
//                    end=System.currentTimeMillis();
//                    System.out.println(end-start);
//                    break;
//            }

        }
//        long start=System.currentTimeMillis()
//    }

    private static void method4(File file) {
        File f2=new File("f:\\test\\新建文件夹\\liuyi\\acg04.jpg");

        try {
            BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(f2));
            BufferedInputStream fis=new BufferedInputStream(new FileInputStream(file));
           int len=0;
           byte[] bys=new byte[1024];
           while((len=fis.read(bys))!=-1){
               fos.write(bys,0,len);
           }
            fis.close();
            fos.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method3(File file) {
        File f2=new File("f:\\test\\新建文件夹\\liuyi\\acg03.jpg");
        try {
            BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(f2));
            BufferedInputStream fis=new BufferedInputStream(new FileInputStream(file));
            int i=0;
            while((i=fis.read())!=-1){
                fos.write(i);
            }
            fis.close();
            fos.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method2(File file) {
        File f2=new File("f:\\test\\新建文件夹\\liuyi\\acg02.jpg");

        try {
            FileOutputStream fos=new FileOutputStream(f2);
            FileInputStream fis=new FileInputStream(file);
            byte[] bys=new byte[1024];
            int len=0;
            while((len=fis.read(bys))!=-1){
                fos.write(bys,0,len);
            }
            fis.close();fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method1(File file) {
        File f2=new File("f:\\test\\新建文件夹\\liuyi\\acg01.jpg");
        try {
            FileInputStream fis=new FileInputStream(file);
            FileOutputStream fos=new FileOutputStream(f2);
            int i=0;
            while((i=fis.read())!=-1){
                fos.write(i);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }

    }

}
