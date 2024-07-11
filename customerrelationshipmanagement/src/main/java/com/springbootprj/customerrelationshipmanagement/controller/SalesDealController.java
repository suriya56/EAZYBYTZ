package com.springbootprj.customerrelationshipmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootprj.customerrelationshipmanagement.entity.Sales;
import com.springbootprj.customerrelationshipmanagement.service.SalesDealService;

@RestController
@RequestMapping("/api/salesdeals")
public class SalesDealController {

    @Autowired
    private SalesDealService salesDealService;

    @GetMapping
    public List<Sales> getAllSalesDeals() {
        return salesDealService.getAllSalesDeals();
    }

    @PostMapping
    public Sales createSalesDeal(@RequestBody Sales salesDeal) {
        return salesDealService.saveSalesDeal(salesDeal);
    }

    @DeleteMapping("/{id}")
    public void deleteSalesDeal(@PathVariable Long id) {
        salesDealService.deleteSalesDeal(id);
    }
}
