package Thread;

import bean.Book;
import com.mchange.v1.util.CollectionUtils;
import jodd.util.CollectionUtil;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

@Accessors(chain = true)
public class ThreadPoorTest {

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(
                0,
                Integer.MAX_VALUE,
                60L,
                TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>()
                );

        List<Book> bookList=new ArrayList<>();

        Book book = new Book();
        book.setPrice(10.0).setBookName("ss").setId(1);

        bookList.add(book);
        if(bookList != null && bookList.size() > 0){
            executorService.execute(()->{
                for(int i=0;i<10;i++){
                    book.setBookName("sadsf");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"\t办理业务");
                }
            });
            executorService.shutdown();
        }


       /* new Thread(()->{

            System.out.println(Thread.currentThread().getName()+"再打我");
        }).start();*/

        System.out.println(Thread.currentThread().getName()+"先打我"+bookList);
    }
}
