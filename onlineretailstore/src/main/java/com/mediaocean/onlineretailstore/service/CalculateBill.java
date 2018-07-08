package com.mediaocean.onlineretailstore.service;

import java.util.List;

import com.mediaocean.onlineretailstore.domain.Cost;
import com.mediaocean.onlineretailstore.domain.Product;

public interface CalculateBill {

	Cost calculateBill(List<Product> products);
	
}
