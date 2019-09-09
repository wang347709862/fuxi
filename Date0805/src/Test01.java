public class Test01 {
    public static In method(){
        return new In(){
            @Override
            public void show() {
                System.out.println("helloworld");
            }
        };
    }
}
