package Calle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimeTest
{

    public static void main(String[] args) {

        SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       /* Calendar calendar =Calendar.getInstance();
        calendar.add(6,-1);
        System.out.println(calendar.getTime());
        System.out.println(format3.format(calendar.getTime()));*/

        Calendar queryEndCalendar=Calendar.getInstance();

        queryEndCalendar.set(Calendar.HOUR_OF_DAY,0);
        queryEndCalendar.set(Calendar.MINUTE,0);
        queryEndCalendar.set(Calendar.SECOND,0);
        Long start = queryEndCalendar.getTimeInMillis();
        System.out.println("start的结果："+start);


        queryEndCalendar.set(Calendar.DAY_OF_YEAR,0);
        System.out.println("yyyyyy"+format3.format(queryEndCalendar.getTime()));
        queryEndCalendar.set(Calendar.DAY_OF_YEAR,-7);
        System.out.println("uuuuuu:"+format3.format(queryEndCalendar.getTime()));

        Long end = queryEndCalendar.getTimeInMillis();
        System.out.println("耗时"+(end-start));


        //设置查询的结束时间
        queryEndCalendar.add(Calendar.DAY_OF_YEAR,1);
//        queryEndCalendar.set(Calendar.HOUR_OF_DAY,1);
        queryEndCalendar.add(Calendar.MINUTE,40);
//        queryEndCalendar.set(Calendar.SECOND,10);
        System.out.println("rrrrrr:"+format3.format(queryEndCalendar.getTime()));
//        Long end = queryEndCalendar.getTimeInMillis();

        //定义需要计算查询结束的Calendar
//        queryEndCalendar.setTimeInMillis(queryStart);
        queryEndCalendar.add(Calendar.HOUR_OF_DAY,1);
        Long queryEnd = queryEndCalendar.getTimeInMillis();
        //为了在系统跑出异常时可以计算查询的开始时间
//        queryEndCalendar.setTimeInMillis(queryStart);
        //用于统计用户活跃度的耗时
        Long startUserActivity = System.currentTimeMillis();

//        retainAll

       /* Map<String, String> map1=new HashMap<>();
        map1.put("name1", "提莫");
        map1.put("age","23");
        map1.put("sex", "男");

        Map<String,String> map2=new HashMap<>();
        map2.put("name2", "德玛");
        map2.put("age", "99");
        map2.put("sex","不男不女");

        map1.putAll(map2);//map的键名不能重复

        System.out.println("map1的结果："+map1);
        Set<Map.Entry<String, String>> entrySet = map1.entrySet();
        System.out.println(entrySet);
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry);
        }*/

    }


}
