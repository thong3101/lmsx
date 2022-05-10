package LMSx.Model;

import java.sql.Date;

import javax.persistence.*;

import LMSx.Common.Constant;


@Entity
@Table(name = "administrator")
public class Administrator extends User{
	@Id
	private String systemPasscode;
	private String password;
	
	public String getSystemPasscode() {
		return systemPasscode;
	}
	public void setSystemPasscode(String systemPasscode) {
		this.systemPasscode = systemPasscode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Administrator(String name, String address, String email, String contact, String gender, Date birthdate,
			String systemPasscode, String password) {
		super(name, address, email, contact, gender, birthdate);
		this.systemPasscode = systemPasscode;
		this.password = password;
	}
	
	public Administrator() {
		super();
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Administrator [systemPasscode=" + systemPasscode + ", password=" + password + "]";
	}
	
	@Override
	public void Login() {
		Constant.USER_ROLE = "Administrator";
		
	}
	@Override
	public void Logout() {
		Constant.USER_ROLE = "None";
		
	}
	
}
