package com.sales.java.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sales.java.bo.Product;
import com.sales.java.bo.ProductUtility;

public class ProductTest {

	@Test
	public void testCalcPurchaseQtyFrmInput() {
		String items = "ABBBCCBB";
		String productNmFromInv = "B";
		int QuantityPurchased = ProductUtility.calcPurchaseQtyFrmInput(items, productNmFromInv);
		assertEquals(5, QuantityPurchased);
	}

	@Test
	public void testNumberOfInvProds(){
		String items = "ABBBCCBB";
		
		String uniqueProds = ProductUtility.getUniqueProducts(items);
		assertEquals("ABC", uniqueProds);
	}
}
