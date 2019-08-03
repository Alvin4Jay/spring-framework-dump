package configuration.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xuanjian
 */

public class AllConfigTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(ClassA.class);

		context.refresh();
		context.getBean("date");
		context.getBean("helloWorld");
		context.getBean("sayHi");
		context.getBean(Driver.class);
		System.out.println(context.getBean("user"));
		context.getBean("student");
		context.getBean("configuration.annotation.Teacher");
		context.getBean("student"); // 检查配置类是否被CGLIB增强，即是否返回同一单例

	}

}