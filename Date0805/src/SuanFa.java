import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SuanFa {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        List[] a=new List[num];
        for(int i=0;i<num;i++){//num组数据
            int index=Integer.parseInt(br.readLine());//每组数据的个数
            String[] strs=br.readLine().split(" ");
            List li=new ArrayList();

            for(int j=0;j<index;j++){//对每组的每一个数据
                String s=strs[j];//取得每个会话id
                if(!li.contains(s)){//不包含这个元素
                    li.add(s);//加入集合
                }else{
                    int i1 = li.indexOf(s);//获得索引
                    for(int k=i1;k<li.size()-1;k++){
                        li.set(k,li.get(k+1));//每位向前挪一位
                    }
                    li.set(li.size()-1,s);//加入集合
                }
            }
            a[i]=li;
        }
        for(int i=0;i<num;i++){
            for(int i2=a[i].size()-1;i2>=0;i2--){
                System.out.print(a[i].get(i2)+" ");
            }
            System.out.println();
        }


    }
}
