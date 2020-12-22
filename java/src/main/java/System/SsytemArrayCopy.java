package System;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class SsytemArrayCopy {
    public static void main(String[] args) {
        User [] users=new User[]{new User(1,"admin","admin@qq.com"),new User(2,"maco","maco@qq,com"),new User(3,"kitty","kitty@qq,com")};//初始化对象数组
        User [] target=new User[users.length];//新建一个目标对象数组
        System.arraycopy(users, 0, target, 0, users.length);//实现复制
        System.out.println("源对象与目标对象的物理地址是否一样："+(users[0] == target[0]?"浅复制":"深复制"));
        target[0].setEmail("admin@sina.com");
        System.out.println("修改目标对象的属性值后源对象users：");
        for (User user : users){
            System.out.println(user);
        }

//        PropertyPlaceholderConfigurer
    }
}

