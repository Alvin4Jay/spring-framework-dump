package instantiate.autowireconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * class description here.
 *
 * @author xuanjian
 */
public class AutowireConstructorTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("autowireconstructor/autowireconstructor.xml");
		ExampleBean exampleBean = (ExampleBean) ctx.getBean("exampleBean");
		System.out.println(exampleBean);
	}
}
