package com.capstone.financialinvestor.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bond {
     @Id
     int bondId;
     String bondName;
     String tenure;
     double price;
     String YTM;//(Yield To Maturity)
     String frequency;
     String taxable;
	 List<Bond> bond;
}
