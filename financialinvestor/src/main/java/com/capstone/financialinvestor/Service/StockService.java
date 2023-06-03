package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.model.Stock;
@Service
public interface StockService {
    public Stock saveStock(Stock stock);
    public List<Stock> getAllStock();
    
}
