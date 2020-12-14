package Test;

public class Student {
    private  Integer age;
    private  String name;
    private  String type;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Student(Integer age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }
}
