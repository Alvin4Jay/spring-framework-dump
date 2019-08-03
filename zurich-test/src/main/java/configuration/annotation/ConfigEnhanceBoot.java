package configuration.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xuanjian
 */
public class ConfigEnhanceBoot {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(ConfigEnhance.class);

		context.refresh();
		context.getBean("student");
		context.getBean("teacher");
		context.getBean("student");

	}

}
