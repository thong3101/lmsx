package LMSx.Model;

import java.sql.Date;

import javax.persistence.*;

import LMSx.Common.Constant;


@Entity
@Table(name = "student")
public class Student extends User{
	@Id

	private String studentID;
	private String password;
	
	
	
	
	public String getStudentID() {
		return studentID;
	}




	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Student() {
		super();
	}

	public Student(String name, String address, String email, String contact, String gender, Date birthdate,
			String studentID, String password) {
		super(name, address, email, contact, gender, birthdate);
		this.studentID = studentID;
		this.password = password;
	}

	


	@Override
	public String toString() {
		return super.toString() +"Student [studentID=" + studentID + ", password=" + password + "]";
	}




	@Override
	public void Login() {
		Constant.USER_ROLE = "Student";
	}




	@Override
	public void Logout() {
		Constant.USER_ROLE = "None";
		
	}


}
