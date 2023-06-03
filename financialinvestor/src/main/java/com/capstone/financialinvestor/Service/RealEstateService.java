package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.model.Commodity;
import com.capstone.financialinvestor.model.RealEstate;

@Service
public interface RealEstateService {
	  public RealEstate saveRealEstate(RealEstate realEstate);
	    public List<RealEstate> getAllRealEstates();

}
