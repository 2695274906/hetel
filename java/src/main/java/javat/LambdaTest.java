package javat;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class LambdaTest {


    @Test
    public  void test01() {
        String aa = "aa";
        String bb = "bb";
        String cc = "cc";

        List<String> list = Arrays.asList(aa, bb, cc);
        for (String str : list) {
            System.out.println(str);
        }
    }

    @Test
    public void oldRunable() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("The old runable now is using!");
            }
        }).start();
    }

    @Test
    public  void newRunable(){

        new Thread(()->{
            System.out.println("dsdafdadsf");
        }).start();
    }

    @Test
    public void iterTest() {
        List<String> languages = Arrays.asList("java","scala","python");
        //before java8
        for(String each:languages) {
            System.out.print(each+" ");
        }
        //after java8
        languages.forEach(x -> System.out.print(x+" "));
        languages.forEach(System.out::print);
    }


    @Test
    public void mapTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        cost.stream().map(x -> x + x*0.05).forEach(x -> System.out.println(x));
    }


    @Test
    public  void user22(){
        List<User> list = new ArrayList<User>(){
            {
                add(new User(1l,"张三",10, "清华大学"));
                add(new User(2l,"李四",12, "清华大学"));
                add(new User(3l,"王五",15, "清华大学"));
                add(new User(4l,"赵六",12, "清华大学"));
                add(new User(5l,"田七",25, "北京大学"));
                add(new User(6l,"小明",16, "北京大学"));
                add(new User(7l,"小红",14, "北京大学"));
                add(new User(8l,"小华",14, "浙江大学"));
                add(new User(9l,"小丽",17, "浙江大学"));
                add(new User(10l,"小何",10, "浙江大学"));
            }
        };

        System.out.println("学校是清华大学的user的名字");
        List<String> userList6 = list.stream().filter(user -> "清华大学".equals(user.getSchool())).map(User::getName).collect(Collectors.toList());
        userList6.forEach(user -> System.out.print(user + '、'));

    }
    @Test
    public  void  test04(){
        List<Integer> list = Arrays.asList(1, 2, 3);

        list.stream().forEach(ll-> System.out.println(ll));
//        System.out.println(list);

    }
    @Test
    public void test05() {
        Stream<String> original = Stream.of("10", "200", "300");
//        Stream<Integer> result = original.map(str -> Integer.parseInt(str)*2);
        Stream<String> result = original.filter(str->(str.length()>2));
        result.forEach(System.out::println);

    }



    @Test
    public void callInterfaceCreditease(){
        try{

            ExecutorService pool = Executors.newFixedThreadPool( 2 );
            //接口

            pool.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        Thread.sleep(5000);
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

        System.out.println("dsdd");

    }





}
