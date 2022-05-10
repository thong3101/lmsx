package LMSx.Model;

import java.sql.Date;

import java.util.List;

import javax.persistence.TypedQuery;


import org.hibernate.Session;

import LMSx.Common.Constant;
import LMSx.Common.DBConnection;

import LMSx.Common.EUserRole;

public class Test {
	public static void main(String[] args) {

		UserFactory userFactory = new UserFactory();
		User user = userFactory.CreateUser("1", "12", "123", "1234", "12345", Date.valueOf("2020-02-20"), "123456", "1234567", EUserRole.Student);
		System.out.println(user.toString());
		user.Login();
		System.out.println(Constant.USER_ROLE);
		user.Logout();
		System.out.println(Constant.USER_ROLE);

		try(Session session = DBConnection.getSessionFactory().openSession()){
			//Thêm người dùng 
			/*System.out.println("Bắt đầu");
			session.getTransaction().begin();
			UserFactory userFactory = new UserFactory();
			User user = userFactory.CreateUser("2", "12", "123", "1234", "12345", Date.valueOf("2020-02-20"), "1234567", "1234567", EUserRole.Lecturer);
			System.out.println(user.toString());
			
			session.save(user);
			session.getTransaction().commit();
			
			System.out.println("Kết thúc");*/
		}
		
	}
}
