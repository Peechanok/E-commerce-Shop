package com.shop.shops.model;


public class Shop {
//	    private static int counter =0;
//	    private static int countershop =0;
		private int Shopid;
		private String shopName;
		private String description;
		private int SALES_id;
		private String total_sales;
		
	
	
	
		
		public int getShopid() {
			return Shopid;
		}
		public void setShopid(int shopid) {
			Shopid = shopid;
		}
		public int getSALES_id() {
			return SALES_id;
		}
		public void setSALES_id(int sALES_id) {
			SALES_id = sALES_id;
		}
		public String getShopName() {
			return shopName;
		}
		public void setShopName(String shopName) {
			this.shopName = shopName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
	
		public String getTotal_sales() {
			return total_sales;
		}
		public void setTotal_sales(String total_sales) {
			this.total_sales = total_sales;
		}
		
	

		
		

}
