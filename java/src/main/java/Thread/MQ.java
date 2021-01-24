package Thread;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MQ {
    private static Queue<String> queue = null;    //并发队列(线程安全)

    /**
     * 初始化并发队列
     */
    public static Queue<String> initQueue(){
        if(queue == null){
            queue = new ConcurrentLinkedQueue<String>();
        }
        String tasklist = "JF1GH78F18G036149,JF1SH95F6AG110830,JF1SJ94D7DG010387,JF1SH92F9CG269249,JF1SH92F5BG215090,JF1SH92F5BG222556,JF1SH92F4CG279994,JF1BR96D7CG114298,JF1BR96D0BG078632,JF1SH95F9AG094011,JF1SH98FXAG186997,JF1BM92D8BG022510,JF1BM92DXAG013855,JF1BM94D8EG036618";
        String[] split = tasklist.split(",");
        List<String> task = Arrays.asList(split);    //数组转集合
        queue.addAll(task);        //按照集合中元素的顺序将集合中全部元素放进队列

        return queue;
    }
}
