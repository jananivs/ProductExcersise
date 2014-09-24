package com.sales.java.bo;

public class Deal {

	String priceString;

	String productName;

	int quantity;

	String quantityString;
	
	/**
	 * 	Constructor	
	 *	@param productName and quantity	 
	 */

	public Deal(/* double price, */String productName, int quantity) {
		super();
		// this.price = price;
		this.productName = productName;
		this.quantity = quantity;
	}

	/**
	 * 	This method will calculate the price of the quantity by checking
	 *	the available Promotions
	 *	@param productName and quantity
	 *	@return totalPrice
	 */
	public double calculatePrice(String productName, int quantity) {
		double total = 0.0d;
		double finalPrice = 0.0d;
		boolean calculatePromo = false;
		boolean qtyLesThanPromo = false;
		int promotionalCount =0;

		Product product = Product.getByName(productName);
		// Check for Promotion Available on the Particular Product
		Promotion promo = Promotion.getPromotion(productName, quantity);
		finalPrice = product.getPrice();// This is the final price if there is
										// no promotion on the product
		// OPEN FOR FUTURE IMPLEMENTATION 
		// Use this condition promo.getDiscriminator()  
		// to add discount percentage ,
		// Promotion Enum already designed to hold this value
		if (null != promo && quantity >= promo.getQuantity()) {
			calculatePromo = true; // if promotion available & the product Qty
									// purchased is >= promotion Qty
		}
		if (null != promo && ("Q").equalsIgnoreCase(promo.getDiscriminator())) {
			// if there is Promotion && and it is on the Quantity of the Purchase
			while (calculatePromo) {
//				finalPrice = promo.getPrice();
				promotionalCount = promo.getPromotion();
//				total = total + finalPrice;
				total = total + (finalPrice * promotionalCount);
				quantity = quantity - promo.getQuantity();
				if (quantity < promo.getQuantity()) {
					calculatePromo = false;
					if (quantity != 0)
						qtyLesThanPromo = true;
				}
			}
			// If there is a excess Qty Purchased other than Promotion Ex:
			// Purchased Qty 7 , Promotion Price for Qty 5
			// and regular price for Qty 2
			if (qtyLesThanPromo) {
				finalPrice = product.getPrice();
				total = total + (finalPrice * quantity);
			}
		} else { // No PromotionsAvailable
			total = (finalPrice * quantity);
		}
		return total;
	}

}
