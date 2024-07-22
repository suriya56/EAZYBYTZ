package com.trade.Trade.repository;

import com.trade.Trade.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
	Portfolio findByUserId(Long userId);
}
