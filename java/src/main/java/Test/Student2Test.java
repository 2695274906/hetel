package Test;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Student2Test {
    public static void main(String[] args) {
      /*  Student2 stu1= new Student2(16,3);
        Student2 stu2= new Student2(17,11);
        Student2 stu3= new Student2(18,23);

        HashTable ht =new HashTable();
        ht.put(stu1);
        ht.put(stu2);
        ht.put(stu3);

        Student2 target=new Student2(18);
        Student2 ss = ht.get(target);
        System.out.println(ss);*/
        /*String jsonStr ="[\n" +
                "                {\"name\":\"张三\",\"age\":\"1\"},\n" +
                "                {\"name\":\"李四\",\"age\":\"4\"}\n" +
                "                ]"
            ;

        List<Person> list = JSONArray.parseArray(jsonStr,Person.class);*/
        /*for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getAge());
        }
*/
        /*for(Person person:list){
            System.out.print(person.getAge());
            System.out.print(person.getName());
        }*/
       /*Iterator<Person> iterator = list.iterator();
       for(;iterator.hasNext();){
           Person person =iterator.next();
           System.out.println(person.getName());
           System.out.println(person.getAge());
//           System.out.println(iterator.next().getName());
       }*/
      /*List<Person> list =new ArrayList<>(2);
       Person p1=new Person("zs1",18);
       Person p2=new Person("zs2",18);
       Person p3=new Person("zs3",18);
       Person p4=new Person("zs4",18);

       list.add(p1);
       list.add(p2);
       list.add(p3);
       list.add(p4);
       for (int i=0;i<list.size();i++){
           System.out.println(list.get(i).getName());
       }
*/
    /**
     以正确的顺序返回一个包含此列表中所有元素的数组（从第一个到最后一个元素）; 返回的数组的运行时类型是指定数组的运行时类型。
     */
    /*public Object[] toArray() {
        //elementData：要复制的数组；size：要复制的长度
        return Arrays.copyOf(elementData, size);
    }*/
/*
        Object[] ss = list.toArray();
        for (int i=0;i<ss.length;i++){
            System.out.println(ss[i]);
        }*/
//        System.out.println(ss.length);

/*
        int[] a = new int[3];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        int[] b = Arrays.copyOf(a, 10);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i] +",");
        }*/

        /*{
            int x = 3;
            System.out.println("普通代码块内的变量x=" + x);
        }

        int x = 1;
        System.out.println("主方法内的变量x=" + x);

        {
            int y = 7;
            System.out.println("普通代码块内的变量y=" + y);
        }*/

        /*
         * 运行结果  普通代码块内的变量x=3
         *      主方法内的变量x=1
         *      普通代码块内的变量y=7
         */

//        Cookie

        /*String ss ="abcd";
        for(int i=0;i<ss.length();i++){
            System.out.println(ss.charAt(i));
        }*/

       /* StringBuilder stringBuilder=new StringBuilder("abcdefg");
        stringBuilder.delete(0,3);
        System.out.println(stringBuilder);*/

//       String str ="abcdabcd";
//       String ss =str.substring(5);
//       System.out.println(ss);


//       List<String> list = Arrays.asList("a","b","c");
//        List<String> list = new ArrayList<>();
        List<String> list = new CopyOnWriteArrayList<>();

//        List<String> list = Collections.synchronizedList(new ArrayList<>());

        /*for (int i=1;i<=30;i++){
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },"threadA").start();
        }

*/
       /* BlockingQueue<String> queue =new ArrayBlockingQueue<>(3);

        System.out.println(queue.add("a"));
        System.out.println(queue.add("b"));
        System.out.println(queue.add("c"));


        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());*/

        ClassLoader appCl = Person.class.getClassLoader();
        ClassLoader extCl = appCl.getParent();
        ClassLoader bootCl = extCl.getParent();
        System.out.println(appCl);
        System.out.println(extCl);
        System.out.println(bootCl); // 返回：null ，对java 不可见

        Person person = new Person("12",18);


    }
}
