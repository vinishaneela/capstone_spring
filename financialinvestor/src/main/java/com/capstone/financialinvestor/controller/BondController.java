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

import com.capstone.financialinvestor.Service.BondService;
import com.capstone.financialinvestor.model.Bond;
@CrossOrigin
@RestController
@RequestMapping("bond")
public class BondController {
	@Autowired
	BondService bondService;
	@GetMapping("/getBond")
	   public ResponseEntity<List<Bond>> getAllBonds(){
		   List<Bond> finalBonds=bondService.getAllBonds();
		   return new ResponseEntity<List<Bond>>(finalBonds,HttpStatus.OK);
		   
	   }
	   @PostMapping("/saveBond")
	   public ResponseEntity<Bond> saveStock(@RequestBody Bond bond){
		   Bond finalBond=bondService.saveBond(bond);
		   return new ResponseEntity<Bond>(finalBond,HttpStatus.OK);
		   
	   }
	  
}
