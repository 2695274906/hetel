package Thread;

public class ConcurrentQueue {
    public static void main(String[] args){
        ToyotaYQ yq = new ToyotaYQ();
        new Thread(yq,"ToyotaYQ_001").start();
        new Thread(yq,"ToyotaYQ_002").start();
        new Thread(yq,"ToyotaYQ_003").start();
    }

}
