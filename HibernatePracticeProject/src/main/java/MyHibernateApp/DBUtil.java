package MyHibernateApp;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.MySQLDialect;

public class DBUtil {
	public static Session getDBSession() {
		
		// Step 1. Create Configuration Object
		Configuration configuration = new Configuration();
		
		//Step #2. Create Properties class to hold Database properties
		Properties properties = new Properties();
		
		properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL,"jdbc:mysql://localhost:3306/tapmay31");
		properties.put(Environment.USER,"root");
		properties.put(Environment.PASS, "afsanapatel");
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		properties.put(Environment.SHOW_SQL,"true");
		
		// Step #3. Add the properties object to configuration.
		configuration.addProperties(properties);
		configuration.addAnnotatedClass(EmployeeEntity.class);
		
		//Step #4.Create sessionFactory object to generate session
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
			
		return session ;
	}

}
