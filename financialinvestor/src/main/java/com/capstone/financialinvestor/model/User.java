package com.capstone.financialinvestor.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {
	@Id
	String email;
	String fullName;
	String password;
	//String pancard;
	String typeOfUser;
	double balanceAmount;
	String Location;
	Date date;
	Bond bond;
	Commodity commodity;
	MutualFund mutualFund;
	RealEstate realestate;

}
