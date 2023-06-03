package com.capstone.financialinvestor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class MutualFund {
	@Id
	int mutualFundId;
	String schemeName;
	String type;
	String intrestRepayment;
	String principleRepayment;
	double amount;
	String category;
	int volume;
	

}
