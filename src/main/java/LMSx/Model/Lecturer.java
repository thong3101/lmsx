package LMSx.Model;

import java.sql.Date;

import javax.persistence.*;

import LMSx.Common.Constant;

@Entity
@Table(name = "lecturer")
public class Lecturer extends User{
	@Id
	private String lecturerID;
	private String password;
	
	public String getLecturerID() {
		return lecturerID;
	}
	public void setLecturerID(String lecturerID) {
		this.lecturerID = lecturerID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Lecturer() {
		super();
	}
	
	
	public Lecturer(String name, String address, String email, String contact, String gender, Date birthdate,
			String lecturerID, String password) {
		super(name, address, email, contact, gender, birthdate);
		this.lecturerID = lecturerID;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Lecturer [lecturerID=" + lecturerID + ", password=" + password + "]";
	}
	
	@Override
	public void Login() {
		Constant.USER_ROLE = "Lecturer";
		
	}
	@Override
	public void Logout() {
		Constant.USER_ROLE = "None";
		
	}
	
	
	
}
