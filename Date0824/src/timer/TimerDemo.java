package timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class TimerDemo {
    public static void main(String[] args) throws ParseException {


        String s="2019-09-09 19:13:00";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(s);
        Timer timer=new Timer();
        timer.schedule(new DeleteFolder(), parse);
    }
}
