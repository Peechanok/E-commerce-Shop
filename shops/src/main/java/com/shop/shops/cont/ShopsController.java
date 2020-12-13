package com.shop.shops.cont;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.shop.shops.model.Address;
import com.shop.shops.model.Sales;
import com.shop.shops.model.Shop;
import com.shop.shops.service.FirebaseInitializer;

@RestController
public class ShopsController {
	@Autowired
	FirebaseInitializer db;
	private static int count;
	
	//Sales//////////////////////////////////////
	@GetMapping("/getSales")
	public Sales getSales(@RequestParam String SALES_id) throws InterruptedException, ExecutionException {
		if(SALES_id == null || SALES_id == "") 
			return null;
		
		DocumentReference docRef = db.getFirebase().collection("Sales").document(SALES_id);
		ApiFuture<DocumentSnapshot> future = docRef.get();
		DocumentSnapshot document = future.get();
		if (document.exists()) {
			//document.getData();
			Sales ss = document.toObject(Sales.class);
			return ss;
		} else {
			return null;
		}
		
		
	}
	
	@GetMapping("/getSalesAll")  
	public List<Sales> getSalesAll() throws InterruptedException, ExecutionException {
		
		List<Sales> empList = new ArrayList<Sales>();
		CollectionReference employee= db.getFirebase().collection("Sales");
		ApiFuture<QuerySnapshot> querySnapshot= employee.get();
		for(DocumentSnapshot doc:querySnapshot.get().getDocuments()) {
			Sales emp = doc.toObject(Sales.class);
			empList.add(emp);
		}
		return empList;
	}
	
		@PostMapping("/createSales")
		public Sales saveSales(@RequestBody Sales sales) {
//			if(sales.getSALES_id() != null && sales.getSALES_id() != "") 
//				return null;
			
//			sales.setSALES_id(UUID.randomUUID().toString());
			
		
			CollectionReference salesCR= db.getFirebase().collection("Sales");
			salesCR.document(String.valueOf(sales.getSALES_id())).set(sales);			
			return sales;
		}
		
		
		@PutMapping("/updateSales")
		public Sales updateSales(@RequestBody Sales sales) {
//			if(sales.getSALES_id() == null || sales.getSALES_id() == "") 
//				return null;
			
			CollectionReference salesCR= db.getFirebase().collection("Sales");
			salesCR.document(String.valueOf(sales.getSALES_id())).set(sales);
			
			return sales;
		}
	
		@DeleteMapping("/deleteSales")
		public String deleteSales(@RequestParam String SALES_id) {
			if(SALES_id == null || SALES_id == "") 
				return "Fail";
			
			db.getFirebase().collection("Sales").document(SALES_id).delete();	
			db.getFirebase().collection("Address").document(SALES_id).delete();
			db.getFirebase().collection("Shop").document(SALES_id).delete();
			return "OK";
		}
		
		//Address//////////////////////////////////
		@GetMapping("/getAddress")
		public Address getAddress(@RequestParam String My_address_id) throws InterruptedException, ExecutionException {
			if(My_address_id == null || My_address_id == "") 
				return null;
			
			DocumentReference docRef = db.getFirebase().collection("Address").document(My_address_id);
			ApiFuture<DocumentSnapshot> future = docRef.get();
			DocumentSnapshot document = future.get();
			if (document.exists()) {
				//document.getData();
				Address ss = document.toObject(Address.class);
				return ss;
			} else {
				return null;
			}
			
			
		}
		@GetMapping("/getAddressbySales")
		public Address getAddressbySales(@RequestParam String SALES_id) throws InterruptedException, ExecutionException {
			if(SALES_id == null || SALES_id == "") 
				return null;
			
			DocumentReference docRef = db.getFirebase().collection("Address").document(SALES_id);
			ApiFuture<DocumentSnapshot> future = docRef.get();
			DocumentSnapshot document = future.get();
			if (document.exists()) {
				//document.getData();
				Address aa = document.toObject(Address.class);
				return aa;
			} else {
				return null;
			}
			
			
			
		}
		
		@GetMapping("/getAddressAll")  
		public List<Address> getAddressAll() throws InterruptedException, ExecutionException {
			
			List<Address> adList = new ArrayList<Address>();
			CollectionReference address= db.getFirebase().collection("Address");
			ApiFuture<QuerySnapshot> querySnapshot= address.get();
			for(DocumentSnapshot doc:querySnapshot.get().getDocuments()) {
				Address add = doc.toObject(Address.class);
				adList.add(add);
			}
			return adList;
		}
		
		@PostMapping("/createAddress")
		public Address saveAddress(@RequestBody Address address) {
//			if(address.getMy_address_id() != null && address.getMy_address_id() != "") 
//				return null;
//			address.setMy_address_id(UUID.randomUUID().toString());
			CollectionReference addressCR= db.getFirebase().collection("Address");
			addressCR.document(String.valueOf(address.getMy_address_id())).set(address);			
			return address;
		}
			
			
			@PutMapping("/updateAddress")
			public Address updateAddress(@RequestBody Address address) {
//				if(address.getMy_address_id() == null || address.getMy_address_id() == "") 
//					return null;
				
				CollectionReference addressCR= db.getFirebase().collection("Address");
				addressCR.document(String.valueOf(address.getMy_address_id())).set(address);
				
				return address;
			}
		
			@DeleteMapping("/deleteAddress")
			public String deleteAddress(@RequestParam String My_address_id) {
				if(My_address_id == null || My_address_id == "") 
					return "Fail";
				
				db.getFirebase().collection("Address").document(My_address_id).delete();			
				return "OK";
			}
			//Shop//////////////////////////////////
			@GetMapping("/getShop")
			public Shop getShop(@RequestParam String Shopid) throws InterruptedException, ExecutionException {
				if(Shopid == null || Shopid == "") 
					return null;
				
				DocumentReference docRef = db.getFirebase().collection("Shop").document(Shopid);
				ApiFuture<DocumentSnapshot> future = docRef.get();
				DocumentSnapshot document = future.get();
				if (document.exists()) {
					//document.getData();
					Shop shop = document.toObject(Shop.class);
					return shop;
				} else {
					return null;
				}
				
				
			}
			@GetMapping("/getShopbysalesid")
			public Shop getShopBySales(@RequestParam String SALES_id) throws InterruptedException, ExecutionException {
				if(SALES_id == null || SALES_id == "") 
					return null;
				
				DocumentReference docRef = db.getFirebase().collection("Shop").document(SALES_id);
				ApiFuture<DocumentSnapshot> future = docRef.get();
				DocumentSnapshot document = future.get();
				if (document.exists()) {
					//document.getData();
					Shop shop = document.toObject(Shop.class);
					return shop;
				} else {
					return null;
				}
				
				
			}
			
			@GetMapping("/getShopAll")  
			public List<Shop> getShopAll() throws InterruptedException, ExecutionException {
				
				List<Shop> adList = new ArrayList<Shop>();
				CollectionReference shop= db.getFirebase().collection("Shop");
				ApiFuture<QuerySnapshot> querySnapshot= shop.get();
				for(DocumentSnapshot doc:querySnapshot.get().getDocuments()) {
					Shop sh = doc.toObject(Shop.class);
					adList.add(sh);
				}
				return adList;
			}
			
				@PostMapping("/createShop")
				public Shop saveShop(@RequestBody Shop shop) {
//					if(shop.getShopid() != null && shop.getShopid() != "") 
//						return null;
//					
//					shop.setShopid(UUID.randomUUID().toString());
					CollectionReference ShopCR= db.getFirebase().collection("Shop");
					ShopCR.document(String.valueOf(shop.getShopid())).set(shop);			
					return shop;
				}
				
				
				@PutMapping("/updateShop")
				public Shop updateShop(@RequestBody Shop shop) {
//					if(shop.getShopid() == null || shop.getShopid() == "") 
//						return null;
//					
					CollectionReference ShopCR= db.getFirebase().collection("Shop");
					ShopCR.document(String.valueOf(shop.getShopid())).set(shop);
					
					return shop;
				}
			
				@DeleteMapping("/deleteShop")
				public String deleteShop(@RequestParam String Shopid) {
					if(Shopid == null || Shopid == "") 
						return "Fail";
					
					db.getFirebase().collection("Shop").document(Shopid).delete();			
					return "OK";
				}
			
				
	
}
