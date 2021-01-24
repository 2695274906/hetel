package Thread;

import java.util.Queue;

public class ToyotaYQ implements Runnable {
    private static final Object lock = new Object();
    private static Queue<String> queueYQ = MQ.initQueue();
    @Override
    public void run() {
        while(true){
           /* synchronized (lock){    //尽量减小锁的粒度和范围*/
                String thisVIN = queueYQ.poll();//poll返回头部的数据
                if(thisVIN == null){
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "成功制单：" + thisVIN + "。剩余：" + queueYQ.size() + "个任务");
//            }
        }
    }
}
