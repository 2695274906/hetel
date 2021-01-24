package Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.json.JSONArray;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book{

    /**
     * @author lune 
     */

    private int id;
    private String name;
    private String author;
    private int year;
    private double price;
//    private Map<String,Integer> statusCount;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }


    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }
    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }


    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book(int id, String name, String author, int year, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }



    public static void main(String[] args) {
        Book book = new Book("na","sdd");
        book.setAuthor("1");
        book.setId(2);
        book.setName("三国演义");
        book.setPrice(100);
        book.setYear(2020);

        String bookStr =book.toString();
        System.out.println("p"+bookStr);

        Book  book2  =JSONObject.parseObject(bookStr,Book.class);

        System.out.println(book2.getPrice());





        /*Object obj = JSONArray.toJSON(p);
        String json = obj.toString();
        System.out.println("将Person对象转成json:" + json);*/
  /*      List<Book> list = new ArrayList<>();
        Map<String,Object> mapList = new HashMap<>();
        mapList.put("作者",book.author);
        mapList.put("书名",book.name);
        mapList.put("价格",book.price);
       list.add(book);
//        String list2= JSON.toJSONString(list);
        JSONArray jsonArray=new JSONArray(list);
        System.out.println(jsonArray.toString());
//        System.out.println(list2);
        String jsonStr = JSONObject.toJSONString(list);
        System.out.println(jsonStr);*/
    }
}