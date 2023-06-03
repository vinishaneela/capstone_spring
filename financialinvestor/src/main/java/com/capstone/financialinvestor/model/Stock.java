package com.capstone.financialinvestor.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
	@Id
	String StockId;
	Date date;
	String location;
	String Open;
	String High;
	String Low;
	String Close;
	String Volume;

}
