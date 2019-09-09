package stream1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
           fis=new FileInputStream("F:\\test\\新建文件夹\\liuyi\\b.txt");
           int len=0;
           byte[] byts=new byte[1024];
           while((len=fis.read(byts))!=-1){
               System.out.print(new String(byts,0,len));
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
