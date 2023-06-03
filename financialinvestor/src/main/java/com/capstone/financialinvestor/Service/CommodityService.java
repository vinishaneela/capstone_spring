package com.capstone.financialinvestor.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capstone.financialinvestor.model.Commodity;

@Service
public interface CommodityService {
    public Commodity saveCommodity(Commodity commodity);
    public List<Commodity> getAllComodities();
}
