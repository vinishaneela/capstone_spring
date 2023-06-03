package com.capstone.financialinvestor.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.financialinvestor.model.Stock;

@Repository
public interface StockDao extends CrudRepository<Stock, String> {
	
	

}
