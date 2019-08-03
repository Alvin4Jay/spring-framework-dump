package configuration.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xuanjian
 */
@Component
public class User {

	@Value("${name}")
	private String name;

	@Value("${age}")
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
