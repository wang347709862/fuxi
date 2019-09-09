package all;

import java.util.*;

public class PokerDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // 创建一个ArrayList集合
        ArrayList<Integer> array = new ArrayList<Integer>();

        // 创建花色数组和点数数组
        // 定义一个花色数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        // 定义一个点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K", "A", "2",};
numbers.hashCode();
        int index = 0;
        for (String color : colors) {
            for (String number : numbers) {
                array.add(index);
                hm.put(index, color.concat(number));
                index++;
            }
        }

        hm.put(index, "小王");
        array.add(index++);
        hm.put(index, "大王");
        array.add(index);
        Collections.shuffle(array);

        TreeSet<Integer> fengQingYang = new TreeSet<Integer>();
        TreeSet<Integer> linQingXia = new TreeSet<Integer>();
        TreeSet<Integer> liuYi = new TreeSet<Integer>();
        TreeSet<Integer> diPai = new TreeSet<Integer>();

        for (int x = 0; x < array.size(); x++) {
            if (x >= array.size() - 3) {
                diPai.add(array.get(x));
            } else if (x % 3 == 0) {
                fengQingYang.add(array.get(x));
            } else if (x % 3 == 1) {
                linQingXia.add(array.get(x));
            } else if (x % 3 == 2) {
                liuYi.add(array.get(x));
            }
        }

        lookPoker("风清扬", fengQingYang, hm);
        lookPoker("林青霞", linQingXia, hm);
        lookPoker("刘意", liuYi, hm);
        lookPoker("底牌", diPai, hm);

    }

    private static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是：");
        for (Integer t : ts) {
            String value=hm.get(t);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
