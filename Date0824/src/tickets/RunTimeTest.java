package tickets;

import java.io.IOException;

public class RunTimeTest {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
//		r.exec("winmine");
        // r.exec("notepad");
        // r.exec("calc");
//		r.exec("shutdown -s -t 10000");
        try {
//            r.exec("shutdown -a");
//            r.exec("calc");4r.exec("winmine");
            r.exec("notepad");
//            r.exec("shutdown -s -t 10000");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
