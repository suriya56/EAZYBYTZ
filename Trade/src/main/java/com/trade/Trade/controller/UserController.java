package com.trade.Trade.controller;

import com.trade.Trade.model.User;
import com.trade.Trade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		return ResponseEntity.ok(userService.registerUser(user));
	}

	@GetMapping("/{username}")
	public ResponseEntity<User> getUser(@PathVariable String username) {
		return ResponseEntity.ok(userService.findByUsername(username));
	}
}