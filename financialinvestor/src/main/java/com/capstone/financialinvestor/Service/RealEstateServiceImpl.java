package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.dao.RealEstateDao;
import com.capstone.financialinvestor.model.RealEstate;

@Service
public class RealEstateServiceImpl implements RealEstateService {
	
	@Autowired
	RealEstateDao realEstateDao;

	@Override
	public RealEstate saveRealEstate(RealEstate realEstate) {
		
		return realEstateDao.save(realEstate);
	}

	@Override
	public List<RealEstate> getAllRealEstates() {
		
		return (List<RealEstate>) realEstateDao.findAll();
	}
	
	

}
