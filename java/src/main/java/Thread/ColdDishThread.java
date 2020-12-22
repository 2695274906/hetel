package Thread;

import com.alibaba.druid.util.StringUtils;

import javax.print.DocFlavor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ColdDishThread extends Thread{

    public  static final String PERCENT="%";
    /*@Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("凉菜准备完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    /*public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        // 等凉菜 -- 必须要等待返回的结果，所以要调用join方法
        Thread t1 = new ColdDishThread();
        t1.start();
        t1.join();

        // 等包子 -- 必须要等待返回的结果，所以要调用join方法
        Thread t2 = new BumThread();
        t2.start();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println("准备完毕时间："+(end-start));
    }*/

    public static String joinLike(String str){
        if(StringUtils.isEmpty(str)){
            return "";
        }else {
            String cstr = str.replaceAll("[?]", "");
            cstr = cstr.replaceAll("[*]", "");
            cstr = cstr.replaceAll("[#]", "");
            return PERCENT.concat(cstr).concat(PERCENT);

        }
    }
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        String ss = "?*??d**d  #";


    }

}
