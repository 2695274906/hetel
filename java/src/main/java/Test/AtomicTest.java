package Test;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger();
        Runnable mr = () -> {
            for (int i = 0; i < 1000; i++) {
                atomicInteger.incrementAndGet();
            }
        };
        ArrayList<Thread> ts = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(mr);
        }
    }
}