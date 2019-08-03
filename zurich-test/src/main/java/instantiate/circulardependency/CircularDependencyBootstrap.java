package instantiate.circulardependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean循环依赖
 *
 * @author xuanjian
 */
public class CircularDependencyBootstrap {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("circulardependency/beancirculardependency.xml");

		context.getBean("beanA");


	}

}
