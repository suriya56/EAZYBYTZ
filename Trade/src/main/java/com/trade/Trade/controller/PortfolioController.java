package com.trade.Trade.controller;

import com.trade.Trade.model.Portfolio;
import com.trade.Trade.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/portfolios")
public class PortfolioController {
	@Autowired
	private PortfolioService portfolioService;

	@GetMapping("/user/{userId}")
	public ResponseEntity<Portfolio> getPortfolioByUserId(@PathVariable Long userId) {
		return ResponseEntity.ok(portfolioService.getPortfolioByUserId(userId));
	}

	@PostMapping
	public ResponseEntity<Portfolio> savePortfolio(@RequestBody Portfolio portfolio) {
		return ResponseEntity.ok(portfolioService.savePortfolio(portfolio));
	}
}