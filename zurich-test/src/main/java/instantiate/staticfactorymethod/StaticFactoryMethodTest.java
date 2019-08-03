package instantiate.staticfactorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 静态工厂测试
 *
 * @author xuanjian
 */
public class StaticFactoryMethodTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("staticfactorymethod/clientservice.xml");

		ClientService clientService = (ClientService) ctx.getBean("clientService");

		System.out.println(clientService);

	}
}
