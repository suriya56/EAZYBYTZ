package com.trade.Trade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.Trade.model.Transaction;
import com.trade.Trade.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;

	public List<Transaction> getTransactionsByUserId(Long userId) {
		return transactionRepository.findByUserId(userId);
	}

	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
}
