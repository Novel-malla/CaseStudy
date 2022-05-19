package com.novel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.novel.model.Order;
import com.novel.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Order addOrder(Order order) {
		return this.orderRepository.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		return this.orderRepository.findAll();
	}



	@Override
	public void deleteOrder(int orderId) {
		this.orderRepository.deleteById(orderId);
	}

	@Override
	public Order getOrderByCustomerId(int customerId) {
		return this.orderRepository.findById(customerId).get();
	}


	@Override
	public Order getAddressByCustomerId(int customerId) {
		return this.orderRepository.findById(customerId).get();
	}



	@Override
	public Order getOrderById(int orderId) {
		return this.orderRepository.findById(orderId).get();
	}

}
