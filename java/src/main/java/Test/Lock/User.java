package Test.Lock;

public class User {

    private int id;
    private boolean flag;
    private Integer age = 1;
    private boolean[] arr = {false};

    public User(Integer age) {
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
