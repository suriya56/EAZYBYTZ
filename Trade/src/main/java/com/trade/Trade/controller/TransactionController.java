package com.trade.Trade.controller;

import com.trade.Trade.model.Transaction;
import com.trade.Trade.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
	@Autowired
	private TransactionService transactionService;

	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Transaction>> getTransactionsByUserId(@PathVariable Long userId) {
		return ResponseEntity.ok(transactionService.getTransactionsByUserId(userId));
	}

	@PostMapping
	public ResponseEntity<Transaction> saveTransaction(@RequestBody Transaction transaction) {
		return ResponseEntity.ok(transactionService.saveTransaction(transaction));
	}
}