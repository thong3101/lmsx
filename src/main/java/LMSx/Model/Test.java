package LMSx.Model;

import java.sql.Date;

import LMSx.Common.Constant;
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
	}
}
