package Calle;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");


        //第三种：推荐，尤其是容量大时
        System.out.println("map.entrySet的结果"+map.entrySet());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("entry的结果"+entry);
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

       /* //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }*/
    }
}
