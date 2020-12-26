package jvm;

import Test.Person;
import com.alibaba.fastjson.JSONArray;
import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.Map;

public class JvmAdapter {
    public static void main(String[] args) {
        //返回虚拟机使用的最大内存
        /*Long maxMemory= Runtime.getRuntime().maxMemory();
        System.out.println(Runtime.getRuntime().maxMemory());

        Long totalMemory=Runtime.getRuntime().totalMemory();
        System.out.println(totalMemory);

        System.out.println("-Xmm:max_memory:"+(maxMemory/(double)1024/1024)+"MB");
        System.out.println("-Xms:total_memory:"+(totalMemory/(double)1024/1024)+"MB");

        double xx=((double) 305664+699392)/1024;
        System.out.println(xx);

        System.out.println(maxMemory*4);
        System.out.println(totalMemory*64);*/

//        byte[] bytes=new byte[40*1024*1024];

        // 3.1 将Map转成json
        Map<String, Person> map = new HashMap<>();
        map.put("1", new Person( "张三",10));
        map.put("2", new Person( "李四",20));
        map.put("3", new Person("王五",30));
        Object obj3 = JSONArray.toJSON(map);
        String json3 = obj3.toString();
        System.out.println("将Map<String,Person>转成json:" + json3);


    }
}
