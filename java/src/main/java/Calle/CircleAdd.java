package Calle;

import javat.User;

import java.util.*;

public class CircleAdd {

    //11111
    public static void main(String[] args) {
        /*Map<Integer,Object> map = new HashMap<>();
        List<Map> list =new ArrayList<>();*/

        //两个map具有不同的key
        HashMap map1           =new HashMap();
        map1.put("1", "A");

        System.out.println(map1);
        HashMap map2 = new HashMap();
        map2.put("2", "B");
        map2.put("1", "C");
        map1.putAll(map2);
        System.out.println(map1);


       Set<String> setStr     =new HashSet<>();

        System.out.println(setStr.size());
        setStr.add("11");
       setStr.add("22");
       setStr.add("33");
       System.out.println(setStr.size());

    }
}
