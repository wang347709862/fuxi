package io_properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties pp=new Properties();
        InputStream is=new FileInputStream("f:\\test\\pro.properties");
        pp.load(is);
        Set<String> strings = pp.stringPropertyNames();
        System.out.println(strings.size());
        for (String key : strings) {
            if(key.equals("list")){
                String value = pp.getProperty(key);
                System.out.println(value);
                pp.setProperty("list","100");
            }
        }
        OutputStream os=new FileOutputStream("f:\\test\\pro.properties");
        pp.store(os,"my fitst store");
        os.close();
        is.close();

//        String list = pp.getProperty("list");
//        System.out.println(list);
//        is.close();
    }
}
