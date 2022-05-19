package com.novel.service;

import java.util.List;

import com.novel.model.Order;
public interface OrderService {
	public Order addOrder(Order order);

	public List<Order> getAllOrders();

	public void deleteOrder(int orderId);

	public Order getOrderByCustomerId(int customerId);

	public Order getAddressByCustomerId(int customerId);

	public Order getOrderById(int orderId);
}
