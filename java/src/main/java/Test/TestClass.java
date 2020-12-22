package Test;

public class TestClass {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//1.使用数据类型.class的方式可以获取对应类型的Class对象。
		Class c1 = String.class;
		//自动调用toString方法 
		System.out.println("c1 = " + c1); //class java.lang.String
		c1 = int.class;
		System.out.println("c1 = " + c1); //int
		c1 = void.class;
		System.out.println("c1 = " + c1); //void
		
		System.out.println("---------------------------------------");
		//2.使用引用/对象.getClass()的方式可以获取对应类型的Class对象。
		String s1 = new String("hello");
		c1 = s1.getClass();
		System.out.println("c1 = " + c1); //class java.lang.String
		
		Integer it = new Integer("123");
		c1 = it.getClass();
		System.out.println("c1 = " + c1); //class java.lang.Integer
		
		int num = 10;
		//c1 = num.getClass();  error
		
		System.out.println("----------------------------------------");
		//3.使用包装类.TYPE的方式可以获取对应基本数据类型的Class对象。
		c1 = Integer.TYPE;
		System.out.println("c1 = " + c1); //int
		c1 = Integer.class;
		System.out.println("c1 = " + c1); //class java.lang.Integer
		
		System.out.println("----------------------------------------");
		//4.使用Class.forName()的方式来获取参数指定类型的Class对象。
		//不能省略包名，连java.lang也不许省略
		c1 = Class.forName("java.lang.String");
		System.out.println("c1 = " + c1); //class java.lang.String
		//c1 = Class.forName("int"); error 
		//System.out.println("c1 = " + c1);
		
		//练习：编程实现Person类的封装，特征有：姓名和年龄
		//      编程实现Person类的测试，在main方法中使用无参方式构造对象并打印


	}

}
