package bean;


/*import lombok.Data;
import lombok.experimental.Accessors;*/

import java.util.function.Function;

/*@Data
@Accessors(chain = true)*/

//maintest更新了1111
//maintest更新了000
public class Book {

    //tttt
    private  int id;
    private  String bookName;
    private  double price;

    public static void main(String[] args) {

        /*Book book1 =new Book();

        book1.setId(11).setBookName("java").setPrice(11);

        System.out.println(book1.toString());*/

       /* Function<String,Integer> function =new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }

        };
        System.out.println(function.apply("fff"));*/

       Function<String,Integer> function=s->{ return  s.length();};


        System.out.println(function.apply("fad"));


    }
}
