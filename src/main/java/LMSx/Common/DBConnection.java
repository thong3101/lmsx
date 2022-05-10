package LMSx.Common;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import LMSx.Model.Administrator;
import LMSx.Model.Lecturer;
import LMSx.Model.Student;
import LMSx.Model.User;

public class DBConnection {
	private final static SessionFactory FACTORY;
	
	static {
		Configuration conf = new Configuration();
		Properties pros = new Properties();
		pros.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		pros.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		pros.put(Environment.URL, "jdbc:mysql://localhost:3306/quanlyhoctap");
		//Phú
		pros.put(Environment.USER, "root");
		pros.put(Environment.PASS, "123qwe");
		// Thông
		//pros.put(Environment.USER, "");
		//pros.put(Environment.PASS, "thong31012001");
		// Thảo
		//pros.put(Environment.USER, "");
		//pros.put(Environment.PASS, "");
		
		conf.setProperties(pros);
		conf.addAnnotatedClass(User.class);
		conf.addAnnotatedClass(Student.class);
		conf.addAnnotatedClass(Lecturer.class);
		conf.addAnnotatedClass(Administrator.class);
		
		ServiceRegistry registry = new StandardServiceRegistryBuilder()
							.applySettings(conf.getProperties()).build();
		
		FACTORY = conf.buildSessionFactory(registry);
	}
	
	public static SessionFactory getSessionFactory() {
		
		return FACTORY;
	}
}
