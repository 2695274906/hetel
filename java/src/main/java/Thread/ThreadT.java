package Thread;

import java.util.HashMap;
import java.util.Map;

public class ThreadT extends Thread{

    @Override
    public void run() {
        System.out.println("fsadsf");
    }




    public static void main(String[] args) {
        /*ThreadT threadT =new ThreadT();
        threadT.start();
        System.out.println(Thread.currentThread().getName()+666);

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"ffff");
        }).start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"我是主线程");*/

        Map<String,Object> map =new HashMap<>();
        System.out.println(map);

      while(map==null ||map.size()==0){
          System.out.println("dadfdsa");
      }



    }



}
