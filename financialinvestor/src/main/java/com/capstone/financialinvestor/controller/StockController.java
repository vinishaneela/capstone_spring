package com.capstone.financialinvestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.financialinvestor.Service.StockService;
import com.capstone.financialinvestor.model.Stock;

@CrossOrigin
@RestController
@RequestMapping("stock")
public class StockController {
	@Autowired
	StockService stockService;
   @GetMapping("/getAllStocks")
   public ResponseEntity<List<Stock>> getAllStock(){
	   List<Stock> finalStocks=stockService.getAllStock();
	   return new ResponseEntity<List<Stock>>(finalStocks,HttpStatus.OK);
	   
   }
   @PostMapping("/saveStock")
   public ResponseEntity<Stock> saveStock(@RequestBody Stock stock){
	   Stock createdStock=stockService.saveStock(stock);
	   return new ResponseEntity<Stock>(createdStock,HttpStatus.OK);
	   
   }
   
}
