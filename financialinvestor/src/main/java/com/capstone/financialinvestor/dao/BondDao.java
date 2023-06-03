package com.capstone.financialinvestor.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.financialinvestor.model.Bond;


@Repository
public interface BondDao extends CrudRepository<Bond, String>{
	
}
