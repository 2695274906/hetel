package Thread;



import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 使用ForkJoinPool案例
 */


public class MyTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 10;
    private int start;
    private int end;
    private int result;


    public MyTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    protected Integer compute() {
        if(end - start <= THRESHOLD)
        {
            for(int i=start;i<=end;i++){
                 result = result+i;
            }
        }else {
            int middle =(start+end)/2;
            MyTask myTask01 = new MyTask(start, middle);
            MyTask right = new MyTask(middle+1, end);
            //并行执行两个“小任务”
            myTask01.fork();
            right.fork();
            result=myTask01.join()+right.join();
        }
        return result;

    }



    public static void main(String[] args) throws Exception{

        MyTask myTask =new MyTask(0,10);


        ForkJoinPool forkJoinPool =new ForkJoinPool();

        ForkJoinTask<Integer> forkJoinTask = forkJoinPool.submit(myTask);
        System.out.println(forkJoinTask.get());


        forkJoinPool.shutdown();


    }
}
