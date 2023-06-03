package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.dao.BondDao;
import com.capstone.financialinvestor.model.Bond;

@Service
public class BondServiceImpl implements BondService {
	@Autowired
	BondDao bondDao;

	@Override
	public Bond saveBond(Bond bond) {
		// TODO Auto-generated method stub
		return bondDao.save(bond);
	}

	@Override
	public List<Bond> getAllBonds() {
		// TODO Auto-generated method stub
		return (List<Bond>) bondDao.findAll();
	}

	

}
