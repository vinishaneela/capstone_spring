package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.dao.MutualFundDao;
import com.capstone.financialinvestor.model.MutualFund;

@Service
public class MutualFundServiceImpl implements MutualFundService {
    @Autowired
    MutualFundDao mutualFundDao;
	@Override
	public MutualFund saveMutualFund(MutualFund mutualFund) {
		// TODO Auto-generated method stub
		return  mutualFundDao.save(mutualFund);
	}

	@Override
	public List<MutualFund> getAllMutualFund() {
		// TODO Auto-generated method stub
		return (List<MutualFund>) mutualFundDao.findAll();
	}

}
