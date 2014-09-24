package com.sales.java.bo;

public enum Promotion {
    B("B", 5, 3,"Q");
    //productNm("ProdNm",Quantity,RevisedQuantity/Discount%,"Discriminatory to identify Discount Percent or Quantity")
    
    private Promotion(String productName,int quantity, int promotion,String discriminator) {
        this.promotion = promotion;
        this.productName = productName;
        this.quantity = quantity;
        this.discriminator = discriminator;
    }
    
    private int promotion;

    private String productName;

    private int quantity;
    
    private String discriminator;
    
    public static Promotion getPromotion(String name, int quantity) {
        for (Promotion promo : values()) {
            if (promo.productName.equalsIgnoreCase(name) && quantity >= promo.quantity) {
                return promo;
            }
        }
        return null;
    }

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getDiscriminator() {
		return discriminator;
	}



	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}


	public int getPromotion() {
		return promotion;
	}


	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}
}
