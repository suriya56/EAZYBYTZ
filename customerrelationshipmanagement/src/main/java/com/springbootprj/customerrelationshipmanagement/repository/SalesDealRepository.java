package com.springbootprj.customerrelationshipmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootprj.customerrelationshipmanagement.entity.Sales;

@Repository
public interface SalesDealRepository extends JpaRepository<Sales, Long> {
}