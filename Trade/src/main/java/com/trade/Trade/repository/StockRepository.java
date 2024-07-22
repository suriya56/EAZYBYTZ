package com.trade.Trade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trade.Trade.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {
	Stock findBySymbol(String symbol);
}