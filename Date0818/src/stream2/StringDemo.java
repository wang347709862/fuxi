package stream2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws IOException {
//        String s = "你好";
//        byte[] bys = s.getBytes("GBK");
//        System.out.println(Arrays.toString(bys));
//
//        String s2=new String(bys,"UTF-8");
//        System.out.println(s2);
        InputStreamReader isr=new InputStreamReader(new FileInputStream("F:\\test\\新建文件夹\\liuyi\\cd.txt"),"UTF-8");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("F:\\test\\新建文件夹\\liuyi\\cd2.txt"),"UTF-8");
        int len=0;
        char[] bys=new char[1024];
        while((len=isr.read(bys))!=-1){
           osw.write(bys,0,len);
        }

//        osw.write("你好哈哈哈哈哈哈哈");
        osw.close();
    }
}
