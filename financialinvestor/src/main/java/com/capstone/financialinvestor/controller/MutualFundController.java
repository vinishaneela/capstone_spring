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

import com.capstone.financialinvestor.Service.MutualFundService;
import com.capstone.financialinvestor.model.MutualFund;



@CrossOrigin
@RestController
@RequestMapping("mutualfund")
public class MutualFundController {
    @Autowired
    MutualFundService mutualFundService;
    @GetMapping("/getmutualfunds")
    public ResponseEntity<List<MutualFund>> getAllMutualFund(){
 	   List<MutualFund> finalMutualFund=mutualFundService.getAllMutualFund();
 	   return new ResponseEntity<List<MutualFund>>(finalMutualFund,HttpStatus.OK);
 	   
    }
    @PostMapping("/saveFund")
    public ResponseEntity<MutualFund> saveStock(@RequestBody MutualFund mutualFund){
 	   MutualFund createdMutualFund=mutualFundService.saveMutualFund(mutualFund);
 	   return new ResponseEntity<MutualFund>(createdMutualFund,HttpStatus.OK);
 	   
    }
    
}
