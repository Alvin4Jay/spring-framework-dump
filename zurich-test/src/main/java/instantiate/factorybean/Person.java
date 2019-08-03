package instantiate.factorybean;

/**
 * class description here.
 *
 * @author xuanjian
 */
public class Person {

	private int age;

	private double salary;

	public Person() {
	}

	public int getAge() {
		return age;
	}

	public Person(int age, double salary) {
		this.age = age;
		this.salary = salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
