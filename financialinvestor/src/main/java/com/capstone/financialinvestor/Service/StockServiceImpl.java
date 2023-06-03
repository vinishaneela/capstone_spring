package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.dao.StockDao;
import com.capstone.financialinvestor.model.Stock;

@Service
public class StockServiceImpl implements StockService{
    @Autowired
    StockDao stockDao;
	@Override
	public Stock saveStock(Stock stock) {
		stockDao.save(stock);
		return stock;
	}
	@Override
	public List<Stock> getAllStock() {
		return  (List<Stock>) stockDao.findAll();
	}
    
}
