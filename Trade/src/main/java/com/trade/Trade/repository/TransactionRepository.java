package com.trade.Trade.repository;

import com.trade.Trade.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	List<Transaction> findByUserId(Long userId);
}
