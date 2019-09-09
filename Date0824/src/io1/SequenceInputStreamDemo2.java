package io1;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
//        ArrayList<InputStream> list=new ArrayList<>();
        Vector<InputStream> v=new Vector<>();
        InputStream s1 = new FileInputStream("f:\\test\\dd.txt");
        InputStream s2 = new FileInputStream("f:\\test\\cccc.txt");
        InputStream s3 = new FileInputStream("f:\\test\\b2.txt");
        v.add(s1);
        v.add(s2);
        v.add(s3);
        Enumeration<InputStream> elements = v.elements();
        SequenceInputStream ss=new SequenceInputStream(elements);

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("f:\\test\\asdasd.txt"));

        int len=0;
        byte[] bys=new byte[1024];
        while((len=ss.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        ss.close();
    }
}
