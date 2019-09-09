package array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(binSearch(a,5));
        String s="das";
        float ad=42;
        System.out.println(ad);
//        Arrays.sort(a);
//        int min=0;
//        int max=a.length-1;
//        int index=(min+max)/2;
//        while(a[index]!=2){
//            if(a[index]>2){
//                max--;
//            }else if(a[index]<2){
//                min++;
//            }
//            if(min>max){
//                return ;
//            }
//        }
    }
    public static int binSearch(int[] a,int key){
        int min=0;
        int max=a.length-1;

        while(min<=max){
            int mid=(min+max)>>>1;
            if(a[mid]>key){
                max=mid-1;
            }else if(a[mid]<key){
                min=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
