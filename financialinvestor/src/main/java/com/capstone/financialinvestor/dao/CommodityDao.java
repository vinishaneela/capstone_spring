package com.capstone.financialinvestor.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.financialinvestor.model.Commodity;

@Repository
public interface CommodityDao extends CrudRepository<Commodity, String> {

}
