package LMSx.Model;

import java.sql.Date;

import javax.persistence.*;


@MappedSuperclass
public abstract class User{
	private String name;
	private String address;
	private String email;
	private String contact;
	private String gender;
	private Date birthdate;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public User() {
		
	};
	
	public User(String name, String address, String email, String contact, String gender, Date birthdate) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.birthdate = birthdate;
	}
	
	
	
	
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", email=" + email + ", contact=" + contact + ", gender="
				+ gender + ", birthdate=" + birthdate + "]";
	}
	
	//Set USER_ROLE (global attribute) in Constant.java
	public abstract void Login();
	
	//Set USER_ROLE = None (global attribute) in Constant.java
	public abstract void Logout();
	
	
}
