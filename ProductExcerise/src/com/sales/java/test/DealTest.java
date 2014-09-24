package com.sales.java.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sales.java.bo.Deal;

public class DealTest {

	@Test
	public void testcalculatePrice() {
		String productName = "B";
		int quantity = 12;//(150*2+50*2) = 400
//		fail("Not yet implemented");
		Deal deal = new Deal(productName, quantity);
		double price = deal.calculatePrice(productName, quantity);
		assertEquals(400d, price);
		
	}

}
