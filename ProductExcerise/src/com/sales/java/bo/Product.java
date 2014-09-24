package com.sales.java.bo;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a product with a price.
 */
public enum Product {
    A("A", 20d),
    B("B", 50d),    
    C("C", 30d);
    
    private Product(String productName, double price) {
        this.price = price;
        this.productName = productName;
//        this.productTitle = productTitle;
    }


    protected double price;
    
    protected String productName;
    
//    public List prodList = new ArrayList();


    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

   
    public static Product getByName(String name) {
        for (Product product : values()) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
 public static List<Product> getAllProducts(){
	 List<Product> list = Arrays.asList(Product.values());
	 return list;
 }
   
    public String toString() {
        return productName + " - " + String.format("$%.2f", price);
    }
}

