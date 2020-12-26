package Test;

public class PersonTest {

   /* static void changeNames(Person person){

        person.setName("ddddd");
    }*/

    /*static  void  changInt(int xeee){
        xeee=56;
    }*/


    private static void changeStr(String str) {
        str="lllll";
    }

    public static void main(String[] args) {
        /*Person person =new Person("ss",20);
        changeNames(person);
        System.out.println(person.getName());*/

       /* int xeee=5;
        changInt(xeee);
        System.out.println(xeee);*/

       String str="abc";
       changeStr(str);
        System.out.println(str);

        System.out.println(Runtime.getRuntime().availableProcessors()+"核");

    }

}
