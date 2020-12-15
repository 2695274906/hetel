package Test;


import java.io.*;


public class MyTest  implements Serializable{

    private static final long serialVersionUID = 1L;
    private  String name="SheepMu";
    private transient int age=24;
    private Book book=new Book();
    public  static void fan()// 反序列的过程
    {
        ObjectInputStream oin = null;//局部变量必须要初始化
        try
        {
            oin = new ObjectInputStream(new FileInputStream("D:\\test\\my1.out"));
        } catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        } catch (IOException e1)
        {
            e1.printStackTrace();
        }
        MyTest mts = null;
        try {
            mts = (MyTest ) oin.readObject();//由Object对象向下转型为MyTest对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("name:"+mts.name);
        System.out.println("age:"+mts.age);
        System.out.println("book:"+mts.book.getName());
    }
    public static void main(String[] args) {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\test\\my1.out"));//输出流保存的文件名为 my.out ；ObjectOutputStream能把Object输出成Byte流
            MyTest myTest=new MyTest();
            oos.writeObject(myTest);
            oos.flush();  //缓冲流
            oos.close(); //关闭流
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("success");
        fan();
    }

}