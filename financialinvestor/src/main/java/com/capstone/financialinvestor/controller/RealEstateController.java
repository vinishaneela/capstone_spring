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

import com.capstone.financialinvestor.Service.RealEstateService;
import com.capstone.financialinvestor.model.RealEstate;


@CrossOrigin
@RequestMapping("realestate")
@RestController
public class RealEstateController {
	
	
	@Autowired
	RealEstateService realEstateService;
	@GetMapping("/getAllRealEstate")
	   public ResponseEntity<List<RealEstate>> getAllRealEstate(){
		   List<RealEstate> finalRealEstates=realEstateService.getAllRealEstates();
		   return new ResponseEntity<List<RealEstate>>(finalRealEstates,HttpStatus.OK);
		   
	   }
	   @PostMapping("/saveRealEstate")
	   public ResponseEntity<RealEstate> saveStock(@RequestBody RealEstate realEstate){
		   RealEstate createdRealEstate=realEstateService.saveRealEstate(realEstate);
		   return new ResponseEntity<RealEstate>(createdRealEstate,HttpStatus.OK);
	   }

}

