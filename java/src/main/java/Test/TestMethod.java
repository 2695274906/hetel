package Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class TestMethod {

	public static void main(String[] args) throws Exception {
		
		//1.使用原始方式构造对象并调用getName方法
		Person p1 = new Person("zhangfei", 30);
		System.out.println("获取到的姓名是：" + p1.getName()); //zhangfei
		//修改姓名并再次获取打印
		p1.setName("guanyu");
		System.out.println("修改后的姓名是：" + p1.getName()); //guanyu
		
		System.out.println("------------------------------------------");
		//2.使用反射机制构造对象并调用getName方法
		//2.1 获取Person类型的Class对象，调用forName方法
		Class c1 = Class.forName("Test.Person");
		//2.2 获取Person类型的有参构造方法，调用getConstructor方法
		Constructor ct1 = c1.getConstructor(String.class, int.class);
		//2.3 使用获取到的有参构造方法来构造Person类型的对象并记录
		Object obj = ct1.newInstance("zhangfei", 30);
		//2.4 获取Person类型的成员方法getName，调用getMethod方法
		Method m1 = c1.getMethod("getName");
		//2.5 使用获取到的成员方法来获取姓名并打印出来
		System.out.println("获取到的姓名是：" + m1.invoke(obj)); //zhangfei
		//2.6 获取Person类中的成员方法setName，调用getMethod方法
		Method m2 = c1.getMethod("setName", String.class);
		//2.7 使用获取到的成员方法来修改姓名
		Object res = m2.invoke(obj, "guanyu");
		System.out.println("方法调用的返回值是：" + res); //null
		//2.8 再次获取修改后的姓名并打印出来
		System.out.println("修改后的姓名是：" + m1.invoke(obj)); //guanyu
	}

}
