package aop.service.impl;

import aop.model.User;
import aop.service.UserService;

/**
 * @author xuanjian
 */
public class UserServiceImpl implements UserService {

	private User user;

	@Override
	public User createUser(String firstName, String lastName, int age) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		return user;
	}

	@Override
	public User queryUser() {
		User user = new User();
		user.setFirstName("test");
		user.setLastName("test");
		user.setAge(20);
		return user;
	}

}
