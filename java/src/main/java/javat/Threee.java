package javat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threee {

    public static  void callInterfaceCreditease(){
        try{

            ExecutorService pool = Executors.newFixedThreadPool( 2 );
            //接口

            pool.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("nbnnbbb");
                }
            });
            //释放线程池资源
            pool.shutdown();
        }catch(Exception e){
            System.out.println("清除你");
        }

        System.out.println(Thread.currentThread().getName()+"dsdd");

    }

    public static void main(String[] args) {

        Threee.callInterfaceCreditease();
    }

}
