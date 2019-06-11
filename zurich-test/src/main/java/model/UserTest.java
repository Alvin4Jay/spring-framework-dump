package model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class description here.
 *
 * @author xuanjian
 */
public class UserTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
         // context.addBeanFactoryPostProcessor();
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
}
