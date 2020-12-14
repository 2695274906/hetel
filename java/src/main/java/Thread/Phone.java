package Thread;

public class Phone {


    public static  synchronized  void sendEmail() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sendEmail");
    }
    public static synchronized void sendSms(){
        System.out.println("sendSms");
    }
    public void Hello(){
        System.out.println("hello");
    }
    public static void main(String[] args){

        Phone phone1 =new Phone();
        Phone phone2 =new Phone();
        new Thread(()->{
            phone1.sendEmail();
        },"A").start();
        new Thread(()->{

            phone2.sendSms();
//            phone1.Hello();
        },"B").start();

    }


}
