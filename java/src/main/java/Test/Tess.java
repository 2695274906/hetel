package Test;


import cn.hutool.db.handler.HandleHelper;
import com.alibaba.fastjson.JSON;
import com.sun.deploy.util.StringUtils;
import org.omg.CORBA.MARSHAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tess {

    public static void main(String args[]) {

        List<Book> listBook =new ArrayList<>();

        Map<String,Object> map = new HashMap<>();
        listBook.add(new Book("zhang1",10));
        listBook.add(new Book("zhang2",20));
        listBook.add(new Book("zhang3",20));
        listBook.add(new Book("zhang4",10));
        listBook.add(new Book("zhang5",20));
        //累加初值
        int sucessCount = 0;
        int failCount = 0;
        for(Book book:listBook){
            Map<String,Integer> mapCount =new HashMap<>();
            if (book.getPrice()==10){
                sucessCount++;
                mapCount.put("sucessCount",sucessCount);
            }else {
                failCount++;
                mapCount.put("failCount",failCount);
            }

            /*for (int i = 1; i < 5; i++) {
                if(i<3){
                    count++;
                    mapCount.put("sucessCount",count);
                }
                else {
                    failCount++;
                    mapCount.put("failCount",failCount);
                }

            }*/

        }
        map.put("sucessCount",sucessCount);
        map.put("failCount",failCount);
        map.put("list",listBook);
        System.out.println(map);


       /* Map<String,Integer> mapCount =new HashMap<>();
        //巡检4个状态：0(未操作)1(发送成功)2(开始巡检)3(巡检完成),4(发送失败)',
        //对各个状态的进行计数
        String inspectStatus =insResDto.getInspectStatus();
        if (EnumConstants.InspectStatus.SUCCESS.getValue().equals(inspectStatus)) {
            insResDto.setInspecStatusDesc("发送成功");
            sucessCount++;
            mapCount.put("sucessCount",sucessCount);
        } else if (EnumConstants.InspectStatus.INSPECTING.getValue().equals(inspectStatus)) {
            insResDto.setInspecStatusDesc("开始巡检");
            inspectCount++;
            mapCount.put("inspectCount",inspectCount);
        } else if (!EnumConstants.InspectStatus.DONE.getValue().equals(inspectStatus)){
            insResDto.setInspecStatusDesc("巡检完成");
            doneCount++;
            mapCount.put("doneCount",doneCount);
        }else if(EnumConstants.InspectStatus.FAIL.getValue().equals(inspectStatus)) {
            insResDto.setInspecStatusDesc("巡检失败");
            failCount++;
            mapCount.put("failCount",failCount);
        }else{
            insResDto.setInspecStatusDesc("未操作");
            undoCount++;
            mapCount.put("undoCount",undoCount);
        }

        insResDto.setStatusCounts(mapCount);//对各个状态进行计数
        */
    }
}
