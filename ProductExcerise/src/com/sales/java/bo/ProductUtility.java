package com.sales.java.bo;

public class ProductUtility {

	/**
	 * This static method to get the count of a particular item checked out
	 * 
	 * @param items
	 *            ,productPurchased
	 * @return Qty
	 */
	public static int calcPurchaseQtyFrmInput(String items,
			String productPurchased) {
		int lastIndex = 0;
		int QtyPurchased = 0;
		if (items.contains(productPurchased)) {
			while (lastIndex != -1) {

				lastIndex = items.indexOf(productPurchased, lastIndex);

				if (lastIndex != -1) {
					QtyPurchased++;
					lastIndex += productPurchased.length();
				}
			}// End While
		}
		System.out.println("items::::" + items + ":::::QtyPurchased"
				+ QtyPurchased);
		return QtyPurchased;
	}

	/**
	 * This static method to get the unique items checked out
	 * 
	 * @param items
	 * @return String of Unique items
	 */
	public static String getUniqueProducts(String items) {

		String uniqueItems = "";
		for (int i = 0; i < items.length(); i++) {
			if (uniqueItems.indexOf(items.charAt(i)) == -1)

				uniqueItems += items.charAt(i);
		}
		System.out.println("The Unique Charactes in the String:" + uniqueItems);

		return uniqueItems;
	}
}
