package instantiate.instancefactroymethod;

import instantiate.staticfactorymethod.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 静态工厂测试
 *
 * @author xuanjian
 */
public class InstanceFactoryMethodTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("instancefactroymethod/defaultservicelocator.xml");

		ClientService clientService = (ClientService) ctx.getBean("clientService");

		System.out.println(clientService);

	}
}
