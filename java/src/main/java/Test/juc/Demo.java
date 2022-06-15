package Test.juc;


public class Demo {



    public static void main(String[] args) {

        //写一个缓存框架包含三部分：写数据、读数据、清空数据
        Cache cache = new Cache();
        //存储
        for (int i = 1; i <= 3; i++) {
            final Integer index = i;
            new Thread(() -> {
                cache.put(index + "", index);
            }, String.valueOf(i)).start();

        }

        //读取
        for (int i = 1; i <= 3; i++) {
            final Integer index = i;
            new Thread(() -> {
                cache.get(index + "");

            }, String.valueOf(i)).start();
        }


//        Thread.State

//        Monitor


    }}