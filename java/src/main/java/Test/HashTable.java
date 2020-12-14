package Test;

public class HashTable {

    private Student2[] data=new Student2[100];

    /**
     * 放值
     */

    public void put(Student2 stu){
        int index = stu.hashCode(stu.getAge());
        data[index]=stu;
    }
    /**
     * 获取值
     */

    public  Student2 get(Student2 stu){

        return  data[stu.hashCode(stu.getAge())];
    }
}

