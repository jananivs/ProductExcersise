package com.sales.java.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sales.java.impl.SuperMarketImpl;
import com.sales.java.interf.SuperMarket;

public class SuperMarketTest {

	@Test
	public void testCalcPurchaseQtyFrmInput() {
//		fail("Not yet implemented");
		String items ="ABBACBBAB";
		SuperMarket supermarkt = new SuperMarketImpl();
		int totalPrice = supermarkt.checkout(items);		
		assertEquals(240, totalPrice);
	}

}
