package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CardTest {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("java/src/main/applicationContext.xml");
        CardTest card = app.getBean("player", CardTest.class);
        System.out.println(card);



    }


}