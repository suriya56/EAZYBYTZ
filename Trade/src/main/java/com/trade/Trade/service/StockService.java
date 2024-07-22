package com.trade.Trade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.Trade.model.Stock;
import com.trade.Trade.repository.StockRepository;

@Service
public class StockService {
	@Autowired
	private StockRepository stockRepository;

	public List<Stock> getAllStocks() {
		return stockRepository.findAll();
	}

	public Stock findBySymbol(String symbol) {
		return stockRepository.findBySymbol(symbol);
	}

	public Stock saveStock(Stock stock) {
		return stockRepository.save(stock);
	}

}
