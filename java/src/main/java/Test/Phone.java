package Test;


public class Phone {
       /* public  synchronized  void methodA(){
            try{
                TimeUnit.SECONDS.sleep(4);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("--send_eamil");
        }
        public  synchronized  void methodB(){
            System.out.println("--send_sms");
        }
        public  void hello(){
            System.out.println("--hello");
        }*/


    public static void main(String[] args) {
        /*Phone phone1 =new Phone();
        Phone phone2 =new Phone();

            new Thread(()->{
                phone1.methodA();

            },"A").start();
            new Thread(()->{
                phone2.methodB();
//                phone1.hello();

            },"B").start();
*/


        //单线程环境下没问题
        /*List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (String s : list) {
            System.out.println(s);
        }*/

        /* new Thread(()->{
             List<String>  list=new ArrayList<>();
             list.add(UUID.randomUUID().toString().substring(0,8));
             for (String ss:list){
                 System.out.println(ss);
             }
         }).start();*/
       /* for(int i=0;i<3;i++){
            Set<String> ss =new HashSet<>();
            ss.add("业务"+i);
            String aa =StringUtil.join(ss,",");
            Person  person = new Person();
            person.setUrl(aa);
            String sss=person.getUrl().trim();
            System.out.print(sss);
        }*/
        /*Person person = new Person();
        person.setUrl(aa);*/

        /*String str = "123,";
        System.out.println(str.length());
        System.out.println(str.substring(0,str.length()-1));*/

        /*byte[] b={97,98,99,100,101,102};
        String str=new String(b,3,2);
        System.out.println("字节数组中第3位开始，取2个的结果是："+str);
        char ss = str.charAt(0);
        System.out.println("字符串下标为0的字符是："+ss);
        byte[] bytes= str.getBytes();
        for (int i=0;i<bytes.length;i++){
            System.out.println("将字符串转换为字节数组然后遍历出来的结果是："+bytes[i]);
        }*/


        /*String aa ="河南";
        if (aa.equals("河南")){
            System.out.println("相等");
        }else {
            System.out.println("不等");
        }*/

       /* String a=new String("abc");
        String b=new String("abc");
        System.out.println(a.equals(b));*/
        /*List<String> userlist = new ArrayList<String>();
        userlist.add("yulon");
        userlist.add("xiaoyun");
        userlist.add("羽龙共舞");
        System.out.println("使用普通for循环:");
        for(int i=0; i<userlist.size(); i++){
            System.out.print("结果1："+userlist.get(i)+" ");
        }


        System.out.println("使用Iterator迭代器:");
        Iterator it = userlist.iterator();
        while(it.hasNext()){
            String ss = (String)it.next();
            System.out.println(ss);
        }

        System.out.println("使用增强for循环:");
        for(String s : userlist){
            System.out.print("结果3："+s+" ");
        }
*/

       /* String province="河南2";
        String city="淮安2";
        if(!"河南".equals(province)&&!"淮安".equals(city)){
            System.out.println("显示省份");
        }else {
            System.out.println("显示城市");
        }*/
       /*Class tt =Phone.class;
       System.out.println(tt);

       Phone phone = new Phone();
       Class ss = phone.getClass();
        System.out.println(ss);
        try {
            Class gg = Class.forName("java.lang.Thread");
            System.out.println(gg.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/


       /* final Student id = new Student(Integer.valueOf(10), "liqiang", "array");

        System.out.println(id);
        Student stu=id;

        stu.setAge(Integer.valueOf(110));

        //这里的id指向student对象，stu也指向这个对象。如果只不能改变，那么就是说使用stu改变age也是错误的了。
        System.out.println(stu);
        System.out.println(stu==id);*/

        /*String s1 = "abc";
        String s2 = "abc";
        String s3= new String("abc");
        String s4="ab"+"c";
        System.out.println(s1==s2);//true
        System.out.println(s1==s4);


        System.out.println("s1 == s2 ? "+(s1==s2)); //true
        System.out.println("s1 == s3 ? "+(s1==s3)); //false
        System.out.println("s1 equals s3 ? "+(s1.equals(s3))); //true*/



    }



}
