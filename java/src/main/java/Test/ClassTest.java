package Test;


//import com.sun.java.util.jar.pack.Package;

import jodd.util.StringUtil;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 反射机制的demo
 */
public class ClassTest {

    private Field[] fields;

    public static void main(String[] args) {
        /*Book book =new Book();
        Class clazz  = book.getClass();
        System.out.println(clazz);*/
//        Class book = Book.class;
        /*try {
            Class c2 = Class.forName("Test.Book");
            Constructor ct1 =  c2.getConstructor(int.class, String.class,String.class);
            System.out.println(ct1.newInstance(1,"zhangfei","ddddd"));
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        /*try {
            Class c2 = Class.forName("Test.Student");
//            System.out.println(c2.newInstance());
            Constructor ct1 =  c2.getConstructor(Integer.class,String.class,String.class);
            System.out.println(ct1.newInstance(6, "name", "43"));
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*Field[] arr = clazz.getDeclaredFields();
        System.out.println(clazz);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        String aa= "D:\\deskTop\\1217上线内容.txt";
//        String bb= "";

        File file = new File(aa);
        if(file.exists()){
            System.out.println("dsds");
        }
        System.out.println("dfsd");

    }

}
