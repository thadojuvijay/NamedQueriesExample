package com.ecil.HibernateNamedQueriesExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="EMP_TBLE",schema="BMS")
@NamedQueries(
		{@NamedQuery(name="DisplayAllRecords",query="from com.ecil.HibernateNamedQueriesExample.Employee"),@NamedQuery(name="salaryRecords",query="from com.ecil.HibernateNamedQueriesExample.Employee where salary=?")})
public class Employee 
{
	
	
	
	@Id
private Integer eno;
private String name;
private  Double salary;




public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
}
