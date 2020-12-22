package Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestField {

	public static void main(String[] args) throws Exception {
		
		//1.使用原始方式来获取成员变量的数值并打印出来
		Person p1 = new Person("zhangfei", 30);
		//System.out.println("获取到的姓名是：" + p1.name); //zhangfei
		System.out.println("获取到的姓名是：" + p1.getName()); //zhangfei
		//使用原始方式修改成员变量的数值后再次打印
		//p1.name = "guanyu";
		//System.out.println("修改后的姓名是：" + p1.name); //guanyu
		p1.setName("guanyu");
		System.out.println("修改后的姓名是：" + p1.getName()); //guanyu
		
		System.out.println("----------------------------------------");
		//2.使用反射机制来获取成员变量的数值并打印出来
		//2.1 获取Person类型的Class对象，调用forName方法
		Class c1 = Class.forName("Test.Person");
		//2.2 获取Person类型的有参构造方法，调用getConstructor方法
		Constructor ct1 = c1.getConstructor(String.class, int.class);
		//2.3 使用获取到的有参构造方法来构造对象并记录
		Object obj = ct1.newInstance("zhangfei", 30);
		//2.4 获取Person类型的成员变量name，调用getDeclaredField方法
		Field f1 = c1.getDeclaredField("name");
		//接下来进行暴力反射
		f1.setAccessible(true);
		//2.5 获取Person对象中成员变量name的数值并打印出来
		System.out.println("获取到的姓名是：" + f1.get(obj)); //zhangfei
		//2.6 修改Person对象中成员变量name的数值并打印出来
		f1.set(obj, "guanyu");
		System.out.println("修改后的姓名是：" + f1.get(obj)); //guanyu
	}

}
