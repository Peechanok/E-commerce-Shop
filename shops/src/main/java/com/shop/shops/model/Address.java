package com.shop.shops.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Address {
//		private static int counter = 0;
//	    private static int counterAddress = 0;
		private int my_address_id;
		private String province;
		private String district;
		private String sub_district;
		private String road;
		private String number;
		private String postal_code;
		private int SALES_id;
		
		
		
		
		
	
		public int getMy_address_id() {
			return my_address_id;
		}
		public void setMy_address_id(int my_address_id) {
			this.my_address_id = my_address_id;
		}
		public int getSALES_id() {
			return SALES_id;
		}
		public void setSALES_id(int sALES_id) {
			SALES_id = sALES_id;
		}
		public String getProvince() {
			return province;
		}
		public void setProvince(String province) {
			this.province = province;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getSub_district() {
			return sub_district;
		}
		public void setSub_district(String sub_district) {
			this.sub_district = sub_district;
		}
		public String getRoad() {
			return road;
		}
		public void setRoad(String road) {
			this.road = road;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getPostal_code() {
			return postal_code;
		}
		public void setPostal_code(String postal_code) {
			this.postal_code = postal_code;
		}
	
		

}
