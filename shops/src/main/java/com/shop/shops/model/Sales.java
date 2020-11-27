package com.shop.shops.model;




import org.springframework.stereotype.Component;



@Component
public class Sales {
//	private static int counter=0;
	private int SALES_id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	
	private String dateCreated;
 
	
	
	
	public int getSALES_id() {
		return SALES_id;
	}
	public void setSALES_id(int sALES_id) {
		SALES_id = sALES_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
//	public Timestamp getDateCreated() {
//		return dateCreated;
//	}
//	public void setDateCreated(Timestamp dateCreated) {
//		this.dateCreated = dateCreated;
//	}
	
}

	