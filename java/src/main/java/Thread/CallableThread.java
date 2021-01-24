package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable<String>{

    @Override
    public String call() throws Exception {
        String ss = doSomeThing();
        return ss;
    }

    private String doSomeThing() {
        System.out.println("我是线程中的方法");
        return  "fasdsfds";
    }

    public static void main(String[] args) {
        Callable<String> callable=new CallableThread();
        FutureTask<String> futureTask=new FutureTask<String>(callable);
        Thread thread=new Thread(futureTask);
        thread.start();//开启一个线程方法
        //以下的方法可与上边的线程并发执行
        try {
            futureTask.get();//获取线程返回值
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }



}
