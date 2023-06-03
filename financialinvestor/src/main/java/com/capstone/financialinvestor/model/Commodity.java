package com.capstone.financialinvestor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Commodity {
	@Id
	int commodityId;
	String name;
	Double currentPrice;
	Double previousPrice;
	
	
	
}
