package io0;

import java.io.*;

public class CopyFoldersDemo2 {
    public static void main(String[] args) {
        File from=new File("f:\\test");
        File dest=new File("f:\\test2");

        try {
            copyAll(from,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyAll(File from, File dest) throws IOException {
        if(from.isDirectory()){
            File newFileFloder=new File(dest,from.getName());
            newFileFloder.mkdir();

            File[] files = from.listFiles();
            for (File file : files) {
                copyAll(file,newFileFloder);
            }
        }else{
            File newFile=new File(dest,from.getName());
            copyFiles(from,newFile);
        }
    }

    private static void copyFiles(File from, File newFile) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(from));
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
