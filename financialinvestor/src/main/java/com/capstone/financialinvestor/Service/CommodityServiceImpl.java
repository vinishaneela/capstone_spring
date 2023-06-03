package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.dao.CommodityDao;
import com.capstone.financialinvestor.model.Commodity;
@Service
public class CommodityServiceImpl implements CommodityService{
    @Autowired
    CommodityDao commodityDao;
	@Override
	public Commodity saveCommodity(Commodity commodity) {
		return commodityDao.save(commodity);
	}

	@Override
	public List<Commodity> getAllComodities() {
		
		return (List<Commodity>) commodityDao.findAll();
	}

}
