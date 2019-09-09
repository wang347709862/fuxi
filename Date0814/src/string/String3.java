package string;

public class String3 {
    public static void main(String[] args) {
        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String minString = "java";
        int index=0;
        int sum=0;
        while((index=maxString.indexOf(minString))!=-1){
            sum++;
            maxString=maxString.substring(index+minString.length());
        }
        System.out.println(sum);

    }
}
