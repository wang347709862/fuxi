package all;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeSet set=new TreeSet();
        set.add(new AAAA());
        set.add(new AAAA());
        System.out.println(set);
        TreeMap<Character,Integer> tm=new TreeMap<>();

        String s="aababcabcdabcde";
        char[] chars=s.toCharArray();
        int length = chars.length;

        for(int i=0;i<length;i++){
            if(!tm.containsKey(chars[i])){
                tm.put(chars[i],1);
            }else{
                int val=tm.get(chars[i]);
                tm.put(chars[i],val+1);
            }
        }

        StringBuilder sbr=new StringBuilder();
        Set<Character> keySet = tm.keySet();
        for (Character key : keySet) {
            sbr.append(key).append("(").append(tm.get(key)).append(")");
        }

        System.out.println(sbr.toString());
    }
}
