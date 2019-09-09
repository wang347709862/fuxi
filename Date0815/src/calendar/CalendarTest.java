package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        Calendar c=Calendar.getInstance();
//        Date d2=new Date();
//        long time = 1000 * 60 * 60; // 1小时
//        Date d2 = new Date(time);
//        System.out.println("d2:" + d2);
//        System.out.println(d);
//        System.out.println(c.getTime());
//        c.add(Calendar.DATE,-3);
//
//        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.get(Calendar.MONTH+1));
//        System.out.println(c.get(Calendar.DATE));


        String s="1996-10-20";
        String pattern="yyyy-MM-dd";
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date d=sdf.parse(s);
        Date now=new Date();
        long longtime=now.getTime()-d.getTime();
//        Date t=new Date(longtime);
        long year=longtime/1000/60/60/24;
        System.out.println(year);
//        SimpleDateFormat sfm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String s=sfm.format(d);
//        System.out.println(s);
//        Date dd=sfm.parse(s);
//        System.out.println(dd);
//        d.setTime(10000);
//        System.out.println("d:" + d);
    }
}
