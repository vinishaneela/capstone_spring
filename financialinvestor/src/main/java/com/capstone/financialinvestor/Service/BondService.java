package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.model.Bond;
;

@Service
public interface BondService {
	  public Bond saveBond(Bond bond);
      public List<Bond> getAllBonds();
     
}
