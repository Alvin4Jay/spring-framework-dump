package aop.service;

import aop.model.User;

/**
 * @author xuanjian
 */
public interface UserService {

	User createUser(String firstName, String lastName, int age);

	User queryUser();

}
