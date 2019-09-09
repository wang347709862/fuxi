package io_properties;

import java.io.*;
import java.util.Properties;

public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        Properties pp=new Properties();

        InputStream is=new FileInputStream("f:\\test\\pro.properties");

        pp.load(is);
        is.close();
        String numberStr = pp.getProperty("number");
        int number = Integer.parseInt(numberStr);

        if(number>5){
            System.out.println("哦吼完蛋");
            return;
        }else{
            OutputStream os=new FileOutputStream("f:\\test\\pro.properties");
            number++;
            numberStr=String.valueOf(number);
            pp.setProperty("number",numberStr);
            pp.store(os,"guessNumber+1");
            os.close();
        }



    }
}
