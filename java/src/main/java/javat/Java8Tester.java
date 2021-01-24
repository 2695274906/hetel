package javat;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.SortedMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Tester {
    final static String salutation = "Hello! ";


    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    public void mystery(int x) {
        System.out.print(x % 10);

        if ((x / 10) != 0) {
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }

    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    private String name = "abc";

    public static void main(String args[]) {
       /* final  int a=1;
        Converter<Integer, String> ss =param->{
            System.out.println(param+a);
        };

        ss.convert(3);*/


       /* Random random = new Random();
        random.ints().limit(3).forEach(System.out::println);
*/
       /* List<Integer> numbers = Arrays.asList(3, 2, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);


        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long count = strings.stream().filter(string -> !string.isEmpty()).count();
        System.out.println(count);
*/

       /* List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true

        System.out.println("输出所有数据:");

        // 传递参数 n
        eval(list, n->true);*/

        Java8Tester java8Tester = new Java8Tester();
        java8Tester.mystery(1234);


        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }


    }


}







    /*public interface Converter<T1, T2> {
        void convert(int i);
    }*/


   /* private Test test;
    Test testB = new Test();
    String result = test.equals(testB) + ",";
    result += test.name.equals(testB.name) + ",";
    result += test.name == testB.name;
        System.out.println(result);*/






