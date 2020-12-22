package Test;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {


    private  int n =0;
    public void add() {
         n++;

    }



    public static void main(String[] args) throws InterruptedException {
        /*AtomicInteger atomicInteger = new AtomicInteger(10);

        int a = atomicInteger.getAndIncrement();
        System.out.println(a);*/
       /* Runnable mr = () -> {
            for (int i = 0; i < 1000; i++) {
                atomicInteger.incrementAndGet();
            }
        };
        ArrayList<Thread> ts = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(mr);
        }*/

       ArrayList list= new ArrayList<>();

       for(int i=0;i<25;i++){
           System.out.println("oooo");


       }
      /* for(int i=0;i<20;i++){
           new Thread(()->{
              n++;
           },String.valueOf(i)).start();
       }*/
    }
}