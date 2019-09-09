package io1;

import java.io.*;

public class SequenceInputStreamDemo {


    public static void main(String[] args) {
        try {
            InputStream  si = new FileInputStream("f:\\test\\b2.txt");
            InputStream s2=new FileInputStream("f:\\test\\cccc.txt");

            SequenceInputStream ss=new SequenceInputStream(si,s2);

            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("f:\\test\\dd.txt"));
            byte[] bys=new byte[1024];
            int len=0;
            while((len=ss.read(bys))!=-1){
                bos.write(bys,0,len);
            }
            bos.close();
            ss.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}
