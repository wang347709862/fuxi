package map;

import java.util.*;

public class MapDemo {
    //    HashMap map=new HashMap();
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("邓超", "孙俪");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "蔡依林");
        map.put("刘恺威", "杨幂");
        map.put("刘恺威2", "杨幂");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();

        // 创建并添加元素
        hm.put("2345", "hello");
        hm.put("1234", "world");
        hm.put("3456", "java");
        hm.put("1234", "javaee");
        hm.put("3456", "android");

        // 遍历
        Set<String> set = hm.keySet();
        for (String key : set) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while(iterator.hasNext()){
//            String key=iterator.next();
//            String value=map.get(key);
//            System.out.println(value);
//        }
//
//        Collection<String> values = map.values();
//        for (String value : values) {
//            System.out.println(value);
//        }


    }


//    HashMap h=new HashMap();


}
