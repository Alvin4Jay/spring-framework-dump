package aop;

import aop.service.OrderService;
import aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring AOP使用实例，版本演进
 *
 * @author xuanjian
 * @see <a href="https://www.javadoop.com/post/spring-aop-intro">Spring AOP 使用介绍，从前世到今生</a>
 */
public class Application {

	public static void main(String[] args) {

//		spring_1_2_advice();
//		spring_1_2_advisor();
//		spring_1_2_BeanNameAutoProxy();
//		spring_1_2_DefaultAdvisorAutoProxy();
//		spring_2_0_AspectJ();
//		test_Spring_2_0_Schema_Based();
		test_Spring_2_0_Schema_Based2();
	}

	private static void spring_1_2_advice() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/spring_1_2_advice.xml");

		// 我们这里要取 AOP 代理：userServiceProxy，这非常重要
		UserService userService = (UserService) context.getBean("userServiceProxy");

		userService.createUser("Tom", "Cruise", 55);
		userService.queryUser();
	}

	private static void spring_1_2_advisor() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/spring_1_2_advisor.xml");

		// 我们这里要取 AOP 代理：userServiceProxy，这非常重要
		UserService userService = (UserService) context.getBean("userServiceProxy");

		userService.createUser("Tom", "Cruise", 55);
		userService.queryUser();
	}

	private static void spring_1_2_BeanNameAutoProxy() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/spring_1_2_BeanNameAutoProxy.xml");

		// 注意这里，不再需要根据代理找 bean
		UserService userService = context.getBean(UserService.class);
		OrderService orderService = context.getBean(OrderService.class);

		userService.createUser("Tom", "Cruise", 55);
		userService.queryUser();

		orderService.createOrder("Leo", "随便买点什么");
		orderService.queryOrder("Leo");
	}

	private static void spring_1_2_DefaultAdvisorAutoProxy() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/spring_1_2_DefaultAdvisorAutoProxy.xml");

		UserService userService = context.getBean(UserService.class);
		OrderService orderService = context.getBean(OrderService.class);

		userService.createUser("Tom", "Cruise", 55);
		userService.queryUser();

		orderService.createOrder("Leo", "随便买点什么");
		orderService.queryOrder("Leo");
	}

	private static void spring_2_0_AspectJ() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/spring_2_0_aspectj.xml");

		UserService userService = context.getBean(UserService.class);

		userService.createUser("Tom", "Cruise", 55);
		userService.queryUser();
	}

	public static void test_Spring_2_0_Schema_Based() {

		// 启动 Spring 的 IOC 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/spring_2_0_schema_based.xml");

		UserService userService = context.getBean(UserService.class);

		userService.createUser("Tom", "Cruise", 55);
	}

	public static void test_Spring_2_0_Schema_Based2() {

		// 启动 Spring 的 IOC 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/spring_2_0_schema_based2.xml");

		UserService userService = context.getBean(UserService.class);

		userService.createUser("Tom", "Cruise", 55);
	}


}
