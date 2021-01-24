package Thread;

import Test.Book;

import java.util.concurrent.*;

public class NewFixedThreadPoolTest {
    // 创建一个可缓存线程池
    private final ExecutorService executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
            60L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());

    public  Book  thread(Book book){
        executorService.execute(new Runnable() {

            public void run() {
                for(int i=0;i<10;i++){
                    // 打印正在执行的缓存线程信息
                    System.out.println(Thread.currentThread().getName()
                            + "正在被执行");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        book.setPrice(10);
        return book;
    }




    public static void main(String[] args) {

        NewFixedThreadPoolTest newCachedThreadPoolTest = new NewFixedThreadPoolTest();
        Book book = new Book("三国","张三");
        Book b1 = newCachedThreadPoolTest.thread(book);
        System.out.println(b1.getPrice());

    }
}
