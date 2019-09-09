package stream2;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("F:\\test\\新建文件夹\\liuyi\\cccc.txt"),"utf-8"));
//        String s=null;
//        while((s=br.readLine())!=null){
//            System.out.println(s);
//        }
//        br.close();
//        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\test\\新建文件夹\\liuyi\\cccc.txt"),"utf-8"));
//        bw.write("湿哒哒");
//        bw.flush();
//        bw.close();
//        BufferedReader br=new BufferedReader(new FileReader())
        BufferedReader br = new BufferedReader(new FileReader("F:\\test\\新建文件夹\\liuyi\\cccc.txt"));
        // 封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\test\\新建文件夹\\liuyi\\\\dddd.txt"));
int i=0;

        if((i=1)<2){}
        // 两种方式其中的一种一次读写一个字符数组
        char[] chs = new char[1024];
        int len = 0;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
            bw.flush();
        }

        // 释放资源
        bw.close();
        br.close();
    }
}
