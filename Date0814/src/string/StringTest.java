package string;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("请输入用户名");
            String a=sc.nextLine();
            System.out.println("请输入用户名");
            String b=sc.nextLine();
            if(a.equals(username) && b.equals(password)){
                System.out.println("正确");
            }else{//错误
                if((2-i)==0){
                    System.out.println("哦吼完蛋");
                }else{
                    System.out.println("还有"+(2-i)+"次机会");
                }
            }

        }
    }
}
