package com.capstone.financialinvestor.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.financialinvestor.model.RealEstate;

@Repository
public interface RealEstateDao extends CrudRepository<RealEstate,String> {

}
