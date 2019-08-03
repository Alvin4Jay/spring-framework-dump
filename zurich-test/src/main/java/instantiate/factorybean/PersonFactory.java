package instantiate.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean
 *
 * @author xuanjian
 */
public class PersonFactory implements FactoryBean<Person> {

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public Person getObject() throws Exception {
		return new Person(10, 1000.0);
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}
}
