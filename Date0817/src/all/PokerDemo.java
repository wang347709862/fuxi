package all;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();

        String[] huase={"♠","♥","♣","♦"};
        String[] shuzi={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                array.add(huase[i]+shuzi[j]);
            }

        }
        array.add("小王");
        array.add("大王");

        Collections.shuffle(array);
        ArrayList<String> fengQingYang = new ArrayList<String>();
        ArrayList<String> linQingXia = new ArrayList<String>();
        ArrayList<String> liuYi = new ArrayList<String>();
        ArrayList<String> diPai = new ArrayList<String>();

        int length=array.size();
        for(int i=0;i<length;i++){
            if(i>=length-3){
                diPai.add(array.get(i));
            }else if (i % 3 == 0) {
                fengQingYang.add(array.get(i));
            } else if (i % 3 == 1) {
                linQingXia.add(array.get(i));
            } else if (i % 3 == 2) {
                liuYi.add(array.get(i));
            }
        }
        lookPoker("风清扬", fengQingYang);
        lookPoker("林青霞", linQingXia);
        lookPoker("刘意", liuYi);

        lookPoker("底牌", diPai);

    }

    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name+"的牌是：");
        for (String s : array) {
            System.out.println(s+" ");
        }
    }
}
