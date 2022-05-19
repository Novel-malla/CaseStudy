package com.novel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 import com.novel.model.Order;
 import com.novel.service.OrderService;
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/addorder")
	public Order addOrder(Order order) {
		return this.orderService.addOrder(order);
	}

	@GetMapping("/getorders")
	public ResponseEntity<?>  getAllOrder(){
		return ResponseEntity.ok(this.orderService.getAllOrders());
	}

	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable int id) {
		return this.orderService.getOrderById(id);
	}

	@GetMapping("/ordercustid/{id}")
	public Order getOrderByCustomerId(@PathVariable int id) {
		return this.orderService.getOrderByCustomerId(id);
	}

	@GetMapping("/address/{id}")
	public Order getAddressByCustomerId(@PathVariable int id) {
		return this.orderService.getAddressByCustomerId(id);
	}

	@DeleteMapping("/delete/{id}")
	public int deleteOrderById(@PathVariable int id) {
		this.orderService.deleteOrder(id);
		return id;
	}

}
