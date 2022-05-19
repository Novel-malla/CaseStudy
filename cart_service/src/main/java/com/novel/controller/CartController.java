package com.novel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.novel.model.Cart;
import com.novel.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController  {

	@Autowired
	private CartService cartService;

	@PostMapping("/add")
	public Cart addCartById(@RequestBody Cart cart) {
		return this.cartService.addCart(cart);
	}

	@GetMapping("/get")
	public ResponseEntity<?> getAllCart(){
		return ResponseEntity.ok(this.cartService.getAllCart());
	}

	@GetMapping("/get/user/{userid}")
	public Cart getCartByUserId(@PathVariable("userid") int userId) {
		return this.cartService.getCartByUserId(userId);
	}

	@GetMapping("/get/{id}")
	public Cart getCartById(@PathVariable("id") int id) {
		return this.cartService.getCartByProductId(id);
	}

	@DeleteMapping("/del/{id}")
	public int deleteById(@PathVariable("id") int id) {
		this.cartService.deleteById(id);
		return id;
	}
}
