package Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat5 {

    /*public static String stampToDate(Date date) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String dateString = simpleDateFormat.format(date);
        return dateString;
    }*/

    public static void main(String[] args) {

        /*Date date =  new Date();
        System.out.println(date);
        String ss = TimeFormat5.stampToDate(date);
        System.out.println(ss);*/
        /*List<String> list = new ArrayList<>();
        list.add("Mxy");
        list.add("StringUtils");
        list.add("join");
        String join = StringUtils.join(list,"-");//传入String类型的List集合，使用"-"号拼接
        System.out.println(join);

        String[] s = new String[]{"Yuan","Mxy"};//传入String类型的数组，使用"-"号拼接
        String join2 = StringUtils.join(s,"-");
        System.out.println(join2);*/

       /* String a=" hello world";
        String b="hello world";
        System.out.println(b.equals(a));
        a=a.trim();//去掉字符串首尾的空格
        System.out.println(a.equals(b));*/


        // 将date字符串转化为日期
        String dateString = "2018年08月08日";
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = null;
        try {
            date = format.parse(dateString);

        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
        }
        System.out.println(date.toString());




    }

}