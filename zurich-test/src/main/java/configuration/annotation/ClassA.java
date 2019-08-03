package configuration.annotation;

import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Date;

/**
 * @author xuanjian
 */
@Configuration
@PropertySource("classpath:props.properties")
@ComponentScan(basePackages = {"configuration.annotation"})
@Import(TeacherImportSelector.class)
public class ClassA extends ClassB implements ClassC {

	@Import(ImportBeanDefinitionRegistrarTest.class)
	public class ClassE extends ClassF {

		@Bean
		public Date date() {
			return new Date();
		}

	}

	@Bean
	public Student student() {
		return new Student();
	}

	@Bean
	public String aa() {
		student();
		return "aa";
	}

}

@Configuration
class ClassB {

	@Bean
	public String helloWorld() {
		return "hello, world";
	}

}

interface ClassC {

	@Bean
	default int defaultMethod() {
		return 0;
	}

}

class ClassF {

	@Bean
	public String sayHi() {
		return "hi";
	}

}

class TeacherImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{Teacher.class.getName(), Student.class.getName()};
	}
}

class ImportBeanDefinitionRegistrarTest implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Driver.class);
		BeanDefinitionReaderUtils.registerWithGeneratedName(beanDefinition, registry);
	}
}
