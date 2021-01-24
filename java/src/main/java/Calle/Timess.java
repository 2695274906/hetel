package Calle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Timess {

    public static void main(String[] args) {


        SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar queryEndCalendar =Calendar.getInstance();
        //设置查询的开始时间
        queryEndCalendar.set(Calendar.HOUR_OF_DAY,0);
        queryEndCalendar.set(Calendar.MINUTE,0);
        queryEndCalendar.set(Calendar.SECOND,0);
        System.out.println("第一周====="+format3.format(queryEndCalendar.getTime()));
//        Long start = queryEndCalendar.getTimeInMillis();
//        System.out.println("start==="+start);
//        queryEndCalendar.add(Calendar.DAY_OF_YEAR,-7);
        System.out.println("当前日期"+format3.format(queryEndCalendar.getTime()));
        /*for(int index=1;index<=7;index++){
            queryEndCalendar.add(Calendar.DAY_OF_YEAR,-1);
            System.out.println("第"+index+"天"+format3.format((queryEndCalendar.getTime())));
        }*/

        //设置查询开始时间
       /* Long queryStart = start;
        System.out.println("queryStart==="+queryStart);
        //设置查询的结束时间
        queryEndCalendar.add(Calendar.DAY_OF_YEAR,1);
        queryEndCalendar.add(Calendar.MINUTE,40);
        System.out.println("queryEndCalendar22====="+format3.format(queryEndCalendar.getTime()));
        Long end = queryEndCalendar.getTimeInMillis();
        System.out.println("end===="+end);*/

      /*  //定义需要计算查询结束的Calendar
        queryEndCalendar.setTimeInMillis(queryStart);
        System.out.println("fffff=="+queryEndCalendar.getTimeInMillis());
        queryEndCalendar.add(Calendar.HOUR_OF_DAY,1);
        System.out.println("queryEndCalendar=="+format3.format(queryEndCalendar.getTime()));
        Long queryEnd = queryEndCalendar.getTimeInMillis();
        System.out.println("queryEnd==="+queryEnd);
        //为了在系统跑出异常时可以计算查询的开始时间
        queryEndCalendar.setTimeInMillis(queryStart);
        //用于统计用户活跃度的耗时
        Long startUserActivity = System.currentTimeMillis();
        System.out.println(queryEnd+"======="+end);

        long time = end-queryEnd;

        System.out.println("dddddd"+end/1000/3600);
        System.out.println("eeeee"+queryEnd/1000/3600);
        System.out.println("fffff"+time/1000/3600);
        Date date = new Date(time);
        java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestring = f.format(date);
        System.out.println(timestring);*/


      /*for(int i=0;i<5;i++){
          queryEndCalendar.add(Calendar.DAY_OF_YEAR,-1);
          System.out.println("时间为"+format3.format(queryEndCalendar.getTime())+"天");
      }*/

        for(int i=0;i<5;i++){
            queryEndCalendar.add(Calendar.HOUR_OF_DAY,1);
            System.out.println("时间为"+format3.format(queryEndCalendar.getTime()));
        }
    }

}
