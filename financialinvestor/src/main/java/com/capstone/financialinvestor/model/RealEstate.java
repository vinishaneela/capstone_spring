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
public class RealEstate {
   
	@Id
	int realEstateId;
	String propertyType;
	String name;
	String Location;
	Double currentPrice;
	Double previousPrice;
	
	
}
