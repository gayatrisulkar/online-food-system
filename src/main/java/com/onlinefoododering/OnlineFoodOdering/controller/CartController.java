package com.onlinefoododering.OnlineFoodOdering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinefoododering.OnlineFoodOdering.exception.ResourceNotFoundException;
import com.onlinefoododering.OnlineFoodOdering.model.Cart;
import com.onlinefoododering.OnlineFoodOdering.service.CartService;



@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1") 
@RestController
public class CartController {
	@Autowired
	CartService cartService;

//http://localhost:9080/api/v1/getAllCart
	@GetMapping("/getAllCart")
	public List<Cart> getCart() {
		List<Cart> cartList = cartService.fetchCart();

		return cartList;

	}

	// http://localhost:8080/api/v1/getCart/1
	@GetMapping("/getCart/{user_id}")
	public ResponseEntity<Cart> getCartById(@PathVariable("user_id") int user_id)
			throws ResourceNotFoundException {
		Cart cart = cartService.getCart(user_id);
		return ResponseEntity.ok().body(cart);
	}

	// http://localhost:8080/api/v1/saveCart
	@PostMapping("/saveCart")
	public Cart addtoCart(@RequestBody Cart c) {

		Cart cart = cartService.savecart(c);

		// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
		return cart;
	}

	// http://localhost:8080/api/v1/updateCart/2
	@PutMapping("/updateCart/{id}")
	public ResponseEntity<Cart> updateCart(@PathVariable("id") int userId,
			@RequestBody Cart cartDetails) throws ResourceNotFoundException {
		
		Cart cart = cartService.getCart(userId);


		cart.setquantity(cartDetails.getquantity());
		cart.setitemId(cartDetails.getitemId());
		final Cart updatedCart = cartService.savecart(cart);
		return ResponseEntity.ok(updatedCart);
	}
	
	//http://localhost:8080/api/v1/deleteCart/1
		@DeleteMapping(value = "/deleteCart/{user_id}")
		public ResponseEntity<Object> deleteCart(@PathVariable("user_id") int user_id) {

			cartService.deleteCart(user_id);
			return new ResponseEntity<>("item deleted successsfully", HttpStatus.OK);
		}


}