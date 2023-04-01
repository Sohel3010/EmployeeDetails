package com.employee.EmployeeDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.empDetailsDao.EmpDetailsDao;
import com.empDetailsDao.EmpDetailsDaoImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/employee/EmployeeDetails/empdetails.xml");
		EmpDetailsDao S1 = con.getBean("emp3", EmpDetailsDaoImpl.class);

		// inserted

		/*
		 * EmpDetails ED= new EmpDetails(); ED.setId(1002); ED.setName("Shaikh Parvej");
		 * ED.setGender("Male"); ED.setEmail("parvej@123");
		 * ED.setPassword("parvej@44@@"); ED.setContact("99233300336");
		 * ED.setJobRole("Bussinessman"); ED.setSalary(45000);
		 * 
		 * int result = S1.insert(ED); System.out.println("Information Insrted " +
		 * result);
		 * 
		 */

		// updated

		/*
		 * EmpDetails ED2= new EmpDetails(); ED2.setId(1002);
		 * ED2.setName("Shaikh Sohel"); ED2.setGender("Male");
		 * ED2.setEmail("sohel@123"); ED2.setPassword("sohel@44@@");
		 * ED2.setContact("7378955888"); ED2.setJobRole("Java Developer");
		 * ED2.setSalary(35000);
		 * 
		 * int result2 = S1.update(ED); System.out.println("Information Updated " +
		 * result2);
		 * 
		 */
	}

}
