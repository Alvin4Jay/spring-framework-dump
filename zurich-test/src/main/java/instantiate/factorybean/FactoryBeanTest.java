package instantiate.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * class description here.
 *
 * @author xuanjian
 */
public class FactoryBeanTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("factorybean/factorybean.xml");

		Person person = (Person) ctx.getBean("person");

		System.out.println(person);
	}
}
