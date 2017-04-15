package com.ecil.HibernateNamedQueriesExample;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class EmployeeDao
{
//public List<Employee> getEmployeeDetails()
	public static void main(String[] args) 
	
	{

	Session session = HibernateUtility.getSession();
	Query namedQuery = session.createNamedQuery("DisplayAllRecords");
	
	List<Employee> employeeList = namedQuery.getResultList();
	for (Employee employee : employeeList) 
	{
		System.out.println(employee.getEno()+ ""+ employee.getName()+" "+employee.getSalary());
	}
	
	
	session.close();
	
	
}
	}
