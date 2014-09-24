package com.sales.java.main;

import com.sales.java.impl.SuperMarketImpl;

public class SuperMarketSalesMain {	
	
	/**
	 * 	main method to Checkout the price of the items 
	 *	purchased by including Promotions, if available 
	 *	@param items
	 *	@return 
	 */
	public static void main(String args[]){
		String items = args[0];
		int totalPrice = 0;
		SuperMarketImpl market = new SuperMarketImpl();
		if(null != items){
		 totalPrice = market.checkout(items);
		} else {
			System.out.println("No Items Purchased to Checkout");
		}
		System.out.println("Total Price TO Pay"+totalPrice);
		
	}
}
