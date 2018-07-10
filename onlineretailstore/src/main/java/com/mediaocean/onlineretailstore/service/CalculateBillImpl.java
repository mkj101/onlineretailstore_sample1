package com.mediaocean.onlineretailstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mediaocean.onlineretailstore.domain.Cost;
import com.mediaocean.onlineretailstore.domain.Product;

@Service
public class CalculateBillImpl implements CalculateBill{

	@Override
	public Cost calculateBill(List<Product> products) {
		float totalCost =0;
		float totalSalesTax=0;
		double salesTax=0;
		Cost cost = new Cost();
		for (Product product : products) {
			String c = product.getCategory();
			float productPrice = product.getPrice();
			if(c.equals("A")){
				salesTax = productPrice * .1;
			}else if(c.equals("B")){
				salesTax = productPrice * .2;
			}else if(c.equals("C")){
				salesTax = productPrice * 1;
			}
			totalCost+=productPrice+salesTax;
			totalSalesTax +=salesTax;
		}
		cost.setTotalCost(totalCost);
		cost.setTotalSalesTax(totalSalesTax);
		System.out.println("total cost is : "+ totalCost);
		System.out.println("total cost is : "+ totalSalesTax);
		
		return cost;
	}

}
