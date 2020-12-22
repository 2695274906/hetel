package lock;

public class ReentranLock {


    public  synchronized  void methodA(){
        System.out.println("进入methodA");
        methodB();
    }

    private synchronized void methodB() {
        System.out.println("进入methodB");
    }

    public static void main(String[] args) {

    }
}
