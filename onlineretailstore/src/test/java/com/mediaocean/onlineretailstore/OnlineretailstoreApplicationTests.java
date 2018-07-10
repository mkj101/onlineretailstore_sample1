package com.mediaocean.onlineretailstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mediaocean.onlineretailstore.controller.OnlineRetailStoreController;
import com.mediaocean.onlineretailstore.domain.Cost;
import com.mediaocean.onlineretailstore.domain.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnlineretailstoreApplicationTests {

	@Autowired
	private OnlineRetailStoreController onlineRetailStoreController;
	
	   @Test
	   public void getTotalCost() throws Exception {
		   
		   float totalCost=0;
		   float totalSalesTax=0;
	       Product product1 = new Product();
	       product1.setCategory("A");
	       product1.setPrice(100f);
	       
	       totalSalesTax+=100*.1;
	       totalCost+=100+ 100*.1;
	       
	       
	       
	       Product product2 = new Product();
	       product2.setCategory("B");
	       product2.setPrice(200f);
	       

	       totalSalesTax+=200*.2;
	       totalCost+=200+ 200*.2;
	       
	       
	       Product product3 = new Product();
	       product3.setCategory("C");
	       product3.setPrice(300f);
	       

	       totalSalesTax+=300*1;
	       totalCost+=300+ 300*1;
	       
	       List<Product> allProducts = new ArrayList<>();
	       allProducts.add(product1);
	       allProducts.add(product2);
	       allProducts.add(product3);
	       
	       Cost expectedCost = onlineRetailStoreController.calculateTotalBill(allProducts);
	       Cost cost = new Cost();
	       cost.setTotalCost(totalCost);
	       cost.setTotalSalesTax(totalSalesTax);
	       
	       assertThat(cost.getTotalCost()).isEqualTo(expectedCost.getTotalCost());
	       assertThat(cost.getTotalSalesTax()).isEqualTo(expectedCost.getTotalSalesTax());
	              
	       }
	   
	
	@Test
	public void contextLoads() {
	}

	
	
}
