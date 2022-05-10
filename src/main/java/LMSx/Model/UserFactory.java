package LMSx.Model;

import java.sql.Date;

import LMSx.Common.EUserRole;

public class UserFactory {
	
	
	public User CreateUser(String name, String address, String email, String contact, String gender, Date birthdate,
			String Username, String password, EUserRole userRole) {
		switch (userRole) {
			case Student:
				return new Student(name, address, email, contact, gender, birthdate, Username, password);
			case Lecturer:
				return new Lecturer(name, address, email, contact, gender, birthdate, Username, password);
			case Administrator:
				return new Administrator(name, address, email, contact, gender, birthdate, Username, password);
			default:
				return null;
		}
	}
	
	
}
