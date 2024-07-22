package com.trade.Trade.controller;

import com.trade.Trade.model.Stock;
import com.trade.Trade.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
	@Autowired
	private StockService stockService;

	@GetMapping
	public ResponseEntity<List<Stock>> getAllStocks() {
		return ResponseEntity.ok(stockService.getAllStocks());
	}

	@GetMapping("/{symbol}")
	public ResponseEntity<Stock> getStockBySymbol(@PathVariable String symbol) {
		return ResponseEntity.ok(stockService.findBySymbol(symbol));
	}

	@PostMapping
	public ResponseEntity<Stock> saveStock(@RequestBody Stock stock) {
		return ResponseEntity.ok(stockService.saveStock(stock));
	}
}