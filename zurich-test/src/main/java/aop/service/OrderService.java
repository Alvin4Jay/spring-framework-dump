package aop.service;

import aop.model.Order;

/**
 * @author xuanjian
 */
public interface OrderService {

	Order createOrder(String username, String product);

	Order queryOrder(String username);

}
