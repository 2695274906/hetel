package quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class PrintWordsJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String printTime = new SimpleDateFormat("yy-MM-dd HH-mm-ss").format(new Date());
        System.out.println("PrintWordsJob start at增强识别度:" + printTime + ", prints: Hello Job啊范德萨范德萨安抚-" + new Random().nextInt(100));
    }
}
