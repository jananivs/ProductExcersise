package com.sales.java.impl;

import com.sales.java.bo.Deal;
import com.sales.java.bo.ProductUtility;
import com.sales.java.interf.SuperMarket;

public class SuperMarketImpl implements SuperMarket{

	/**
	 * 	This method will Checkout the price of the items 
	 *	purchase by including Promotions, if available 
	 *	@param items
	 *	@return totalPrice
	 */
	public int checkout(String items) {
		int totalPrice = 0;
		double calcPrice = 0.0d;
		String uniqueProds = ProductUtility.getUniqueProducts(items);

			for(int i = 0 ; i< uniqueProds.length(); i++) {
			String productPurchased = Character.toString(uniqueProds.charAt(i));
			//Calculate Quantity of the product purchased
			int QtyPurchased = ProductUtility.calcPurchaseQtyFrmInput(items,
					productPurchased);
			Deal deal = new Deal(productPurchased, QtyPurchased);
			calcPrice = deal.calculatePrice(productPurchased, QtyPurchased);
			System.out.println("calcPrice:::"+calcPrice);
			totalPrice = totalPrice + (int) calcPrice;
		}

		return totalPrice;
	}	
   
}
