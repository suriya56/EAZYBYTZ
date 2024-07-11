package com.springbootprj.customerrelationshipmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootprj.customerrelationshipmanagement.entity.Sales;
import com.springbootprj.customerrelationshipmanagement.repository.SalesDealRepository;

@Service
public class SalesDealService {

    @Autowired
    private SalesDealRepository salesDealRepository;

    public List<Sales> getAllSalesDeals() {
        return salesDealRepository.findAll();
    }

    public Sales saveSalesDeal(Sales salesDeal) {
        return salesDealRepository.save(salesDeal);
    }

    public void deleteSalesDeal(Long id) {
        salesDealRepository.deleteById(id);
    }
}