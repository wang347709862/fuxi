package io0;

import java.io.*;

//import static com.sun.deploy.cache.Cache.copyFile;

public class CopyFoldersDemo {
    public static void main(String[] args) {
        File from=new File("f:\\test");
        File dest=new File("f:\\test2");

        File[] files=from.listFiles();
        for (File file : files) {
            String name=file.getName();
            File newFile=new File(dest,name);
            try {
                copyFile(file,newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        if(!dest.exists()){
//        boolean mkdir = dest.mkdir();
//        System.out.println(mkdir);
////        }
    }

    private static void copyFile(File file, File newFile) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));

        byte[] bys=new byte[1024];
        int len=0;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }
}
