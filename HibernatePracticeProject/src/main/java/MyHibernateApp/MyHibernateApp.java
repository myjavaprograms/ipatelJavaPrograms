package MyHibernateApp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class MyHibernateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = DBUtil.getDBSession(); //Get session object to perform CURD operation
		//EmployeeEntity employee = session.get(EmployeeEntity.class, 1001); //get operation
		//System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId());
		

		Criteria criteria = session.createCriteria(EmployeeEntity.class); //Criterion API to fetch records
		//criteria.add(Restrictions.le("salary", 31.0));  //'le; means less than
		//criteria.add(Restrictions.eq("salary", 32.0)); //'eq' means equal
		//criteria.add(Restrictions.idEq(1001));
		//criteria.add(Restrictions.ilike("name", "AB"));
		
		List<EmployeeEntity>empList = criteria.list();
		for (EmployeeEntity empl : empList) {
			
			System.out.println(empl.getId()+"\t"+empl.getName()+"\t"+empl.getSalary()+"\t"+empl.getDeptId());
			
		}
	}

}
