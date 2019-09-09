package io0;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) {
        File from=new File("f:\\test");
        File dest=new File("f:\\test2");

        File[] files = from.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file=new File(dir,name);
                return file.isFile() && name.endsWith(".jpg");
            }
        });

        for (File file : files) {
            String name=file.getName();
            File newFile=new File(dest,name);
            try {
                copyFiles(file,newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static void copyFiles(File file, File newFile) throws IOException {
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));

        byte[] bys=new byte[1024];
        int len=0;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
