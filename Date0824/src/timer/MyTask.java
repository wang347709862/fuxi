package timer;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
    private Timer t;

    public MyTask() {
    }

    public MyTask(Timer t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("beng,爆炸了");
//        t.cancel();
    }
}
