package Calle;

import lombok.experimental.Accessors;

import java.util.*;


public class WeekSet {

    public static void main(String[] args) {
        /*Set<String> week =new HashSet<>();
        week.add("A");
        week.add("B");
        week.add("C");

        Set<String> preWeek =new HashSet<>();
//        preWeek.add("B");
//        preWeek.add("C");

        int rate =0;
        if(!week.isEmpty()){
            week.retainAll(preWeek);
            rate = week.size();
            System.out.println("求交集后的week："+week.size());
        }else {
            rate=week.size();
            System.out.println("求交集后的week333："+rate);
        }

        System.out.println(rate);*/

        List<String> list = new ArrayList<>();
        list.add("wo");
        list.add("ni");
        list.add("ta");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("wo")) {
                iterator.remove();
            }
            System.out.println(iterator.next());
        }
    }
}
