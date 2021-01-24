package jdk8新特性;

public interface InterfaceDefault {

    default void test01(){
        return;
    }





}

class BB implements  InterfaceDefault{

    @Override
    public void test01(){
        System.out.println("我是接口BB");
    }


    public static void main(String[] args) {
        BB bb = new BB();
        bb.test01();


        CC cc =new CC();
        cc.test01();
    }

}


class  CC implements  InterfaceDefault{


    @Override
    public void test01() {
        System.out.println("我是cc接口自定义方法");
    }
}