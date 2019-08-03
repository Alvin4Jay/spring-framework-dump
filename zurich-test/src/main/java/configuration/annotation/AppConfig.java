package configuration.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuanjian
 */
//@Configuration
public class AppConfig {

	@Bean
	public Spring spring() {
		return new Spring();
	}

}
