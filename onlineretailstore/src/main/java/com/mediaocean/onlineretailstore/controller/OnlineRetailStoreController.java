package com.mediaocean.onlineretailstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mediaocean.onlineretailstore.domain.Cost;
import com.mediaocean.onlineretailstore.domain.Product;
import com.mediaocean.onlineretailstore.service.CalculateBill;

@RestController
@RequestMapping("/api/")
public class OnlineRetailStoreController {

	@Autowired
	private CalculateBill calculateBill;
	
	@RequestMapping(value="calculateTest", method=RequestMethod.GET)
	public void calculateTest(String s){
		System.out.println(s);
	}
		
	@RequestMapping(value="calculateTotalBill", method=RequestMethod.POST)
	public Cost calculateTotalBill(@RequestBody List<Product> products){
		
		return calculateBill.calculateBill(products);
	}
	
	@RequestMapping(value="test", method=RequestMethod.GET)
	public String justPrint(){
		System.out.println("anything.......");
		return "anything..";
	}
	
	
	@RequestMapping(value="calculate", method=RequestMethod.GET)
	public String calculateBill(){
		System.out.println("calculating bill.......");
		return "calculating bill..";
	}
	
	
}
