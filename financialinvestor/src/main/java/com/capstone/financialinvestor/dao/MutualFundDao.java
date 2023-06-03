package com.capstone.financialinvestor.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.financialinvestor.model.MutualFund;

@Repository
public interface MutualFundDao extends CrudRepository<MutualFund, String> {

}
