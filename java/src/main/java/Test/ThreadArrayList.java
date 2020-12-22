package Test;

import javassist.compiler.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadArrayList {

    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        List<String> list1 = Arrays.asList("a","b","c");
//        list1.forEach((a)-> System.out.println(a));
        //流式i接口
        list1.stream().forEach(System.out::println);

    }

}
