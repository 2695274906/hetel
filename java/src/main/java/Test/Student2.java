package Test;

public class Student2 {

    private int age;
    private int count;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Student2(int age, int count) {
        this.age = age;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
    public  int hashCode(int age){
        return  age;
    }

    public Student2(int age) {
        this.age = age;
    }
}
