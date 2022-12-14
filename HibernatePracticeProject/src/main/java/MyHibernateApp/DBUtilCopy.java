package MyHibernateApp;


import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;



public class DBUtilCopy {

	public static Session getDBsession() {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/empmanage");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "afsanapatel");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		properties.put(Environment.SHOW_SQL, "true");
		
		configuration.addProperties(properties);
		configuration.addAnnotatedClass(EmployeeEntity.class);
		
		SessionFactory sessionf =  configuration.buildSessionFactory();
		Session session = sessionf.openSession();
	
		
		return session;
		// TODO Auto-generated method stub

	}

}
