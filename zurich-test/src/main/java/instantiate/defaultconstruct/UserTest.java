package instantiate.defaultconstruct;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * UserTest
 *
 * @author xuanjian
 */
public class UserTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("defaultconstruct/user.xml");
		// context.addBeanFactoryPostProcessor();
		// context.getBeanFactory().addBeanPostProcessor();
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
