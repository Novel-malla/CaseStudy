package com.novel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 import com.novel.model.Order;
 import com.novel.service.OrderService;
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/addorder")
	public ResponseEntity<String> addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/getorders")
	public ResponseEntity<?>  getAllOrder(){
		return ResponseEntity.ok(this.orderService.getAllOrders());
	}

	@GetMapping("/getorders/{orderId}")
	public Order getOrderById(@PathVariable int orderId) {
		return this.orderService.getOrderById(orderId);
	}

	@GetMapping("/getorders/ordercustid/{customerId}")
	public Order getOrderByCustomerId(@PathVariable int customerId) {
		return this.orderService.getOrderByCustomerId(customerId);
	}

	@GetMapping("/getorders/address/{customerId}")
	public Order getAddressByCustomerId(@PathVariable int customerId) {
		return this.orderService.getAddressByCustomerId(customerId);
	}

	@DeleteMapping("/getorders/delete/{orderId}")
	public int deleteOrderById(@PathVariable int orderId) {
		this.orderService.deleteOrder(orderId);
		return orderId;
	}

}
