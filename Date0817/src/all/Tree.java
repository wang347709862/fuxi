package all;

import java.util.Set;
import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<String, String>();

        // 创建元素并添加元素
        tm.put("hello", "你好");
        tm.put("world", "世界");
        tm.put("java", "爪哇");
        tm.put("world", "世界2");
        tm.put("javaee", "爪哇EE");

        // 遍历集合
        Set<String> set = tm.keySet();
        for (String key : set) {
            String value = tm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
