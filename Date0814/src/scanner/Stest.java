package scanner;

import java.util.Scanner;

public class Stest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        while(sc.hasNextInt()){
//            System.out.println(sc.nextInt());
//            if(!(sc.hasNextInt())){
//                System.out.println("???");
//            }
//        }
        int s2=sc.nextInt();
        Scanner sc2=new Scanner(System.in);
        String s1=sc2.nextLine();

        System.out.println(s1);
        System.out.println(s2);
    }
}
