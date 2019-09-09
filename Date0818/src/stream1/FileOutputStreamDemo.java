package stream1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("f:\\test\\新建文件夹\\liuyi\\d.txt",true);

        for(int x=0;x<10;x++){
            fos.write(("hello"+x).getBytes());
            fos.write("\r".getBytes());
        }
        fos.close();
//        f.write("java".getBytes());
//        byte[] bys={97,98,99,100,101};
//        fos.write(bys);
//
//        //public void write(byte[] b,int off,int len):写一个字节数组的一部分
//        fos.write(bys,1,3);
//
//        //释放资源
//        fos.close();

    }
}
