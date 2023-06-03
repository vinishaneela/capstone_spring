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

import com.capstone.financialinvestor.Service.CommodityService;
import com.capstone.financialinvestor.model.Commodity;


@CrossOrigin
@RestController
@RequestMapping("commodity")
public class CommodityController {
	@Autowired
	CommodityService commodityService;
	@GetMapping("/getCommodity")
	   public ResponseEntity<List<Commodity>> getAllCommodity(){
		   List<Commodity> finalCommodity=commodityService.getAllComodities();
		   return new ResponseEntity<List<Commodity>>(finalCommodity,HttpStatus.OK);
		   
	   }
	   @PostMapping("/saveCommodity")
	   public ResponseEntity<Commodity> saveStock(@RequestBody Commodity commodity){
		   Commodity finalCommodity=commodityService.saveCommodity(commodity);
		   return new ResponseEntity<Commodity>(finalCommodity,HttpStatus.OK);
		   
	   }

}
