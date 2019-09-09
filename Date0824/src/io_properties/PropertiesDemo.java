package io_properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pp=new Properties();
        pp.setProperty("aa","ddd");
        Set<String> strings = pp.stringPropertyNames();
        Set<Object> objects = pp.keySet();
        for (Object object : objects) {
            String s=(String)object;
            System.out.println(s+pp.getProperty(s));
        }
    }
}
