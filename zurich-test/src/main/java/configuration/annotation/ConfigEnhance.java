package configuration.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuanjian
 */
//@Configuration
public class ConfigEnhance {


	@Bean
	public Student student() {
		return new Student();
	}

	@Bean
	public Teacher teacher() {
		student();
		return new Teacher();
	}

}
