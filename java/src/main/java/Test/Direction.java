package Test;

public enum Direction {

    FRONT("front11"), BEHIND(), LEFT("left66"), RIGHT("right33");
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*Direction(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    //[枚举类的构造器不可以添加访问修饰符，枚举类的构造器默认是private的。但你自己不能添加private来修饰构造器。
    Direction(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
//        Direction d = Direction.FRONT;
        /*Direction d = Direction.LEFT;
        Direction direction= Direction.BEHIND;
        System.out.println(direction);


        switch(d) {
            case FRONT: System.out.println("前面");break;
            case BEHIND:System.out.println("后面");break;
            case LEFT:  System.out.println("左面");break;
            case RIGHT: System.out.println("右面");break;
            default:System.out.println("错误的方向");
        }
        String ss = d.getName();
        int aa =  d.getAge();
        System.out.println(ss);
        System.out.println(aa);*/

        int[]  ii =new int[4];
        System.out.println(ii.length);

    }

}