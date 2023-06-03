package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.model.MutualFund;

@Service
public interface MutualFundService {
      public MutualFund saveMutualFund(MutualFund mutualFund);
      public List<MutualFund> getAllMutualFund();
}
