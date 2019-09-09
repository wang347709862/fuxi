package single;

public class Single {
    private static Single s=null;
    private Single(){
    }

    public   static synchronized Single getOne(){
        if(s==null){
            s=new Single();
//            Double d=3;
            Double d = Double.valueOf(3);
        }
        return s;
    }

}
