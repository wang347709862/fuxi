package array;

public class ArrayDemo {
    public static void main(String[] args) {
//        int[] arr = { 24, 69, 80, 57, 13 };
//        for(int x=0;x<arr.length-1;x++){
//            for(int y=x+1;y<arr.length;y++){
//                if(arr[x]>arr[y]){
//                    int temp = arr[x];
//                    arr[x] = arr[y];
//                    arr[y] = temp;
//                }
//            }
//        }
//        System.out.print("[");
//        for (int x = 0; x < arr.length; x++) {
//            if (x == arr.length - 1) {
//                System.out.print(arr[x]);
//            } else {
//                System.out.print(arr[x] + ", ");
//            }
//        }
//        System.out.println("]");
        int[] a={2,5,98,6,3};
        long l1=System.currentTimeMillis();
        System.out.println(toString(a));
        long l2=System.currentTimeMillis();
        System.out.println(l2-l1);

    }
    public static String toString(int[] a){
        if(a==null){
            return "null";
        }
        if(a.length==0){
            return "[]";
        }
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        int max=a.length-1;
        for(int i=0;i<max;i++){
            sb.append(a[i]+",");
        }
        sb.append(a[max]+"]");
        return sb.toString();
    }
}
