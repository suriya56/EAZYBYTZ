package com.trade.Trade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.Trade.model.Portfolio;
import com.trade.Trade.repository.PortfolioRepository;

@Service
public class PortfolioService {
	@Autowired
	private PortfolioRepository portfolioRepository;

	public Portfolio getPortfolioByUserId(Long userId) {
		return portfolioRepository.findByUserId(userId);
	}

	public Portfolio savePortfolio(Portfolio portfolio) {
		return portfolioRepository.save(portfolio);
	}
}